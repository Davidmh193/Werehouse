package WereHOUSE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Almacen {
	ArrayList<Articulo> articuloLista;
	public Almacen(){
		articuloLista=new ArrayList<Articulo>();
	}
	public void cargarDatos() throws FileNotFoundException {
		File file=new File("DatosArticulos/datos.txt");
		Scanner scan=new Scanner(file);
		
		while(scan.hasNextLine()) {
			partes=scan.nextLine().split(";");
			
			if(partes[2].toLowerCase().equals("refresco"))
			Refresco refresco=new Refresco(partes[0], partes[1], partes[2], partes[3],Integer.parseInt(partes[4]), Double.parseDouble(partes[5]), Integer.parseInt(partes[6]), partes[7], zumo, gaseoso,Integer.parseInt(partes[10]));
				articuloLista.add(refresco);
				
			}else if(partes[0].toLowerCase().equals("vino")) {
				Vino vino=new Vino(partes[0], partes[1], partes[2], partes[3],Integer.parseInt(partes[4]), Double.parseDouble(partes[5]), Integer.parseInt(partes[6]), partes[7], partes[8], Integer.parseInt(partes[9]), partes[10], Double.parseDouble(partes[11]));
				articuloList.add(vino);
			}else if(partes[0].toLowerCase().equals("cerveza")){
				Cerveza cerveza=new Cerveza(partes[0], partes[1], partes[2], partes[3],Integer.parseInt(partes[4]), Double.parseDouble(partes[5]), Integer.parseInt(partes[6]), partes[7], partes[8], Double.parseDouble(partes[9]));
				articuloList.add(cerveza);
			
			}
		}scan.close();
	}

	
	public Articulo elMasCaro() {
		double precio=0.0;
		Articulo caro = null;
		for(Articulo art:articuloList) {
			if(art.getPrecio()>precio) {
				precio=art.getPrecio();
				caro=art;
			}
		}
		return caro;
	}

	public double precio(String codigoProducto) {
		return 0;
	}
	public boolean hayStock(String codigoProducto) {
		return false;
	}
	public ArrayList<Articulo> stockJusto() {
		ArrayList<Articulo> stockJusto= new ArrayList();
		for (Articulo articulo : stockJusto) {
			
		
			
		}
		return stockJusto;
		
	}
	public Articulo articulo(String codigoProducto) {
		Articulo x =null;
		
		return x;	
	}
	public boolean disponibilidad(int cantidad, String codigoProducto ) {
		return false;
	}
	public ArrayList<Articulo> equivalentes( Articulo articulo) {
		return null;
	}
	public ArrayList<Articulo> ordenarPorPrecio(String orden ) {
	ArrayList y = new ArrayList();
	return y;
	}
	public void ordenarPorStock(String orden ) {
		ArticuloComparadorStock comparador=new ArticuloComparadorStock();
		articuloList.sort(comparador);
	}
}

}
}

