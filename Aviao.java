package br.com.generation.poo;

public class Aviao {
	
	String empresa;
	String destino;
	String aeroporto;
	String localInicio;
	String partida;
	String chegada;
	int capacidade;
	int velocidade;
	
	void subirVoo (int aceleracao) {
		velocidade += aceleracao;
	}
	void descerVoo (int reduzir) {
		velocidade -= reduzir;
	}
}
