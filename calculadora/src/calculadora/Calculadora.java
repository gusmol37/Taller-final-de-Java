package calculadora;

	/* Importamos la clase Scanner para leer los datos de entrada*/

import java.util.Scanner;

	/* Clase principal */

public class Calculadora {	
	
	/* M�todos de la clase */
		
    public static void main(String[] args) {
        
    	Scanner leer = new Scanner(System.in);
    	
    /* Declaraci�n e inicializaci�n de las variables */
    			
    	 int tipo_de_operacion = 0;
    	 double numeroUno = 0;
    	 double numeroDos = 0;
    	 double resultado = 0;
    	 
    /* Ciclo Do-While para establecer opciones del Men�  */
    			   		
    			do {
    				
    				System.out.println("\n");
    				System.out.println("Seleccione el n�mero seg�n el tipo de operaci�n que desea realizar:");
    				System.out.println(" ");
    				System.out.println("1. Sumar");
    				System.out.println("2. Restar");
    				System.out.println("3. Multiplicar");
    				System.out.println("4. Dividir");  
    				System.out.println("5. M�dulo");
    				System.out.println("6. Salir");
    				tipo_de_operacion = leer.nextInt();
    				
    /* Condicional que establece si se ejecuta la entrada de datos para los c�lculos seg�n la opci�n de Men� */
    				
    				if(tipo_de_operacion !=6){
    					
    /* Se usa la coma (,) como separador decimal */
    					
    					System.out.print("Indique el primer valor: ");
    					numeroUno = leer.nextDouble();
    					System.out.print("Indique el segundo valor: ");
    					numeroDos = leer.nextDouble();    					  					
    				}
    				
    /* Ejecuci�n de claculos y muestra de mensajes */ 
    				
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
							System.out.println("           ******* El resultado de la multiplicaci�n es: " + resultado + " *******");
							break;
							
    					case 4:
							tipo_de_operacion = 4;
							
							if (numeroDos == 0) {
								System.out.println(" ");
								System.out.println("       *** La divisi�n entre cero no existe. Indique un valor distinto a cero (0) ***");
								break;
							}
							else {								
								resultado = numeroUno / numeroDos;
								System.out.println(" ");
								System.out.println("           ******* El resultado de la divisi�n es: " + resultado + " *******");
								break;
							}
							
    					case 5:
							tipo_de_operacion = 5;
							resultado = numeroUno % numeroDos;
							System.out.println(" ");
							System.out.println("           ******* El resultado de la operaci�n es: " + resultado +" *******");
							break;		
					
    				}
    				
    			} while(tipo_de_operacion !=6);
    				
    			System.out.println("          ******* Gracias por usar nuestra app *******");
    			System.out.println(" ");
    			System.out.println("                 *** ��� Hasta luego !!! ***");
    	
    }

}
