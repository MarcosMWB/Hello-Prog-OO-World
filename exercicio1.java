public class Obra{
	private String Nome;
	private int numero;
	private double homemHora;
	private int homemAlocado;
	private static int c = 0;

public Obra(String Nome, double homeHora, int homemAlocado){
	this.Nome = Nome;
	this.numero = ++c;
	this.homemHora = homemHora;
	this.homemAlocado = homemAlocado;
}


public void setHomemHora(double v){
		this.homemHora = homemHora;
	
}

public void imprime(){
		System.out.println("x:");
	}

public double calcularRH(){
	return homemHora*homemHora;
}
}
