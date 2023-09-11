import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> empleados = new HashMap ();
		
       String nombre = "";
	   final Double DESCUENTO = 0.02;
	   final Double DESCUENTO2= 0.04;
	   final Double DESCUENTO3 = 0.08;
	   final Double DESCUENTO4 = 0.10;
	   
	   while (true) {
		  nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado(o salir para finalizar el registro)");
		  
		  if(nombre.equalsIgnoreCase("salir")) {
			  break;
		  }
		  
		  ArrayList<String> datosEmpleados = ingresarDatos();
		  
		  empleados.put(nombre, datosEmpleados);
		  
		 int estrato = Integer.parseInt(datosEmpleados.get(0));
		 Double saldoActual = Double.parseDouble(datosEmpleados.get(1));
		 
		 if(estrato == 1 || estrato == 2) {
			 saldoActual = saldoActual - (DESCUENTO * saldoActual);
		 }else if (estrato == 3 || estrato == 4) {
			 saldoActual = saldoActual - (DESCUENTO2 * saldoActual);
		 }else if(estrato == 5) {
			 saldoActual = saldoActual - (DESCUENTO3 * saldoActual);
		 }else if(estrato == 6) {
			 saldoActual = saldoActual - (DESCUENTO4 * saldoActual);
		 }
		 
		 datosEmpleados.set(1, String.valueOf(saldoActual));
		 
		 imprimirEmpleado(empleados);
		  
		  
	   }
		
	}
	
	public static  ArrayList<String> ingresarDatos(){
		ArrayList <String> datosEmpleados = new ArrayList();
		
		String estrato = JOptionPane.showInputDialog("Ingrese su estrato");
		int saldoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldoActual"));
		
		datosEmpleados.add(estrato);
		datosEmpleados.add(Integer.toString(saldoActual));
		
		return datosEmpleados;
		
	}
	
	public static void imprimirEmpleado(HashMap <String, ArrayList<String>> empleados){
		System.out.println("Datos de los empleados: ");
		
		for(String nombre : empleados.keySet()) {
			System.out.println("Nombre: " + nombre);
			ArrayList<String> datos = empleados.get(nombre);
			System.out.println("Estrato: " + datos.get(0));
			System.out.println("Saldo Actual Aplicando el Descuento: " + datos.get(1) );
		}
	}
}
