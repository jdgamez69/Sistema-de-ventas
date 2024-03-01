
package modelos;


public class Registro {
    private int id;
    private String nombre;
    private String password;
    private String correo;
    
    public Registro(){
        this.id=0;
        this.nombre="";
        this.password="";
        this.correo="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }   
}
