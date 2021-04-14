package com.charcpu.cpuchar;

public class ProgramaFcFs extends Programa implements Comparable<ProgramaFcFs>  {

	public ProgramaFcFs(String name, int ciclos, int cicloEntrada) {
		super(name, ciclos, cicloEntrada);
		
	}
	
	public ProgramaFcFs(Programa programa) {
		super(programa.getName(), programa.getCiclos(), programa.getCicloEntrada());
		
	}

	@Override
    public int compareTo(ProgramaFcFs another) {
		
        if (this.getCicloEntrada()<another.getCicloEntrada()){
            return -1;
        }else{
            return 1;
        }
      
    }

}
