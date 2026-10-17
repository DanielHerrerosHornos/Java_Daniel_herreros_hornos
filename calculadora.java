/* ***********************************************************
 * calculadora.class                                         *
 * Copyright 2026 Dani <dani@dani-hplinux>                   *
 * UN programa que pida dos numeros para operarlos, y otro   *
 * para elejir una opcion del menu,al terminar la operacion  *
 * se cierra el programa                                     *
 *************************************************************/
import java.util.Scanner;//biblioteca

public class calculadora {
	
	public static void main (String[] args) {
		
		 
        Scanner teclado = new Scanner(System.in);
		//variables
        System.out.print("Introduce un numero: ");
        int n1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce un numero2: ");
        int n2 = Integer.parseInt(teclado.nextLine());
       
        String menu = """
						1.suma
						2.resta
						3.division
						4.multiplicacion
						""";
       //texto a mostrar
        System.out.print(menu);
        System.out.print("===============================");
        System.out.print("Introduce una opcion del menu: ");
        int n_menu = Integer.parseInt(teclado.nextLine());
        //de 1 al 4 las opciones y una mas para el error
        switch(n_menu){
			case 1 -> System.out.println( n1 + " + " + n2 + '=' +( n1+n2 ));
			case 2 -> System.out.println(n1 + " - " + n2 +'=' +(n1-n2));
			case 3 -> System.out.println(n1 + " / " + n2+ '=' +(n1/n2));
			case 4 -> System.out.println(n1 + " * " + n2 +'=' +(n1*n2));
			default -> System.out.println("syntax error");
        
	}
       teclado.close();
	
    }
}
		
		
	


