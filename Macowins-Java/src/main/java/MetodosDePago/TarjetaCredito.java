package MetodosDePago;

import Interfases.IMetodoDePago;
import java.util.*;
import org.javatuples.*;
import base.*;

public class TarjetaCredito implements IMetodoDePago{
	public double coutas;
	
    public TarjetaCredito(int coutas){
		this.coutas = coutas;
	}
	
	
	public double aplicarRecargo(List<Pair<Prenda,Double>> prendas) {
		double recargoInicial = prendas.stream().
				mapToDouble(p -> p.getValue0().precio() * 0.01 * p.getValue1()).sum();
		return Constantes.CoefRecargo.valor() * this.coutas + recargoInicial;		
	}
}
