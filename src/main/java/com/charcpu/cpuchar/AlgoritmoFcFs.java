package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class AlgoritmoFcFs {

	private ArrayList<ProgramaFcFs> listaProgramas = new ArrayList<ProgramaFcFs>();
	
	private int cicle;

	public AlgoritmoFcFs(ArrayList<Programa> listaProgramas) {
	
		
		for (Iterator iterator = listaProgramas.iterator(); iterator.hasNext();) {
			Programa programa = (Programa) iterator.next();
			ProgramaFcFs programaFcFs= new ProgramaFcFs(programa);
			this.listaProgramas.add(programaFcFs);
		}
		
	
		run();
	}

	private void run() {

		Collections.sort(listaProgramas); 

		 cicle = 0;
	
		for (Iterator iterator = listaProgramas.iterator();iterator.hasNext();) {
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

	public ArrayList<ProgramaFcFs> getListaProgramas() {
		return listaProgramas;
	}



}
