package cr.ac.ucenfotec.EjemploComposicion.bl.entidades;

import java.time.LocalDate;
import java.util.Vector;

public class Factura {

    private String numero;
    private Cliente cliente;
    private LocalDate fecha;
    private Vector detalle;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Vector getDetalle() {
        return detalle;
    }

    public void setDetalle(Vector detalle) {
        this.detalle = detalle;
    }

    public Factura() {
    }

    public Factura(String numero, Cliente cliente) {
        setNumero(numero);
        setCliente(cliente);
        this.fecha = LocalDate.now();
        detalle = new Vector();
    }

    private float calcularSubtotal() {
        Linea lineaDetalle;
        float subtotal;
        subtotal = 0;
        for (int i = 0; i < detalle.size(); i++) {
            lineaDetalle = (Linea) detalle.get(i);
            subtotal = subtotal + lineaDetalle.calcularCosto();
        }
        return subtotal;
    }

    private float calcularImpuesto() {
        float impuesto;
        impuesto = calcularSubtotal() * 13 / 100;
        return impuesto;
    }

    public float calcularTotal() {
        float total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    public void agregarLinea(float cantidad, Producto producto) {
        detalle.add(new Linea(cantidad, producto));
    }

    public String toString() {
        String mensaje;
        Linea lineaD;
        mensaje = "================================" + "\n";
        mensaje = mensaje + "Joyeria la Perla";
        mensaje = mensaje + "\t\t" + "No. " + getNumero() + "\n";
        mensaje = mensaje + "cliente: " + getCliente() + " ";
        mensaje = mensaje + "\t" + fecha + "\n";
        mensaje = mensaje + "------------------------------------------" + "\n";
        mensaje = mensaje + "Cant" + "\t" + "Cód" + "\t" + "Descripción" +
                "\t" + "Precio" + "\t" + "Costo" + "\n";
        for (int i = 0; i < detalle.size(); i++) {
            lineaD = (Linea) detalle.get(i);
            mensaje = mensaje + lineaD.toString() + "\n";
        }
        mensaje = mensaje + "\t\t\t\t" + "----------" + "\n";
        mensaje = mensaje + "\t\t\t" + "subtotal:" + this.calcularSubtotal() + "\n";
        mensaje = mensaje + "\t\t\t" + "impuesto:" + this.calcularImpuesto() + "\n";
        mensaje = mensaje + "\t\t\t" + "total :" + this.calcularTotal() + "\n";
        mensaje = mensaje + "================================" + "\n";
        return mensaje;
    }

}

