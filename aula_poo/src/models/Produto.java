package models;

public class Produto {

	private int ID;
	private String nome;
	private double valor;
	private int unidades;
	private String descricao;
	
	
	private static int contador =0;
	
	public Produto() {
		this.ID = ++contador;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getID() {
		return ID;
	}
	
	
	
}

