package br.com.generation.poo;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();

        cl.nome = "Roberval";
        cl.endereco = "Rua otavinio, 77";
        cl.profissao = "Esteticista Automotivo";

       
        System.out.println("Nome: " + cl.nome);
        System.out.println("Endereço: " + cl.endereco);
        System.out.println("Profissão: " + cl.profissao);
        System.out.println();

        cl.comprar();
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        cl.trocar();
        System.out.println();
        System.out.println("Nome: " + cl.nome);
        System.out.println("Endereço: " + cl.endereco);
        System.out.println("Profissão: " + cl.profissao);
    }
}
