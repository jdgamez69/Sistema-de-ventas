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
import modelos.Producto;

/**
 *
 * @author braya
 */
public class Ctrl_Producto {
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into producto values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio_unitario());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getProcentajeIva());
            consulta.setString(7, objeto.getMarca());
            consulta.setInt(8, objeto.getEstado());
            consulta.setInt(9, objeto.getId_categoria());
            consulta.setInt(10, objeto.getId_proveedor());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }
        return respuesta;
    }
    
    public boolean exiteProducto(String producto) {
        boolean respuesta = false;
        String sql = "select nombre from producto where nombre = '" + producto + "'; ";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
}
