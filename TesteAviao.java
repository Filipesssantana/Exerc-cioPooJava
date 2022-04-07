package br.com.generation.poo;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao av = new Aviao();
		
		av.destino = "Dubai";
		av.empresa = "Fly Emirates";
		av.localInicio = "S�o Paulo";
		av.aeroporto = "A�roporto de Guarulhos";
		av.partida = "O avi�o est� decolando...";
		av.chegada = "O avi�o est� pousando...";
		av.capacidade = 850;
		av.velocidade = 0;
		av.subirVoo(0);
		
		
		System.out.println("A empresa a�rea �: " + av.empresa);
		System.out.println("A partida inical � de: " + av.localInicio);
		System.out.println("O local de partida �: " + av.aeroporto);
		System.out.println("O destino final �: " + av.destino);
		System.out.println("A capacidade m�xima � de: " + av.capacidade + " passageiros");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		av.subirVoo(90);
		System.out.println(av.partida);
		System.out.println("A velocidade atual � " + av.velocidade + " Km/h");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		av.descerVoo(50);
		System.out.println(av.chegada);
		System.out.println("A velocidade atual � " + av.velocidade + " Km/h");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("Senhoras e senhores chegamos em " + av.destino);
	}
}