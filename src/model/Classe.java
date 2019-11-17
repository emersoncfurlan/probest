package util;

public class Classe {

	private double limiteInf;
	private double limiteSup;
	private double limiteMed;
	private int freqAbsoluta;
	private int freqAcumulada;
	private double freqRelativa;
	private double freqRelativaAcm;
	
	
	public Classe(double limiteInf, double limiteSup, double limiteMed, int freqAbsoluta, int freqAcumulada,
			double freqRelativa, double freqRelativaAcm) {
		this.limiteInf = limiteInf;
		this.limiteSup = limiteSup;
		this.limiteMed = limiteMed;
		this.freqAbsoluta = freqAbsoluta;
		this.freqAcumulada = freqAcumulada;
		this.freqRelativa = freqRelativa;
		this.freqRelativaAcm = freqRelativaAcm;
	}


	public double getLimiteInf() {
		return limiteInf;
	}


	public double getLimiteSup() {
		return limiteSup;
	}


	public double getLimiteMed() {
		return limiteMed;
	}


	public int getFreqAbsoluta() {
		return freqAbsoluta;
	}


	public int getFreqAcumulada() {
		return freqAcumulada;
	}


	public double getFreqRelativa() {
		return freqRelativa;
	}


	public double getFreqRelativaAcm() {
		return freqRelativaAcm;
	}


	@Override
	public String toString() {
		return "Classe [limiteInf=" + limiteInf + ", limiteSup=" + limiteSup + ", limiteMed=" + limiteMed
				+ ", freqAbsoluta=" + freqAbsoluta + ", freqAcumulada=" + freqAcumulada + ", freqRelativa="
				+ freqRelativa + ", freqRelativaAcm=" + freqRelativaAcm + "]";
	}
	
}
