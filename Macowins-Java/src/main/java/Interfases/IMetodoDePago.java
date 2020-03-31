package Interfases;
import java.util.*;
import org.javatuples.*;
import base.Prenda;

public interface IMetodoDePago {
	public double aplicarRecargo(List<Pair<Prenda,Double>> prendas);
}
