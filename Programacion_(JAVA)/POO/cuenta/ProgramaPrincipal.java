package cuenta;

import java.util.Scanner;

import cuenta.corriente.CuentaCorriente;
import daw.com.Teclado;

public class ProgramaPrincipal {

	public static void mostrarCuentas(CuentaCorriente[] cuentas) {
		for(int i = 0; i < cuentas.length && cuentas[i] != null; i++) {
			System.out.println((i+1) + "º Cuenta: ");
			System.out.println("[" + cuentas[i].mostrarInformacion() + "]");
		}
	}
	
	public static boolean retirarDinero(CuentaCorriente[] cuentas) {
		boolean exito = false;
		String dni = pedirDNI();
		int pos = searchCuentaCorriente(cuentas, dni);
		if (pos != -1) {
			System.out.print("El saldo actual de la cuenta es: ");
			System.out.printf("%.2f", cuentas[pos].getSaldo());
			System.out.print("€.\n");
			double dinero = leerDoble("Introduce la cantidad en Euros a retirar: ");
			if (dinero > 0.0 && dinero < cuentas[pos].getSaldo()) {
				cuentas[pos].retirar(dinero);
				System.out.println("Operación realizada con éxito :)");
				System.out.print("Su saldo actual en la cuenta es: ");
				System.out.printf("%.2f", cuentas[pos].getSaldo());
				System.out.print("€.\n");
				exito = true;
			}  else if (dinero > cuentas[pos].getSaldo()) {
				System.out.println("Lo sentimos mucho, pero la operación que desea realizar supera su saldo actual (" + cuentas[pos].getSaldo() + "€).");
			} else {
				System.out.println("Error, no puede introducir una cantidad inferior a 0€.");
			}
		} else {
			System.out.println("No existe ninguna cuenta asignada al DNI: " + dni + " :(");
		}
		return exito;
	}
	
	public static void mostrarBusquedaCuenta(CuentaCorriente[] cuentas) {
		String aBuscar = pedirDNI();
		int resultado = searchCuentaCorriente(cuentas, aBuscar);
		if(resultado != -1) {
			System.out.println("¡Búsqueda realizada con éxito! :)");
			System.out.println("Datos de la cuenta:");
			System.out.println(cuentas[resultado].mostrarInformacion());	
		} else {
			System.out.println("No existe ninguna cuenta asignada al DNI: " + aBuscar + " :(");
		}
	}
	
	public static String pedirDNI () {
		return Teclado.leerString("Introduce el DNI del titular de la cuenta: ");
	}
	
	public static void mostrarEliminarCuenta(CuentaCorriente[] cuentas) {
		boolean eliminada;
		String aEliminar = pedirDNI();
		eliminada = deleteCuenta(cuentas, aEliminar);
		if (!eliminada) {
			System.out.println("No existe la cuenta que desas eliminar.");
		} else {
			System.out.println("Cuenta eliminada con éxito.");
		}
	}
	
	public static boolean ingresarDinero(CuentaCorriente[] cuentas) {
		boolean exito = false;
		String dni = pedirDNI();
		int pos = searchCuentaCorriente(cuentas, dni);
		if (pos != -1) {
			System.out.print("El saldo actual de la cuenta es: ");
			System.out.printf("%.2f", cuentas[pos].getSaldo());
			System.out.print("€.\n");
			double dinero = leerDoble("Introduce la cantidad en Euros a ingresar: ");
			if (dinero > 0.0 && dinero < 10000.0) {
				cuentas[pos].ingresar(dinero);
				System.out.println("Operación realizada con éxito :)");
				System.out.print("Su saldo actual en la cuenta es: ");
				System.out.printf("%.2f", cuentas[pos].getSaldo());
				System.out.print("€.\n");
				exito = true;
			}  else if (dinero > 10000.0) {
				System.out.println("Lo sentimos mucho, pero la operación que desea realizar excede el límite de ingreso (10.000€).");
			} else {
				System.out.println("Error, no puede introducir una cantidad inferior a 0€.");
			}
		} else {
			System.out.println("No existe ninguna cuenta asignada al DNI: " + dni + " :(");
		}
		return exito;
	}
	
