package com.charcpu.cpuchar;

import java.util.ArrayList;
import java.util.HashMap;

public class Programa   {
	
	private String name;
	private int ciclos;
	private int cicloEntrada;
	private HashMap<Integer, Character> cicleData = new HashMap<Integer, Character>();
	private int dCicloEntrada;
	
	
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
