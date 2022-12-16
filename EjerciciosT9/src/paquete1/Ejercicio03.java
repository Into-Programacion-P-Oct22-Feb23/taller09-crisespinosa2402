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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double mediaAritmetica;
        double segundoValor = 0;

        for (int i = 0; i < arreglo.length; i++) {
            segundoValor = segundoValor + arreglo[i];
        }
        mediaAritmetica = (double) segundoValor / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mediaAritmetica) {
                    //System.out.println(arreglo[i]); Para la comprobacion de 
                    //la cantidad de numeros que corresponde los elementos arriba
                    //de la media
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                if (arreglo[i] < mediaAritmetica) {
                    // System.out.println(arreglo[i]); Para la comprobacion de 
                    //la cantidad de numeros que corresponde los elementos abajo
                    //de la media
                    elementosAbajoMedia = elementosAbajoMedia + 1;
                }

            }

        }
        System.out.println("Los elementos arriba de la media es: "
                + elementosArribaMedia);
        System.out.println("Los elementos abajo de la media es: "
                + elementosAbajoMedia);
    }
}
