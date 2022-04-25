package ar.utn.frbb.tup.retail.model;

public class RetailItem {
    private String NombreProducto;
    private String descripcion;
    private String Marca;
    private String Codigo;
    private int unidades;
    private Double Precio;
    private Categoria categoria;

    public RetailItem(String nombreProducto,Categoria categoria, String descripcion, String marca, String codigo, int unidades, Double precio) {
        this.NombreProducto = nombreProducto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.Marca = marca;
        this.Codigo = codigo;
        this.unidades = unidades;
        this.Precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public void OrdenarPrecio(String nombreProducto, String descripcion, String marca, String codigo, int unidades, Double precio){


    }

    @Override
    public String toString() {
        return "RetailItem{" +
                "NombreProducto='" + NombreProducto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Codigo='" + Codigo + '\'' +
                ", unidades=" + unidades +
                ", Precio=" + Precio +
                ", categoria=" + categoria +
                '}';
    }
}
