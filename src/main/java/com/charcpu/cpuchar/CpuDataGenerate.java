package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CpuDataGenerate {

	private ArrayList<Programa> listaProgramas;
	private int quantum;

	private ArrayList<Programa> listaProgramasFcFs;
	private Map<String, String> tablaFcFs;

	public CpuDataGenerate(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;

		generateDataFifo();

	}

	public CpuDataGenerate(ArrayList<Programa> listaProgramas, int quantum) {
		this(listaProgramas);
		this.quantum = quantum;
	}

	public void generateDataFifo() {

		AlgoritmoFcFs algoritmoFcFs = new AlgoritmoFcFs(this.listaProgramas);
		this.listaProgramasFcFs = algoritmoFcFs.getListaProgramas();
		this.tablaFcFs = algoritmoFcFs.getTabla();
	}

}
