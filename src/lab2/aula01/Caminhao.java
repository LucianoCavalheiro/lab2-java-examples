package lab2.aula01;

public class Caminhao {
	private String placa;
	private String fabricante;
	private String modelo;
	private double kmRodados;
	private double consumoLitrosPorKm;
	private double cicloRevisaoKm;
	private double cargaKg;
	private double autonomiaLitros;
	private double kmAteProximaRevisao;
	

	public String getCombustivel() {
		return "diesel";
	}
	
	public void setCarga(double novaCargaKm) {
		this.cargaKg = novaCargaKm;
	}
	
	public double estimarConsumo(double distanciaKm) {
		return distanciaKm / ( this.consumoLitrosPorKm * Math.max(1.0, this.cargaKg/1000.0));
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
