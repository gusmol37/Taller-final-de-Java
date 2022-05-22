package calculadora;

	/* Importamos la clase Scanner para leer los datos de entrada*/

import java.util.Scanner;

	/* Clase principal */

public class Calculadora {	
	
	/* Métodos de la clase */
		
    public static void main(String[] args) {
        
    	Scanner leer = new Scanner(System.in);
    	
    /* Declaración e inicialización de las variables */
    			
    	 int tipo_de_operacion = 0;
    	 double numeroUno = 0;
    	 double numeroDos = 0;
    	 double resultado = 0;
    	 
    /* Ciclo Do-While para establecer opciones del Menú  */
    			   		
    			do {
    				
    				System.out.println("\n");
    				System.out.println("Seleccione el número según el tipo de operación que desea realizar:");
    				System.out.println(" ");
    				System.out.println("1. Sumar");
    				System.out.println("2. Restar");
    				System.out.println("3. Multiplicar");
    				System.out.println("4. Dividir");  
    				System.out.println("5. Módulo");
    				System.out.println("6. Salir");
    				tipo_de_operacion = leer.nextInt();
    				
    /* Condicional que establece si se ejecuta la entrada de datos para los cálculos según la opción de Menú */
    				
    				if(tipo_de_operacion !=6){
    					
    /* Se usa la coma (,) como separador decimal */
    					
    					System.out.print("Indique el primer valor: ");
    					numeroUno = leer.nextDouble();
    					System.out.print("Indique el segundo valor: ");
    					numeroDos = leer.nextDouble();    					  					
    				}
    				
    /* Ejecución de claculos y muestra de mensajes */ 
    				
    				switch (tipo_de_operacion) { 
    					case 1:
    						tipo_de_operacion = 1;
    						resultado = numeroUno + numeroDos;
    						System.out.println(" ");
    						System.out.println("           ******* El resultado de la suma es: " + resultado + " *******");
    						break;
    						
    					case 2: 
    						tipo_de_operacion = 2;
    						resultado = numeroUno - numeroDos;
    						System.out.println(" ");
    						System.out.println("           ******* El resultado de la resta es: " + resultado + " *******");
    						break;
    						
    					case 3:
							tipo_de_operacion = 3;
							resultado = numeroUno * numeroDos;
							System.out.println(" ");
							System.out.println("           ******* El resultado de la multiplicación es: " + resultado + " *******");
							break;
							
    					case 4:
							tipo_de_operacion = 4;
							
							if (numeroDos == 0) {
								System.out.println(" ");
								System.out.println("       *** La división entre cero no existe. Indique un valor distinto a cero (0) ***");
								break;
							}
							else {								
								resultado = numeroUno / numeroDos;
								System.out.println(" ");
								System.out.println("           ******* El resultado de la división es: " + resultado + " *******");
								break;
							}
							
    					case 5:
							tipo_de_operacion = 5;
							resultado = numeroUno % numeroDos;
							System.out.println(" ");
							System.out.println("           ******* El resultado de la operación es: " + resultado +" *******");
							break;		
					
    				}
    				
    			} while(tipo_de_operacion !=6);
    				
    			System.out.println("          ******* Gracias por usar nuestra app *******");
    			System.out.println(" ");
    			System.out.println("                 *** ¡¡¡ Hasta luego !!! ***");
    	
    }

}