	public static void selectorMenu(int opcion, CuentaCorriente[] cuentas) {
		switch(opcion) {
		case 1:	
			addCuenta(cuentas);
			break;
		case 2:
			mostrarBusquedaCuenta(cuentas);
			break;
		case 3:
			mostrarEliminarCuenta(cuentas);
			break;
		case 4:
			mostrarCuentas(cuentas);
			break;
		case 5:
			ingresarDinero(cuentas);
			break;
		case 6:
			retirarDinero(cuentas);
			break;
		case 7:
			mostrarSaldo(cuentas);
		default:
			break;
		}
	}
	
	public static void mostrarSaldo(CuentaCorriente cuentas[]) {
		String dni = pedirDNI();
		int pos = searchCuentaCorriente(cuentas, dni);
		System.out.print("El saldo actual de la cuenta es: ");
		System.out.printf("%.2f", cuentas[pos].getSaldo());
		System.out.print("€.");
	}
	
	public static void menuPrincipal(CuentaCorriente cuentas[]) {
		int opcion = 0;
		System.out.println("Bienvenido a su banco de confianza :)");
		do {
			System.out.println("""
					Por favor, seleccione una de las siguientes opciones:
					1) Añadir Cuenta Corriente.
					2) Buscar Cuenta Corriente.
					3) Eliminar Cuenta Corriente.
					4) Mostrar todas las Cuentas
					5) Ingresar dinero
					6) Retirar dinero
					7) Mostrar saldo
					8) Salir.
					""");
			opcion = Teclado.leerInt();
			if (opcion < 1 || opcion > 8) {
				System.out.println("Error. Introduce una opción válida.");
			} else {
				selectorMenu(opcion, cuentas);
			}
		} while(opcion != 7);
	}
	
	public static int countCuentas(CuentaCorriente[] cuentas) {
		int cantidad = 0;
		int pos = 0;
		while(cuentas[pos] != null) {
			if (cuentas[pos] != null) {
				cantidad++;
			}
			pos++;
		}
		return cantidad;
	}
	
	public static int ultimaPosicionLibre(CuentaCorriente[] cuentas, int desde) {
		int pos = desde+1;
		while(cuentas[pos] != null) {
			pos++;
		}
		return pos-1;
	}
	
	public static double leerDoble(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(mensaje);
		return teclado.nextDouble();
	}
	
	public static void addCuenta(CuentaCorriente[] cuentas) {
		int cantidad = Teclado.leerInt("Introduce el número de cuentas a crear: ");
		int desde = countCuentas(cuentas);
		String nombre ="", dni = "";
		for(int i = desde; i < cantidad+desde && i < cuentas.length; i++) {
			nombre = Teclado.leerString((i+1) + "-Nombre del titular: ");
			dni = Teclado.leerString((i+1) + "-DNI: ");
			System.out.println();
			cuentas[i] = new CuentaCorriente(dni, nombre);
		}
	}
	
	public static boolean deleteCuenta(CuentaCorriente[] cuentas, String dni) {
		int pos = searchCuentaCorriente(cuentas, dni);
		if (pos != -1) {
			cuentas[pos] = null;
			moverCuentas(cuentas, pos);
		} else {
			return false;
		}
		return true;
	}
	
	public static void moverCuentas(CuentaCorriente[] cuentas, int pos) {
		int ultima = ultimaPosicionLibre(cuentas, pos);
		CuentaCorriente aux = new CuentaCorriente(cuentas[ultima].getDni(), cuentas[ultima].getTitular());
		cuentas[ultima] = null;
		cuentas[pos] = aux;
	}
	
	public static int searchCuentaCorriente(CuentaCorriente[] cuentas, String dni) {
		int posicion = -1;
		for(int i = 0; i < cuentas.length && cuentas[i] != null; i++) {
			if (cuentas[i].getDni().equals(dni)) {
				posicion = i;
				return posicion;
			}
		}
		return posicion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1º Declarar array de cuentas corrientes
		 *2º añadir una cuenta corriente
		 *3º Buscar cuenta corriente
		 *4º Eliminar cuenta corriente
		 *
		 *Si eliminamos una cuenta, movemos la ultima a esa posicion
		 *y ponemos null en la ultima, para no dejar huecos.
		 *Tenemos que contar las cuentas que tenemos
		 * */
		CuentaCorriente[] cuentas = new CuentaCorriente[100];
		menuPrincipal(cuentas);
		System.out.println("Programa finalizado.");
		//System.out.println("¿Cuantas cuentas vas a agregar? ");
		//	int cantidad = Teclado.leerInt();
		//Teclado.leerString("Introduce el DNI del titular perteneciente a la cuenta: ");
	}

}
