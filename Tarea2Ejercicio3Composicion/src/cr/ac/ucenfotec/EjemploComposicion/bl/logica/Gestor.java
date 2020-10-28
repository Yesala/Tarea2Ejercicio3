package cr.ac.ucenfotec.EjemploComposicion.bl.logica;

import cr.ac.ucenfotec.EjemploComposicion.bl.entidades.Factura;
import java.util.ArrayList;

public class Gestor {
    private ArrayList<Factura> listaFacturas;

    public Gestor() {
        this.listaFacturas = new ArrayList<>();
    }

    public void guardarFactura(Factura plista){
        this.listaFacturas.add(plista);
    }
}

