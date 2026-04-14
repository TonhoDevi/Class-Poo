package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estoques.ProdutoEstoque;
import models.Produto;
import services.ProdutoService;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ProdutoService com função generica = createProd
		ProdutoEstoque bancoTemp = new ProdutoEstoque();
		ProdutoService funcProd = new ProdutoService();
		List<Produto> armazem = bancoTemp.uploadEstoque();
		
		System.out.println("O numero total de produtos é: " + armazem.size());
		System.out.println("Listando todos os produtos:");
		System.out.println(funcProd.listAll(armazem));
		
		
		/*
		int escolhido;
		
		escolhido = scan.nextInt();
		double resultado = funcProd.valorPorProduto(armazem.get(escolhido));
		System.out.println("R$" + resultado);*/
		
	}

}
