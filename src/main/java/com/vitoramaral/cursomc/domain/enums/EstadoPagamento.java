package com.vitoramaral.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"Pagamento pendente"),
	QUITADO(2,"Pagamento efetuado"),
	CANCELADO(3,"O pedido foi cancelado");

	private Integer cod;
	private String descricao;
	
	private EstadoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod){
		
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento p : EstadoPagamento.values()) {
			if(cod.equals(p.getCod())) {
				return p;
			}
		}
		
	 throw new IllegalArgumentException("Id inválido: " + cod);
		
	}
	
    
}
