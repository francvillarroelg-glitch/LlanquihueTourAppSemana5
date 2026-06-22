package org.example;

import data.GestorDatos;
import service.GestionPersonas;
import ui.Menu;

public class Main {

    public static void main(String[] args) {

        GestionPersonas gestion =
                new GestionPersonas();

        GestorDatos.cargarGuias(
                "src/main/resources/guias.csv",
                gestion
        );

        Menu menu = new Menu(gestion);
        menu.iniciar();
    }
}