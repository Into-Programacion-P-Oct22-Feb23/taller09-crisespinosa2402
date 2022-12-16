/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String serie = "";
        double promedio;

        for (int i = 0; i < promedios.length; i++) {

            promedio = promedios[i];

            if ((promedio >= 9) && (promedio <= 10)) {

                promediosCualitativos[i] = "Excelente";

            } else {
                if ((promedio >= 6) && (promedio <= 8.9)) {

                    promediosCualitativos[i] = "Bueno";

                } else {
                    promediosCualitativos[i] = "Malo";

                }

            }
        }

        for (int i = 0; i < estudiantes.length; i++) {

            serie = String.format("%s%s promedio: %s promedio %s\n", serie,
                    estudiantes[i], promedios[i], promediosCualitativos[i]);

        }

        System.out.printf("%s", serie);

    }

}
