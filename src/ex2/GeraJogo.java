package ex2;

import java.util.*;
import java.util.Random;

public class GeraJogo {
	
	private int quant;
	private	List<Integer> lista;
	Random random = new Random();
	
	public List<Integer> getLista() {
		simula();
		return this.lista;
	}
	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	private void simula() {
		this.lista = new ArrayList<>();
		for(int i=0;i<quant;i++) {
			for(int j=0;j<6;j++) {
				int num = random.nextInt(61);
				if(!this.lista.contains(num))
					this.lista.add(num);
				else
					j--;
			}
			
		}
	}
	
}
