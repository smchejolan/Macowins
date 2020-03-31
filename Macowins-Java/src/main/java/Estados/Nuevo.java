package Estados;

import Interfases.IEstado;

public class Nuevo implements IEstado{
	public double CalcularPrecio(double precio) {
		return precio;
	}
}
