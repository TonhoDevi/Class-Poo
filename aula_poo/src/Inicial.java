package menus;

import java.util.List;
import java.util.Scanner;

import models.Produto;
import services.ProdutoService;

public class Inicial {
	
	public static void showMenu(List<Produto> armazem) {
		Scanner scan = new Scanner(System.in);
		ProdutoService funcProd = new ProdutoService();
		int escolha;
		
		while(true) {
			
		System.out.println("======Menu======");
		System.out.println("1-Ver Armazem");
		System.out.println("2-Adicionar Produto");
		System.out.println("3-Remover Produto");
		escolha = scan.nextInt();
		
		
		switch(escolha) {
		case 1:
			System.out.println(funcProd.listAll(armazem));
			break;
		case 2:
			armazem.add(funcProd.createProd("Vassoura", 12, 44, "Vassoura de ferro"));
			break;
		case 3:
			funcProd.deleteProd(armazem, 1);
			break;
			
		default:
			
			break;
		
		}
		
		
	}
	
}
	
}
