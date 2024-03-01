/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Registro;
import vistas.Login;
import vistas.Registrar;


public class controlador implements ActionListener {
    Ctrl_Registro registro = new Ctrl_Registro();
    Registro rg = new Registro();
    Login lg = new Login();
    Registrar registrar = new Registrar();
    
    public controlador (Registrar registrar, Registro rg){
        
        this.registrar = registrar;
        this.rg = rg;
        this.registrar.btn_Registrar.addActionListener(this);
    }
    public void Registrando(){
        rg.setNombre(registrar.txt_Correo.getText());
        rg.setPassword(registrar.Password.getText());
        
        if(registro.Registrar(rg)){
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al Registrar");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registrar.btn_Registrar){
            Registrando();
        }
    }
        

    
    
}
