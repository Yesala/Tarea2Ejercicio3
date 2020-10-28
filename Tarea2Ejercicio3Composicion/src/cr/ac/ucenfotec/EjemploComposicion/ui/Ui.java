package cr.ac.ucenfotec.EjemploComposicion.ui;

import java.io.PrintStream;
import java.util.Scanner;

/** @author Yensy Salazar Jiménez
 * Clase interfaz del usuario. */
public class Ui {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /** Método imprime mensajes y textos*/
    public void imprimir(String mensaje){
        output.println(mensaje);
    }

    /** Método ingresar String*/
    public String leerTexto(){
        return input.next();
    }

    /**Método ingresar números tipo int*/
    public int leerEntero(){
        return input.nextInt();
    }

    /**Método ingresar números tipo float*/
    public float leerFloat(){
        return input.nextFloat();
    }

}
