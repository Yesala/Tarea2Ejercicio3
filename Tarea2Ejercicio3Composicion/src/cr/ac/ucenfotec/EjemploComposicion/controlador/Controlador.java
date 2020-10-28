package cr.ac.ucenfotec.EjemploComposicion.controlador;

import cr.ac.ucenfotec.EjemploComposicion.bl.entidades.Cliente;
import cr.ac.ucenfotec.EjemploComposicion.bl.entidades.Factura;
import cr.ac.ucenfotec.EjemploComposicion.bl.entidades.Producto;
import cr.ac.ucenfotec.EjemploComposicion.bl.logica.Gestor;
import cr.ac.ucenfotec.EjemploComposicion.ui.Ui;

import java.time.*;

public class Controlador {

    private Ui ui = new Ui();
    private Gestor gestor = new Gestor();

    public void crearFactura() {
        LocalDate fechaNacimiento = LocalDate.parse("1976-09-20");
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        Cliente cliente = new Cliente("Georgina Jiménez Quiros", "3-333-333", "femenino", fechaNacimiento, edad);
        Producto producto = new Producto("88888", "Cama Matrimonial", 100500);
        Producto otroProducto = new Producto("12345", "Sábanas", 18500);
        Factura nuevaFactura = new Factura("A401", cliente);
        nuevaFactura.agregarLinea(1, producto);
        nuevaFactura.agregarLinea(1, otroProducto);
        ui.imprimir(nuevaFactura.toString());
        gestor.guardarFactura(nuevaFactura);
    }
}


