package br.com.generation.poo;

//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.


public class Cliente {
	
	//Atributos --> Variáveis
	String nome;
	String profissao;
	String endereco;
	int numCadastro;
	
	//Métodos --> verbos --> ação
	
	void comprar() { 
		System.out.println("O Cliente, " + nome + " está comprando um produto...");
		}
	void trocar() {
		System.out.println("O cliente, " + nome + " está insatisfeito e solicita a troca!"); 
		}
	}