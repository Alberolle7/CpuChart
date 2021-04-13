package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlgoritmoFcFs {

	ArrayList<ProgramaFcFs> listaProgramas;
	Map<String, String> tabla = new HashMap<>();
	private int cicle;

	public AlgoritmoFcFs(ArrayList<Programa> listaProgramas) {
		this.listaProgramas=new ArrayList<ProgramaFcFs>();
		
		for (Iterator iterator = listaProgramas.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			this.listaProgramas.add((ProgramaFcFs)programa);
		}
		
	
		run();
	}

	private void run() {

		Collections.sort(listaProgramas);

		 cicle = 0;
		int programCountState = 0;
		
			

		for (Iterator iterator = listaProgramas.iterator();iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			
			

			while (programa.getCicloEntrada() > cicle) {
		
				cicle++;
			}

			programa.setdCicloEntrada(cicle);

			for (int i = 0; i < programa.getCiclos(); i++) {
				tabla.put(programa.getName() + "-" + cicle, "run");
				programa.addCicleData(cicle, 'x');
				cicle++;
			} 
		}
	}
	
	public int getEndCicle() {
		return cicle;
	}

	public ArrayList<ProgramaFcFs> getListaProgramas() {
		return listaProgramas;
	}

	public Map<String, String> getTabla() {
		return tabla;
	}

}
