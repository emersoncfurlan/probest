package controller.menu;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class resultadoTabela {

	private final StringProperty nomeFuncionalidade = new SimpleStringProperty();
	private final DoubleProperty resultado = new SimpleDoubleProperty();

	public resultadoTabela(String nomeFuncionalidade, Double resultado) {
		super();
		setNomeFuncionalidade(nomeFuncionalidade);
		setResultado(resultado);
//		this.nomeFuncionalidade = new SimpleStringProperty(nomeFuncionalidade);
//		this.resultado = new SimpleDoubleProperty(resultado);
	}

	public StringProperty nomeFuncionalidadeProperty() {
		return nomeFuncionalidade;
	}

	public final String getNomeFuncionalidade() {
		return nomeFuncionalidadeProperty().get();
	}

	public final void setNomeFuncionalidade(String nome) {
		nomeFuncionalidadeProperty().set(nome);
	}

	public DoubleProperty resultadoProperty() {
		return resultado;
	}

	public final Double getResultado() {
		return resultadoProperty().get();
	}

	public final void setResultado(Double resultado) {
		resultadoProperty().set(resultado);
	}

}
