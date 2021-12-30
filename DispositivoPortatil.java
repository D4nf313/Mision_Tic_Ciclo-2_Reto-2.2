package Retoexterno2;

import java.util.ArrayList;
import java.util.Scanner;

import Reto2.Vehiculo;

public class DispositivoPortatil {
	ArrayList<TelefonoCelular> inv;
public DispositivoPortatil(ArrayList<TelefonoCelular> inv){
	this.inv=inv;
}
	public  void mostrarLista() {
		for (int i = 0; i < inv.size(); i++) {
			if (inv.get(i).getTipo().equalsIgnoreCase("SMARTPHONE")) {
				System.out.println(inv.get(i).toString());
			} else if (inv.get(i).getTipo().equalsIgnoreCase("FLECHA")) {
				System.out.println(inv.get(i).toString());
				
			}
		}
	}

	public void ProcesarComandos(String c) {

		if (c.startsWith("1")) {
			String[] e = c.split(":");
			
			String tipo = e[1];
			String numero = e[2];
			String operador = e[3];
			String conexion = e[4];
			TelefonoCelular t = null;
			if (tipo.equalsIgnoreCase("SMARTPHONE")) {
			t= new Smarthphone(tipo, numero, operador, conexion);
			inv.add(t);

			}
			if (tipo.equalsIgnoreCase("FLECHA")) {
				t= new Flecha(tipo, numero, operador, conexion);
				inv.add(t);

			}
		}
		if (c.startsWith("2")) {
			System.out.println("***Teléfonos Celulares Censados***");
			mostrarLista();
		}

	}

	public static void main(String[] args) {
		ArrayList<TelefonoCelular> lista = new ArrayList<TelefonoCelular>();
		DispositivoPortatil tc= new DispositivoPortatil(lista);
		Scanner entrada = new Scanner(System.in);
		boolean b = true;
		System.out.println("Digite el comando");
		String comando = entrada.nextLine();
		if (comando.startsWith("1" )) {
			tc.ProcesarComandos(comando);
		}else 	if (comando.startsWith("2" )) {
				tc.ProcesarComandos(comando);
			
		} else {
			b = false;

		}
		do {
			System.out.println("Digite el comando");
			String comando2 = entrada.nextLine();
			tc.ProcesarComandos(comando2);
			if (comando2.startsWith("3")) {
				System.out.println("fin del programa");
				b = false;
			}
		} while (b);

	}

}
