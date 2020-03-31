package base;

import java.util.*;
import org.javatuples.*;
import Interfases.IMetodoDePago;

public class Venta {
	public List<Pair<Prenda,Double>> prendas;
	public IMetodoDePago metodoDePago;
	public Date dia;
	
	public double precioFinal() {
		double precioInicial = prendas.stream().
				mapToDouble(p -> p.getValue0().precio() * p.getValue1()).sum();
		return precioInicial + metodoDePago.aplicarRecargo(prendas);		
	}
}
