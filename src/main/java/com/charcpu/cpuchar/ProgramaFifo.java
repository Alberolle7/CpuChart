package com.charcpu.cpuchar;

public class ProgramaFifo extends Programa {

	public ProgramaFifo(String name, int ciclos, int cicloEntrada) {
		super(name, ciclos, cicloEntrada);
		
	}
	
	@Override
    public int compareTo(Programa another) {
        if (this.getCicloEntrada()<another.getCicloEntrada()){
            return -1;
        }else{
            return 1;
        }
    }

}
