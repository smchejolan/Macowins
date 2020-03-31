package Estados;

import Interfases.IEstado;

public class Liquidacion implements IEstado {
	public double CalcularPrecio(double precio) {
		return precio * 0.5;
	}
}
