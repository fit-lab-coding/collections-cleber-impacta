package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

	public static Map<String, Boolean> random(int qtdAlunos, int percentual) {
		Map<String, Boolean> lista = new HashMap<String, Boolean>();
		
		
		int bool = (int)Math.ceil(qtdAlunos * (percentual / 100.00));
		for(int x = 0; x < qtdAlunos; x++) {
			lista.put(String.valueOf(x), x < bool ? true: false);
		}
		
		return lista;
	}

}
