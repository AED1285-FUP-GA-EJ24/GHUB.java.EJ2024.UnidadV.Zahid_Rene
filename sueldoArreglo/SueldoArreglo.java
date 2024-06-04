package sueldoArreglo;

import java.util.Scanner;

public class SueldoArreglo {

    public void Sueldo() {
        Scanner teclado=new Scanner();
        int N;
        double salarioActual[], nuevoSalario[], aumento[] = new double[N];
        System.out.print("¿cuántos empleados capturara?");
        N=teclado.nextInt();

        for(int i=0;i<N;i++){
            System.out.println("Ingrese el salario actual del empleado (debe ser un número positivo): ");
            salarioActual = teclado.nextDouble();


            if (salarioActual <= 9000) {
                aumento = 0.2; 
            } else if (salarioActual <= 15000) {
                aumento = 0.1; 
            } else if (salarioActual <= 20000) {
                aumento = 0.05; 
            } else {
                aumento = 0; 
            }
        }
    }
}