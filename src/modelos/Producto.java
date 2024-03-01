package modelos;

public class Producto {

    private int id_producto;
    private String nombre;
    private int cantidad;
    private double precio_unitario;
    private String descripcion;
    private int procentajeIva;
    private String marca;
    private int estado;
    private int id_categoria;
    private int id_proveedor;

    public Producto() {
        this.id_producto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio_unitario = 0.0;
        this.descripcion = "";
        this.procentajeIva = 0;
        this.marca = "";
        this.estado = 0;
        this.id_categoria = 0;
        this.id_proveedor = 0;
    }

    public Producto(int id_producto, String nombre, int cantidad, double precio_unitario, String descripcion, int procentajeIva, String marca, int estado, int id_categoria, int id_proveedor) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.descripcion = descripcion;
        this.procentajeIva = procentajeIva;
        this.marca = marca;
        this.estado = estado;
        this.id_categoria = id_categoria;
        this.id_proveedor = id_proveedor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getProcentajeIva() {
        return procentajeIva;
    }

    public void setProcentajeIva(int procentajeIva) {
        this.procentajeIva = procentajeIva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
}
