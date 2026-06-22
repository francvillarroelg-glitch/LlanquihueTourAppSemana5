package service;

import model.GuiaTuristico;

import java.util.ArrayList;

public class GestionPersonas {

    private ArrayList<GuiaTuristico> guias;

    public GestionPersonas() {
        guias = new ArrayList<>();
    }

    public void agregarGuia(GuiaTuristico guia) {
        guias.add(guia);
    }

    public void mostrarGuias() {

        for (GuiaTuristico guia : guias) {
            System.out.println(guia);
        }
    }

    public GuiaTuristico buscarPorRut(String rut) {

        for (GuiaTuristico guia : guias) {

            if (guia.getRut().equals(rut)) {
                return guia;
            }
        }

        return null;
    }
}