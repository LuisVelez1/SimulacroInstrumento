import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario el tamaño de los arreglos
		        System.out.print("Ingrese la longitud de los arreglos: ");
		        int longitud = scanner.nextInt();

		        // Crear los arreglos ingresados por el usuario
		        int[] arreglo1 = new int[longitud];
		        int[] arreglo2 = new int[longitud];

		        // Ingresar valores para el primer arreglo
		        System.out.println("Ingrese valores para el primer arreglo:");
		        for (int i = 0; i < longitud; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            arreglo1[i] = scanner.nextInt();
		        }

		        // Ingresar valores para el segundo arreglo
		        System.out.println("Ingrese valores para el segundo arreglo:");
		        for (int i = 0; i < longitud; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            arreglo2[i] = scanner.nextInt();
		        }

		        // Calcular la suma de los arreglos
		        int[] suma = new int[longitud];
		        for (int i = 0; i < longitud; i++) {
		            suma[i] = arreglo1[i] + arreglo2[i];
		        }

		        // Imprimir el arreglo suma
		        System.out.print("Arreglo suma: ");
		        for (int i = 0; i < longitud; i++) {
		            System.out.print(suma[i] + " ");
		        }

		        scanner.close();
		    }
		}
		

