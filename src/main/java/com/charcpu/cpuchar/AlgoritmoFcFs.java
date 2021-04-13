package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlgoritmoFcFs {

	ArrayList<Programa> listaProgramas;
	Map<String, String> tabla = new HashMap<>();

	public AlgoritmoFcFs(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
		run();
	}

	private void run() {

		Collections.sort(listaProgramas);

		int cicle = 0;
		int programCountState = 0;

		for (Iterator iterator = listaProgramas.iterator();iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			
			System.out.println(programa.getName() + "-" + cicle);

			while (programa.getCicloEntrada() > cicle) {
				cicle++;
			}

			programa.setdCicloEntrada(cicle);

			for (int i = 0; i < programa.getCiclos(); i++) {
				tabla.put(programa.getName() + "-" + cicle, "run");
				
				cicle++;
			}
		}
	}

	public ArrayList<Programa> getListaProgramas() {
		return listaProgramas;
	}

	public Map<String, String> getTabla() {
		return tabla;
	}

}
