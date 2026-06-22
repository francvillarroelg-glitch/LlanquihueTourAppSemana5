package data;

import model.Direccion;
import model.GuiaTuristico;
import service.GestionPersonas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorDatos {

    public static void cargarGuias(String ruta,
                                   GestionPersonas gestion) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                GuiaTuristico guia =
                        new GuiaTuristico(
                                datos[0],
                                datos[1],
                                datos[2],
                                datos[3],
                                new Direccion("Sin Calle", datos[4]),
                                datos[5],
                                Integer.parseInt(datos[6])
                        );

                gestion.agregarGuia(guia);
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        } catch (NumberFormatException e) {
            System.out.println("Error en datos numéricos.");
        }
    }
}