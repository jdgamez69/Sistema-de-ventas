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
import modelos.Categoria;

/**
 *
 * @author braya
 */
public class Ctrl_Categoria {
        public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getTipo_categoria());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean exiteCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select tipo_categoria from categoria where tipo_categoria = '" + categoria + "'; ";
        Statement st;
        
        
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e);
        }
        return respuesta;
    }
    public boolean actualizar(Categoria objeto, int id_categoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update categoria set tipo_categoria=? where id_categoria ='"+ id_categoria + "'");
            consulta.setString(1, objeto.getTipo_categoria());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria: " + e);
        }
        return respuesta;
    }
    public boolean eliminar(int id_categoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from categoria where id_categoria ='"+ id_categoria + "'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria: " + e);
        }
        return respuesta;
    }
}
