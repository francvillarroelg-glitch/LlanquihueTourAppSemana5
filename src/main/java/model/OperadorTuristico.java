package model;

public class OperadorTuristico extends Persona {

    private String empresa;

    public OperadorTuristico(String nombre,
                             String rut,
                             String telefono,
                             String correo,
                             Direccion direccion,
                             String empresa) {

        super(nombre, rut, telefono, correo, direccion);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }
}