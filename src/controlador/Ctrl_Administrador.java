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
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelos.Registro;

/**
 *
 * @author braya
 */
public class Ctrl_Administrador {
    public boolean loginUser(Registro objeto){
        boolean respuesta = false;
        PreparedStatement ps = null;
        Connection cn = Conexion.conectar();
        ResultSet rs = null;
        String sql = "select * from registros where nombre =? and password =?";
        Statement st;
        try{  
            ps = cn.prepareStatement(sql);
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
                objeto.setId(rs.getInt("Id"));
                objeto.setNombre(rs.getString("nombre"));
                objeto.setPassword(rs.getString("password"));
                objeto.setCorreo(rs.getString("correo"));
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error al iniciar sesion"+ e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion"+e);
        }
        return respuesta;
    }
}
