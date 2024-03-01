
package modelos;

public class Categoria {
    private int id_categoria;
    private String tipo_categoria;
    private int estado;
    
    public Categoria() {
        this.id_categoria = 0;
        this.tipo_categoria = "";
        this.estado = 0;
    }

    public Categoria(int id_categoria, String tipo_categoria, int estado) {
        this.id_categoria = id_categoria;
        this.tipo_categoria = tipo_categoria;
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTipo_categoria() {
        return tipo_categoria;
    }

    public void setTipo_categoria(String tipo_categoria) {
        this.tipo_categoria = tipo_categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
