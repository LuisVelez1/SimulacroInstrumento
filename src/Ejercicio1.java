import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> personas = new HashMap<>();

        int totalPersonas = 0;
        int personasMayoresEdad = 0;
        int personasMenoresEdad = 0;
        String nombre = "";

        while (true) {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre (O escriba salir si no va a ingresar mas nombre)");

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            ArrayList<String> datosPersona = ingresarDatos();

            personas.put(nombre, datosPersona);

            totalPersonas += 1;

            int edad = Integer.parseInt(datosPersona.get(1));

            if (edad >= 18) {
                personasMayoresEdad += 1;
            } else if (edad < 18) {
                personasMenoresEdad += 1;
            }
        }

        imprimirEstadisticas(totalPersonas, personasMayoresEdad, personasMenoresEdad);
        imprimirDatos(personas);
    }

    public static ArrayList<String> ingresarDatos() {
        ArrayList<String> datosPersona = new ArrayList<>(); // Declarar la variable datosPersona

        String documento = JOptionPane.showInputDialog("Ingrese su documento: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        String profesion = JOptionPane.showInputDialog("Ingrese su profesion: ");

        datosPersona.add(documento);
        datosPersona.add(Integer.toString(edad));
        datosPersona.add(profesion);

        return datosPersona;
    }

    public static void imprimirEstadisticas(int totalPersonas, int personasMayoresEdad, int personasMenoresEdad) {
        System.out.println("Total de personas registradas: " + totalPersonas);
        System.out.println("Cantidad de personas ingresadas: " + totalPersonas);
        System.out.println("Cantidad de personas mayores de edad: " + personasMayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + personasMenoresEdad);
    }

    public static void imprimirDatos(HashMap<String, ArrayList<String>> personas) {
        System.out.println("Datos de las personas: ");

        for (String nombre : personas.keySet()) {
            System.out.println("Nombre:" + nombre);
            ArrayList<String> datos = personas.get(nombre);
            System.out.println("Documento: " + datos.get(0));
            System.out.println("Edad: " + Integer.parseInt(datos.get(1)));
            System.out.println("Profesion: " + datos.get(2));
            System.out.println("____________________________");
        }
    }
}
