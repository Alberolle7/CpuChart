package com.charcpu.cpuchar;

public class ProgramaSFJ extends Programa implements Comparable<ProgramaSFJ> {

	public ProgramaSFJ(String name, int ciclos, int cicloEntrada) {
		super(name, ciclos, cicloEntrada);
		
	}
	
	public ProgramaSFJ(Programa programa) {
		super(programa.getName(), programa.getCiclos(), programa.getCicloEntrada());
		
	}


	@Override
    public int compareTo(ProgramaSFJ another) {
		
        if (this.getCiclos()<another.getCiclos()){
            return -1;
        }else{
            return 1;
        }
      
    }

}
