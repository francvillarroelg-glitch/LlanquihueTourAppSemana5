package model;

public class Tour {

    private String nombre;
    private String destino;
    private double precio;

    public Tour(String nombre,
                String destino,
                double precio) {

        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + destino + " ($" + precio + ")";
    }
}