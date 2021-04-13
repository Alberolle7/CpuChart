package com.charcpu.cpuchar;

public class Programa implements Comparable<Programa> {
	
	private String name;
	private int ciclos;
	private int cicloEntrada;
	private char [] cicleData;
	
	private int dCicloEntrada;
	
	
	public int getdCicloEntrada() {
		return dCicloEntrada;
	}

	public void setdCicloEntrada(int dCicloEntrada) {
		this.dCicloEntrada = dCicloEntrada;
	}

	public Programa(String name, int ciclos, int cicloEntrada)  {
		this.name = name;
		this.ciclos = ciclos;
		this.cicloEntrada = cicloEntrada;
	}
	
	@Override
    public int compareTo(Programa another) {
        if (this.getCicloEntrada()<another.getCicloEntrada()){
            return -1;
        }else{
            return 1;
        }
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
