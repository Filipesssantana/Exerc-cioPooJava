package br.com.generation.poo;

//1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.


public class Cliente {
	
	//Atributos --> Vari�veis
	String nome;
	String profissao;
	String endereco;
	int numCadastro;
	
	//M�todos --> verbos --> a��o
	
	void comprar() { 
		System.out.println("O Cliente, " + nome + " est� comprando um produto...");
		}
	void trocar() {
		System.out.println("O cliente, " + nome + " est� insatisfeito e solicita a troca!"); 
		}
	}