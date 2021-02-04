package fit.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

	public static <T> List<T> sort(List<T> names, Comparator<T> comp) {
		List<T> listaOrdenada = new ArrayList<>(List.copyOf(names));
		listaOrdenada.sort(comp);
		return listaOrdenada;
	}
}
