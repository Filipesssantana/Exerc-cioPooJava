package br.com.generation.poo;

public class ProdutoEletronico {
	
	String marca;
	String modelo;
	String cor;
	double preco;
	int ano;
	
	void sobePreco (double aumento) {
		preco += aumento;
	}
	void descePreco (double reducao) {
		preco -= reducao;
	}
	void atualAno (int aumento) {
		ano += aumento;
	}
	void proximosAnos (int reducao) {
		ano += reducao;
	}
	
}
