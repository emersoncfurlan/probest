package model;

import java.util.ArrayList;

public class Amostra {
	private int codAmostra;
	private String nome;
	private ArrayList<Double> dados = new ArrayList<Double>();

	public Amostra(String nome, ArrayList<Double> dados) {
		super();
		this.codAmostra = codAmostra+1;
		this.nome = nome;
		this.dados = dados;
	}
	
	@Override
	public String toString() {
		return "Amostra" + nome + " | Dados:" + dados;
	}
	
	public int getCodAmostra() {
		return codAmostra;
	}
	public void setCodAmostra(int codAmostra) {
		this.codAmostra = codAmostra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Double> getDados() {
		return dados;
	}
	public void setDados(ArrayList<Double> dados) {
		this.dados = dados;
	}
	
	
	
}
