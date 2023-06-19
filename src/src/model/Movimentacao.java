package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {

	private String descricao;
	
	private Date data;
	
	private Double valor;


	public Movimentacao(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.data = new Date();
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}

	
	@Override
	public String toString() {
		// sobreescrevremos o metodo toString
		
		
		// Aqui eu crio a String dataFormatada, chamo meu metodo estatico DataUtil
		// como valor seleciono this.getData, depois retorno esse this.getData
		// Retorno ele como dataFormatada
		String dataFormatada = DataUtil.converterDateParaDataEHora(this.getData());
		return this.getDescricao() + "\n" + dataFormatada + " - R$" + this.valor;
		// \n barra pra esquerda quebra linha
		// Descriççao
		// Data e Hora - Valor
	}
	
	
	
		
	
	
	
	
	
	
	
	
}