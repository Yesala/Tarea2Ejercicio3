package cr.ac.ucenfotec.EjemploComposicion.bl.entidades;

public class Linea {
    private float cantidad;
    private Producto producto;

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Linea() {
    }

    public Linea(float cantidad, Producto producto) {
        setCantidad(cantidad);
        setProducto(producto);
    }

    public float calcularCosto() {
        return (cantidad * producto.getPrecio());
    }


    public String toString() {
        String msg;
        msg = cantidad + "\t";
        msg = msg + producto.getCodigo() + "\t";
        msg = msg + producto.getDescripcion() + "\t";
        msg = msg + producto.getPrecio() + "\t";
        msg = msg + calcularCosto();
        return msg;
    }
}
