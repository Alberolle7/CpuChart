package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlgoritmoSFJ  {

	ArrayList<ProgramaSFJ> listaProgramas;
	Map<String, String> tabla = new HashMap<>();
	private int cicle;

	public AlgoritmoSFJ(ArrayList<Programa> listaProgramas) {
		
		for (Iterator iterator = listaProgramas.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			this.listaProgramas.add((ProgramaSFJ)programa);
		}
		run();
	}

	private void run() {

		Collections.sort(listaProgramas);
		
		cicle = 0;
		

		for (Iterator iterator = listaProgramas.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			
			while (programa.getCicloEntrada() > cicle) {

				cicle++;
			}

			programa.setdCicloEntrada(cicle);

			for (int i = 0; i < programa.getCiclos(); i++) {
				tabla.put(programa.getName() + "-" + cicle, "run");
				programa.addCicleData(cicle, 'x');
				System.out.println(cicle+"-"+programa.getName());
				cicle++;
			}
		}
	}

	public int getEndCicle() {
		return cicle;
	}

	public ArrayList<ProgramaSFJ> getListaProgramas() {
		return listaProgramas;
	}

	public Map<String, String> getTabla() {
		return tabla;
	}

}
