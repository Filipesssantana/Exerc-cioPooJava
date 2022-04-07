package br.com.generation.poo;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.marca = "Iphone";
		celular.modelo = "Iphone 8s Plus";
		celular.cor = "Branco";
		celular.preco = 2000.00;
		celular.ano = 2021;
		
		System.out.println("A marca do celular é: " + celular.marca);
		System.out.println("O modelo do celular é: " + celular.modelo);
		System.out.println("A cor do celular é: " + celular.cor);
		celular.sobePreco(100.00);
		celular.atualAno(0);
		System.out.println("O ano de lançamento do celular é: " + celular.ano);
		System.out.println("O preço do celular é: " + celular.preco);
		
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		celular.descePreco(300.00);
		celular.proximosAnos(1);
		System.out.println("O ano atual é: " + celular.ano);
		System.out.println("O preço do celular é: " + celular.preco);
		
	}

}
