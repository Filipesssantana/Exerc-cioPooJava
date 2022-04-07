package br.com.generation.poo;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao av = new Aviao();
		
		av.destino = "Dubai";
		av.empresa = "Fly Emirates";
		av.localInicio = "São Paulo";
		av.aeroporto = "Aéroporto de Guarulhos";
		av.partida = "O avião está decolando...";
		av.chegada = "O avião está pousando...";
		av.capacidade = 850;
		av.velocidade = 0;
		av.subirVoo(0);
		
		
		System.out.println("A empresa aérea é: " + av.empresa);
		System.out.println("A partida inical é de: " + av.localInicio);
		System.out.println("O local de partida é: " + av.aeroporto);
		System.out.println("O destino final é: " + av.destino);
		System.out.println("A capacidade máxima é de: " + av.capacidade + " passageiros");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		av.subirVoo(90);
		System.out.println(av.partida);
		System.out.println("A velocidade atual é " + av.velocidade + " Km/h");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		av.descerVoo(50);
		System.out.println(av.chegada);
		System.out.println("A velocidade atual é " + av.velocidade + " Km/h");
		
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("Senhoras e senhores chegamos em " + av.destino);
	}
}