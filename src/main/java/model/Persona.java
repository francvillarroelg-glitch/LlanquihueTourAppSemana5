package model;

public class Persona {

    private String nombre;
    private String rut;
    private String telefono;
    private String correo;
    private Direccion direccion;

    public Persona(String nombre,
                   String rut,
                   String telefono,
                   String correo,
                   Direccion direccion) {

        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getRut() { return rut; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public Direccion getDireccion() { return direccion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRut(String rut) { this.rut = rut; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRut: " + rut +
                "\nTelefono: " + telefono +
                "\nCorreo: " + correo +
                "\nDireccion: " + direccion;
    }
}