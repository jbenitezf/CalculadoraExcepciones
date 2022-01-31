import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
		
	}

	public static void menu(Scanner sc) {
		int seguir=-1;
		while(seguir!=0) {
			mostrarMenu();
			int opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					suma(sc);
					break;
				case 2:
					resta(sc);
					break;
				case 3:
					multiplicacion(sc);
					break;
				case 4:
					division(sc);
					break;
				case 5:
					resto(sc);
					break;
				case 6:
					potencia(sc);
					break;
				case 7:
					seno(sc);
					break;
				case 8:
					coseno(sc);
					break;
				case 9:
					tangente(sc);
					break;
				case 10:
					logaritmo(sc);
					break;
				case 0:
					seguir = 1;
					break;
				default:
					System.out.println();
					System.out.println("La opción no es correcta, por favor, intentelo de nuevo");
					System.out.println();
					break;
			}
		}
		
	}
	
	public static void mostrarMenu() {
		System.out.println();
		System.out.println("Introduce una de las siguintes opciones");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("	1.Suma");
		System.out.println("	2.Resta");
		System.out.println("	3.Multiplicación");
		System.out.println("	4.División");
		System.out.println("	5.Resto");
		System.out.println("	6.Potencia");
		System.out.println("	7.Seno");
		System.out.println("	8.Coseno");
		System.out.println("	9.Tangente");
		System.out.println("	10.Logaritmo");
		System.out.println("	0.Salir");
		System.out.println("------------------------------------------");
		System.out.println();
	}
	
	public static void esperar(Scanner sc) {
		System.out.println();
		System.out.println("Pulse 'Enter' para seguir...");
		sc.nextLine();
		String seguir = sc.nextLine();
	}
	public static void suma(Scanner sc) {
		System.out.println("Introduce el primer sumando");
		double num1 = sc.nextInt();
		System.out.println("Introduce el segundo sumando");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la suma: " + (num1+num2));
		System.out.println("------------------------------------------");
		System.out.println();
		esperar(sc);
				
	}
	
	public static void resta(Scanner sc) {
		System.out.println("Introduce el primer número");
		double num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la resta: " + (num1-num2));
		System.out.println("------------------------------------------");
		esperar(sc);
		
	}
	public static void multiplicacion(Scanner sc) {
		System.out.println("Introduce el multiplicando");
		double num1 = sc.nextInt();
		System.out.println("Introduce el multiplicador");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la multiplicacion: " + (num1*num2));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	public static void division(Scanner sc) {
		System.out.println("Introduce el dividendo");
		double num1 = sc.nextInt();
		System.out.println("Introduce el divisor");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la division: " + (num1/num2));
		System.out.println("Resto: "+ (num1%num2));		
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	
	public static void resto(Scanner sc) {
		System.out.println("Introduce el dividendo");
		double num1 = sc.nextInt();
		System.out.println("Introduce el divisor");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resto: " + (num1%num2));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	public static void potencia(Scanner sc) {
		System.out.println("Introduce la base");
		int num1 = sc.nextInt();
		System.out.println("Introduce el exponente");
		int num2 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la potencia: " + (num1^num2));
		System.out.println("------------------------------------------");
		esperar(sc);
		
	}
	
	public static void seno(Scanner sc) {
		System.out.println("Introduce el número para calcular el seno");
		double num1 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado del seno: " + (Math.sin(num1)));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	
	public static void coseno(Scanner sc) {
		System.out.println("Introduce el número para calcular el coseno");
		double num1 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado del coseno: " + (Math.cos(num1)));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	
	public static void tangente(Scanner sc) {
		System.out.println("Introduce el número para calcular el tangente");
		double num1 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado de la tangente: " + (Math.tan(num1)));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
	
	public static void logaritmo(Scanner sc) {
		System.out.println("Introduce el número para calcular el Logaritmo");
		double num1 = sc.nextInt();
		System.out.println("------------------------------------------");
		System.out.println("Resultado del logaritmo: " + (Math.log(num1)));
		System.out.println("------------------------------------------");
		esperar(sc);
	}
}
