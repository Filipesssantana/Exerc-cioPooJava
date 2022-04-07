package br.com.generation.poo;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.marca = "Iphone";
		celular.modelo = "Iphone 8s Plus";
		celular.cor = "Branco";
		celular.preco = 2000.00;
		celular.ano = 2021;
		
		System.out.println("A marca do celular �: " + celular.marca);
		System.out.println("O modelo do celular �: " + celular.modelo);
		System.out.println("A cor do celular �: " + celular.cor);
		celular.sobePreco(100.00);
		celular.atualAno(0);
		System.out.println("O ano de lan�amento do celular �: " + celular.ano);
		System.out.println("O pre�o do celular �: " + celular.preco);
		
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		celular.descePreco(300.00);
		celular.proximosAnos(1);
		System.out.println("O ano atual �: " + celular.ano);
		System.out.println("O pre�o do celular �: " + celular.preco);
		
	}

}
