package WereHOUSE;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class GestorAlmacenApp {


	public void run() throws FileNotFoundException {
		boolean guardado = false;
		String sino;
		
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;
		final int OPCION_CUATRO=4;
		final int OPCION_CINCO=5;
		int opcion_menu;
		
		
		JOptionPane.showInputDialog(null, "");
		
		
		do {
			opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"------MENU-------\n" + OPCION_UNO + ". primera opcion\n" + OPCION_DOS + ". segunda opcion\n"
							+ OPCION_TRES + ". tercera opcion\n"+ OPCION_CUATRO+". Cuarta opcion\n"+OPCION_CINCO+". Guardar Datos\n" + SALIR + ". Salir\n" + "Elije una de las opciones"));
			
			switch (opcion_menu) {
			case OPCION_UNO:
				JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
				break;
			case OPCION_DOS:
				JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
				break;
			case OPCION_TRES:
				
				
			case OPCION_CUATRO:
				
				
			case OPCION_CINCO:
				PrintWriter writer = new PrintWriter("DatosArticulos/datos.txt");
				
				writer.close();
				JOptionPane.showMessageDialog(null, "Has guardado los datos");
				guardado = true;
				break;
			case SALIR:
				if (guardado == true) {
					JOptionPane.showMessageDialog(null, "Adios, hasta la proxima ");
					System.exit(0);
				} else {
					sino = (JOptionPane.showInputDialog(null, "Quieres guardarlos ahora SI/NO").toLowerCase());
					
					switch (sino) {
					case "si":
						PrintWriter writer2 = new PrintWriter("DatosArticulos/datos.txt");
						
						writer2.close();
						JOptionPane.showMessageDialog(null, "Has guardado los datos");
						guardado = true;
						break;
						
					case "no":
						JOptionPane.showMessageDialog(null, "Cerrando sin guardar...");
						System.exit(0);
					default:
						JOptionPane.showMessageDialog(null, "Error");
						System.exit(0);
						
					}
				}
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != SALIR);
	}
}
