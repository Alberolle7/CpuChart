package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CpuDataGenerate {

	private ArrayList<Programa> listaProgramas;
	private int quantum=0;

	private ArrayList<ProgramaFcFs> listaProgramasFcFs;
	private Map<String, String> tablaFcFs;
	private ChartWindow chartWindow;
	private AlgoritmoFcFs algoritmoFcFs;
	private AlgoritmoSFJ algoritmoSFJ;
	private ArrayList<ProgramaSFJ> listaProgramasSFJ;

	public CpuDataGenerate(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
		
	
		String[] args = null;
		
		

		generateDataFcFs();
		generateDataSFJ();
		
		chartWindow = new ChartWindow();
		chartWindow.addFcFsData(listaProgramasFcFs, algoritmoFcFs.getEndCicle());
		
	}

	public CpuDataGenerate(ArrayList<Programa> listaProgramas, int quantum) {
		this(listaProgramas);
		 
	}

	public void generateDataFcFs() {

		 algoritmoFcFs = new AlgoritmoFcFs(this.listaProgramas);
		this.listaProgramasFcFs = algoritmoFcFs.getListaProgramas();

		
	}
	
	public void generateDataSFJ() {
		algoritmoSFJ = new AlgoritmoSFJ(this.listaProgramas);
		this.listaProgramasSFJ = algoritmoSFJ.getListaProgramas();

		
	}

}
