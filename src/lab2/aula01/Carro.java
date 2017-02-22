package lab2.aula01;

public class Carro {
	private String placa;
	private String fabricante;
	private String modelo;
	private String cor;
	private int numPortas;
	private int numRodas;
	private double kmRodados;
	private String combustivel;
	private double consumoLitrosPorKm;
	private double cicloRevisaoKm;
	private double kmAteProximaRevisao;
	private double autonomiaLitros;
	
	public String getCombustivel() {
		return this.combustivel;
	}

	public double estimarConsumo(double distanciaKm) {
		return distanciaKm / this.consumoLitrosPorKm;
	}
	
	public boolean podePercorrerSemAbastecer(double distanciaKm) {
		return this.estimarConsumo(distanciaKm) < this.autonomiaLitros;
	}

	public void rodar(double km) {
		this.kmRodados += km;
		this.kmAteProximaRevisao -= km;
	}	

	public boolean requerRevisao() {
		return this.kmAteProximaRevisao <= 0.0;
	}

	public void revisaoRealizada() {
		this.kmAteProximaRevisao = this.cicloRevisaoKm;
	}
}
