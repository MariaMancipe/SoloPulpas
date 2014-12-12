package proyecto.mundo;

import java.util.ArrayList;

public class Contenedor 
{
	//Atributos
	
	public ArrayList<Pulpa> pulpas;
	
	//Constructor
	
	public Contenedor( )
	{
		pulpas = new ArrayList<Pulpa>();
	}
	
	//Métodos
	
	public void agregarPulpa( String nSabor, double nPrecioCaja, int nCantidadCajasPedidas) throws Exception
	{
		Pulpa nueva = new Pulpa(nSabor, nPrecioCaja, nCantidadCajasPedidas);
		pulpas.add(nueva);
		//Agregar a la base de datos
	}
	
	public Pulpa buscarPulpa(String nSabor){
		int tam = pulpas.size();
		for(int i = 0; i<tam; i++){
			Pulpa actual = (Pulpa)pulpas.get(i);
			if( actual.darSabor().equals(nSabor)){
				return actual;
			}
		}
		return null;
	}
	
	public double calcularPrecioTotal( ){
		double total = 0.0;
		int tam = pulpas.size();
		for( int i = 0; i<tam; i++){
			Pulpa actual = (Pulpa) pulpas.get(i);
			total += actual.calcularPrecioTotal();
		}
		return total; 
	}
	
	public int calcularCajasTotal( ){
		int total = 0;
		int tam = pulpas.size();
		for(int i = 0; i<tam; i++){
			Pulpa actual = (Pulpa) pulpas.get(i);
			total += actual.darCantidadCajas();
		}
		return total;
	}
}
