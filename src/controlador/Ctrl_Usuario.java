package controlador;

import conexion.Conexion;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Registro;
import vistas.Registrar;

public class Ctrl_Usuario {

    Registro registro;
    Ctrl_Registro consultar_usuario;
    Registrar frmRegistrar;
    Ctrl_Administrador admin;

    private static final String Algoritmo = "AES";
    String original_valor = "mi_clave_oculta";
    public static String remitente = "brayanjosephruedapreciado@gmail.com";
    public static String clave_remitente = "tomvikdizlvkolqy";
    public static String destinatario;
    private String emailTo;
    private String titulo;
    private String contenido;

    private Properties pro;
    private Session session;
    private MimeMessage correo;

    String clave;

    public Ctrl_Usuario(Registro registro, Ctrl_Registro consultar_usuario, Registrar frmRegistrar, Ctrl_Administrador admin) {
        this.registro = registro;
        this.consultar_usuario = consultar_usuario;
        this.frmRegistrar = frmRegistrar;
        this.admin = admin;
    }

    public boolean Guardar(String usuario, String correo, String password) {
        registro.setNombre(usuario);
        registro.setCorreo(correo);
        registro.setPassword(password);
        if (consultar_usuario.Registrar(registro)) {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            return true;
        }
        return false;
    }

    public boolean Login(String usuario, String password) {
        registro.setNombre(usuario);
        registro.setPassword(password);
        if (admin.loginUser(registro)) {
            JOptionPane.showMessageDialog(null, "Usuario Correcto " + usuario);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            return false;
        }
    }

    public SecretKeySpec generarClave(String llave) {
        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(llave.toCharArray(), "salt".getBytes(StandardCharsets.UTF_8), 65536, 128);
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), Algoritmo);
                return secretKeySpec;
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(Ctrl_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Ctrl_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String Encriptar(String valor) {
        try {
            SecretKeySpec secretKeySpec = generarClave(original_valor);
            Cipher cipher = Cipher.getInstance(Algoritmo);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] valorBytes = valor.getBytes(StandardCharsets.UTF_8);
            byte[] encrypeBytes = cipher.doFinal(valorBytes);
            return Base64.getEncoder().encodeToString(encrypeBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Cliente consultaCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Enviar(String usuario) {
        registro.setNombre(usuario);

        if (consultar_usuario.Recuperacion(registro)) {
            destinatario = registro.getCorreo();
            emailTo = destinatario;
            clave = registro.getPassword();
            titulo = "solicitud de Recuperacion de clave";
            contenido = "Tu contraseña es: " + clave;
            pro = new Properties();
            
            pro.put("mail.smtp.host", "smtp.gmail.com");
            pro.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            pro.setProperty("mail.smtp.starttls.enable", "true");
            pro.setProperty("mail.smtp.port", "587");
            pro.setProperty("mail.smtp.user", remitente);
            pro.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            pro.setProperty("mail.smtp.auth", "true");

            session = Session.getDefaultInstance(pro);
            try {
                correo = new MimeMessage(session);
                correo.setFrom(new InternetAddress(remitente));
                correo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
                correo.setSubject(titulo);
                correo.setText(contenido, "ISO-8859-1", "html");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            Send();
            return true;

        }
        return false;
    }

    public void Send() {
        try {
            Transport transport = session.getTransport("smtp");
            transport.connect(remitente, clave_remitente);
            transport.sendMessage(correo, correo.getRecipients(Message.RecipientType.TO));
            transport.close();
            JOptionPane.showMessageDialog(null, "Correo Enviado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
