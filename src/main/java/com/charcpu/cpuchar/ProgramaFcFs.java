package com.charcpu.cpuchar;

public class ProgramaFcFs extends Programa implements Comparable<Programa> {

	public ProgramaFcFs(String name, int ciclos, int cicloEntrada) {
		super(name, ciclos, cicloEntrada);
		
	}

	@Override
    public int compareTo(Programa another) {
		
        if (this.getCicloEntrada()>another.getCicloEntrada()){
            return -1;
        }else{
            return 1;
        }
      
    }

}
