package MetodosDePago;

import Interfases.IMetodoDePago;
import java.util.*;
import org.javatuples.*;
import base.Prenda;

public class Efectivo implements IMetodoDePago{
	public double aplicarRecargo(List<Pair<Prenda,Double>> prendas) {
		return 0;
	}
}
