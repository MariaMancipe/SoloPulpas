package proyecto.mundo;

import java.util.ArrayList;

public class Pulpa 
{
	//Constantes
	
	public final static String MORA = "Mora";
	
	public final static String MARACUYA = "Maracuya";
	
	public final static String LULO = "Lulo";
	
	public final static String MANGO = "Mango";
	
	public final static String GUAYABA = "Guayaba";
	
	public final static String TOMATE_ARBOL = "Tomate de Árbol";
	
	public final static String MANDARINA = "Mandarina";
	
	public final static String LIMON = "Limón";
	
	public final static String GUANABANA = "Guanabana";
	
	public final static String CURUBA = "Curuba";
	
	public final static String PAPAYA_CHUNKS = "Papaya Chunks";
	
	public final static String MORA_WHOLE = "Mora Whole";
	
	//Atributos
	
	private String sabor;
	
	private double precioCaja;
	
	private int cantidadCajas;
	
	private int cantidadCajasPedidas;
	
	private int codigo;
	
	private ArrayList<Integer> lotes;
	
	//Constructor
	
	public Pulpa( String nSabor, double nPrecioCaja, int nCantidadCajasPedidas ) throws Exception
	{
		sabor = nSabor;
		precioCaja = nPrecioCaja;
		cantidadCajas = 0;
		cantidadCajasPedidas = nCantidadCajasPedidas;
		lotes = new ArrayList<Integer>();
		asignarCodigo();
	}
	
	//Métodos

	public String darSabor() {
		return sabor;
	}

	public void cambiarSabor(String nSabor) {
		sabor = nSabor;
	}

	public double darPrecioCaja() {
		return precioCaja;
	}

	public void cambiarPrecioCaja(double nPrecioCaja) {
		precioCaja = nPrecioCaja;
	}

	public int darCantidadCajas() {
		return cantidadCajas;
	}

	public void cambiarCantidadCajas(int nCantidadCajas) {
		cantidadCajas = nCantidadCajas;
	}

	public int darCantidadCajasPedidas() {
		return cantidadCajasPedidas;
	}

	public void cambiarCantidadCajasPedidas(int nCantidadCajasPedidas) {
		cantidadCajasPedidas = nCantidadCajasPedidas;
	}
	
	public void agregarCantidadCajas( int nCantidadCajas ){
		cantidadCajas += nCantidadCajas;
	}
	
	public int calcularBolsas( int nCajas ){
		if( sabor.equals(MORA_WHOLE))
			return nCajas * 8;
		else
			return nCajas * 12;
	}
	
	public int calcularCajas( int nBolsas ){
		if( sabor.equals(MORA_WHOLE))
			return nBolsas / 8;
		else
			return nBolsas / 12;
	}
	
	public void agregarLote( int nLote )
	{
		lotes.add(nLote);
		//Agregar a base de datos
	}
	
	public void asignarCodigo( ) throws Exception{
		
		if( sabor.equals(CURUBA))
			codigo = 0;
		else if( sabor.equals(MORA))
			codigo = 0;
		else if( sabor.equals(MARACUYA))
			codigo = 0;
		else if( sabor.equals(LULO))
			codigo = 0;
		else if( sabor.equals(MANGO))
			codigo = 0;
		else if( sabor.equals(GUAYABA))
			codigo = 0;
		else if( sabor.equals(TOMATE_ARBOL))
			codigo = 0;
		else if( sabor.equals(MANDARINA))
			codigo = 0;
		else if( sabor.equals(LIMON))
			codigo = 0;
		else if( sabor.equals(GUANABANA))
			codigo = 0;
		else if( sabor.equals(PAPAYA_CHUNKS))
			codigo = 0;
		else if( sabor.equals(MORA_WHOLE))
			codigo = 0;
		else
			throw new Exception( "El sabor que ingreso no existe!");
	}
	
	public double calcularPrecioTotal( ){
		return cantidadCajas*precioCaja;
	}
}
