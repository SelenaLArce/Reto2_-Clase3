package Reto2_ Clase3;

public class Principal {
    public static void main(String[] args) {
        // RFC
        Factura facturaConRFC = new Factura(1800.0, "Consultoría", "ABCD012345XYZ");

        // Sin RFC (poner null)
        Factura facturaSinRFC = new Factura(2500.0, "Revisióm", null);

        // Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}