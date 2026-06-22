package model;

public class Proveedor extends Persona {

    private String servicio;

    public Proveedor(String nombre,
                     String rut,
                     String telefono,
                     String correo,
                     Direccion direccion,
                     String servicio) {

        super(nombre, rut, telefono, correo, direccion);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nServicio: " + servicio;
    }
}