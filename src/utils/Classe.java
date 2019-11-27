package utils;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Classe {

	private final DoubleProperty limiteInf = new SimpleDoubleProperty();
	private final DoubleProperty limiteSup = new SimpleDoubleProperty();
	private final DoubleProperty limiteMed = new SimpleDoubleProperty();
	private final IntegerProperty freqAbsoluta = new SimpleIntegerProperty();
	private final IntegerProperty freqAcumulada = new SimpleIntegerProperty();
	private final DoubleProperty freqRelativa = new SimpleDoubleProperty();
	private final DoubleProperty freqRelativaAcm = new SimpleDoubleProperty();

	public Classe(double limiteInf, double limiteSup, double limiteMed, int freqAbsoluta, int freqAcumulada,
			double freqRelativa, double freqRelativaAcm) {

		setLimiteInf(limiteInf);
		setLimiteSup(limiteSup);
		setLimiteMed(limiteMed);
		setfreqAbsoluta(freqAbsoluta);
		setfreqAcumulada(freqAcumulada);
		setfreqRelativa(freqRelativa);
		setfreqRelativaAcm(freqRelativaAcm);

	}

	@Override
	public String toString() {
		return "Classe [limiteInf=" + limiteInf + ", limiteSup=" + limiteSup + ", limiteMed=" + limiteMed
				+ ", freqAbsoluta=" + freqAbsoluta + ", freqAcumulada=" + freqAcumulada + ", freqRelativa="
				+ freqRelativa + ", freqRelativaAcm=" + freqRelativaAcm + "]";
	}

	// limiteInf
	public DoubleProperty limiteInfProperty() {
		return limiteInf;
	}

	public final Double getlimiteInf() {
		return limiteInfProperty().get();
	}

	public final void setLimiteInf(Double limiteInf) {
		limiteInfProperty().set(limiteInf);
	}

	// limiteSup
	public DoubleProperty limiteSupProperty() {
		return limiteSup;
	}

	public final Double getlimiteSup() {
		return limiteSupProperty().get();
	}

	public final void setLimiteSup(Double limiteSup) {
		limiteSupProperty().set(limiteSup);
	}

	// limiteMed
	public DoubleProperty limiteMedProperty() {
		return limiteMed;
	}

	public final Double getlimiteMed() {
		return limiteMedProperty().get();
	}

	public final void setLimiteMed(Double limiteMed) {
		limiteMedProperty().set(limiteMed);
	}

	// freqAbsoluta
	public IntegerProperty freqAbsolutaProperty() {
		return freqAbsoluta;
	}

	public final Integer getfreqAbsoluta() {
		return freqAbsolutaProperty().get();
	}

	public final void setfreqAbsoluta(Integer freqAbsoluta) {
		freqAbsolutaProperty().set(freqAbsoluta);
	}

	// freqAcumulada
	public IntegerProperty freqAcumuladaProperty() {
		return freqAcumulada;
	}

	public final Integer getfreqAcumulada() {
		return freqAcumuladaProperty().get();
	}

	public final void setfreqAcumulada(Integer freqAcumulada) {
		freqAcumuladaProperty().set(freqAcumulada);
	}

	// freqRelativa
	public DoubleProperty freqRelativaProperty() {
		return freqRelativa;
	}

	public final Double getfreqRelativa() {
		return freqRelativaProperty().get();
	}

	public final void setfreqRelativa(Double freqRelativa) {
		freqRelativaProperty().set(freqRelativa);
	}

	// freqRelativaAcm
	public DoubleProperty freqRelativaAcmProperty() {
		return freqRelativaAcm;
	}

	public final Double getfreqRelativaAcm() {
		return freqRelativaAcmProperty().get();
	}

	public final void setfreqRelativaAcm(Double freqRelativaAcm) {
		freqRelativaAcmProperty().set(freqRelativaAcm);
	}

}
