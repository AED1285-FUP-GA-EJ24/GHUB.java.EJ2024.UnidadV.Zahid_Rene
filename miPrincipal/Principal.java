package miPrincipal;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("**************************************");
            System.out.println("       MENU DE OPCIONES UNIDAD V      ");
            System.out.println("**************************************");
            System.out.println("* 1) Opcion 1"); 
            System.out.println("* 2) Opcion 1"); 
            System.out.println();
            System.out.println("* 99) Salir"); 
            System.out.println("**************************************");
            System.out.print("Seleccion Opcion:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                   //creo el objeto

                break;
                case 2:
                   //creo el objeto

                break;
            }
        }while(opcion != 99);
    }
}