package Reto2_ Clase3;

import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc; 

    // Constructor: RFC en Optional
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si el RFC está presente, se muestra. 
        // Si el RFC no se muestra, poner mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
