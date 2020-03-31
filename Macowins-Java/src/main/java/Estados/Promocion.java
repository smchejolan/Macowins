package Estados;

import Interfases.IEstado;

public class Promocion implements IEstado{
	public double descuento;
	
    public Promocion(int des){
		this.descuento = des;
	}
	
	public double CalcularPrecio(double precio) {
		return precio - this.descuento;
	}
}
