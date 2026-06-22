package ui;

import service.GestionPersonas;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private GestionPersonas gestion;

    public Menu(GestionPersonas gestion) {

        this.gestion = gestion;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcion;

        do {

            System.out.println("\n=== LLANQUIHUE TOUR ===");
            System.out.println("1. Mostrar Guias");
            System.out.println("2. Buscar Guia");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    gestion.mostrarGuias();
                    break;

                case 2:

                    System.out.print("Ingrese rut: ");
                    String rut = scanner.nextLine();

                    if (gestion.buscarPorRut(rut) != null) {
                        System.out.println(
                                gestion.buscarPorRut(rut));
                    } else {
                        System.out.println("Guia no encontrado.");
                    }

                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
    }
}