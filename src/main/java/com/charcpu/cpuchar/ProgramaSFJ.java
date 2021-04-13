package com.charcpu.cpuchar;

public class ProgramaSFJ extends Programa implements Comparable<Programa> {

	public ProgramaSFJ(String name, int ciclos, int cicloEntrada) {
		super(name, ciclos, cicloEntrada);
		
	}

	@Override
    public int compareTo(Programa another) {
		
        if (this.getCiclos()>another.getCiclos()){
            return -1;
        }else{
            return 1;
        }
      
    }

}
