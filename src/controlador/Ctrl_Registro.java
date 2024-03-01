/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import modelos.Cliente;
import modelos.Registro;


public class Ctrl_Registro {
    public boolean Registrar(Registro objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into registros values(?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getPassword());
            consulta.setString(4, objeto.getCorreo());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Registro: " + e);
        }
        return respuesta;
    }
   
    public boolean Recuperacion(Registro registro){
        PreparedStatement ps = null;
        Connection cn = Conexion.conectar();
        ResultSet res = null;
        String query=("select * from registros where nombre=?");
        try {
            ps=cn.prepareStatement(query);
            ps.setString(1, registro.getNombre());
            res=ps.executeQuery();
            if(res.next()){
                registro.setId(res.getInt("id"));
                registro.setNombre(res.getString("nombre"));
                registro.setPassword(res.getString("password"));
                registro.setCorreo(res.getString("correo"));
                return true;
            }
            return false;
        }catch(SQLException ex){
           Logger.getLogger(Ctrl_Registro.class.getName()).log(Level.SEVERE, null, ex);
           return false;
        }   
    }
    
    public Cliente consultaCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       }
}
