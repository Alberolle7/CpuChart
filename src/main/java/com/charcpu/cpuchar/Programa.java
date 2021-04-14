package com.charcpu.cpuchar;

import java.util.HashMap;

public class Programa   {
	
	protected String name;
	protected int ciclos;
	protected int cicloEntrada;
	protected HashMap<Integer, Character> cicleData = new HashMap<Integer, Character>();
	protected int dCicloEntrada;
	
	
	public Programa(String name, int ciclos, int cicloEntrada)  {
		this.name = name;
		this.ciclos = ciclos;
		this.cicloEntrada = cicloEntrada;
	}
	
	
	public void addCicleData(Integer index, Character data) {
		cicleData.put(index, data);
	}
	public Character getCicleData(Integer index) {
		return cicleData.containsKey(index)? cicleData.get(index):' ';
	}
	

	
	public int getdCicloEntrada() {
		return dCicloEntrada;
	}

	public void setdCicloEntrada(int dCicloEntrada) {
		this.dCicloEntrada = dCicloEntrada;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCiclos() {
		return ciclos;
	}
	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}
	public int getCicloEntrada() {
		return cicloEntrada;
	}
	public void setCicloEntrada(int cicloEntrada) {
		this.cicloEntrada = cicloEntrada;
	}

	
	
	

}
