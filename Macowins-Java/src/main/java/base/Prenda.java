package base;

import Interfases.IEstado;
import base.TipoDePrenda;

public class Prenda {
	public IEstado estado;
	public TipoDePrenda tipo;
	public double precioBase;
	
	public double precio() {
		return estado.CalcularPrecio(precioBase);
	}
}
