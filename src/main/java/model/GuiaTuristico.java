package model;

public class GuiaTuristico extends Persona {

    private String especialidad;
    private int experiencia;

    public GuiaTuristico(String nombre,
                         String rut,
                         String telefono,
                         String correo,
                         Direccion direccion,
                         String especialidad,
                         int experiencia) {

        super(nombre, rut, telefono, correo, direccion);

        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "\n=== GUIA TURISTICO ===\n" +
                super.toString() +
                "\nEspecialidad: " + especialidad +
                "\nExperiencia: " + experiencia + " años";
    }
}