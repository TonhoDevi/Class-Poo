package estoques;

import java.util.ArrayList;
import java.util.List;

import models.Produto;
import services.ProdutoService;

public class ProdutoEstoque {
	
	
	public static List<Produto> uploadEstoque() {
		List<Produto> armazem = new ArrayList<>();
		ProdutoService funcProd = new ProdutoService();
		
		armazem.add(funcProd.createProd("Notebook", 4499, 10, "Notebook Gamer"));
		armazem.add(funcProd.createProd("Geladeira", 3500, 22, ""));
		armazem.add(funcProd.createProd("Mouse", 160, 17, ""));
		armazem.add(funcProd.createProd("Teclaco", 312, 15, ""));
		armazem.add(funcProd.createProd("Maquina de Lavar", 680, 7, ""));
		armazem.add(funcProd.createProd("Mesa", 89.90, 31, ""));
		armazem.add(funcProd.createProd("Microondas", 367.89, 15, ""));
		armazem.add(funcProd.createProd("Fogão", 550.99, 17, ""));
		return armazem;
	}
	
	
	
	
	
}
