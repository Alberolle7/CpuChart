package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlgoritmoSFJ  {

	ArrayList<ProgramaSFJ> listaProgramas;
	private int cicle;

	public AlgoritmoSFJ(ArrayList<Programa> listaProgramas) {
		
		for (Iterator iterator = listaProgramas.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			ProgramaSFJ programaSFJ = new ProgramaSFJ(programa);
			this.listaProgramas.add(programaSFJ);
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
			
				programa.addCicleData(cicle, 'x');
				
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

	

}
