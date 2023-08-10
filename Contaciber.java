/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaciber;

import java.util.Scanner;

/**
 *
 * @author formacio
 */
public class Contaciber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        int nuevoNumFactura = 0;
        //String[] numFacturas = {"ES001","EU096","ER129","IN734"};
        int[] numFacturas = {1,96,129,734};
        
        //segun la opcion de factura que indique el usuario se incrementara un numero o otro
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Que tipo de factura deseas?\n"
                    + "1. Española\n"
                    + "2. Europea sin ROI\n"
                    + "3. Europea con ROI\n"
                    + "4. Internacional\n"
                    + "0. Salir");
            opcion = entrada.nextInt();
            
            if(opcion != 0){
                nuevoNumFactura = ++numFacturas[(opcion - 1)];
                System.out.println("El próximo numero de factura és " + nuevoNumFactura);
            }
            
            /*switch(opcion){
                case 1:
                    nuevoNumFactura = ++numFacturas[0];
                    break;
                case 2:
                    nuevoNumFactura = ++numFacturas[1];
                    break;
                case 3:
                    nuevoNumFactura = ++numFacturas[2];
                    break;
                case 4:
                    nuevoNumFactura = ++numFacturas[3];
                    break;
            }*/

            
        
        }while(opcion != 0);
        
        System.out.println("Adios");
    }
    
}
