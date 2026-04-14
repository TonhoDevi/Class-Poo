package services;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

public class ProdutoService {
	public static double valorPorProduto(Produto prod) {
		double valor;
		valor = prod.getValor() * prod.getUnidades();
		return valor;
	}
	public static Produto createProd(String nomeProd, double valorProd, int unidadesProd, String descricaoProd) {
		Produto prod = new Produto();
		prod.setNome(nomeProd);
		prod.setValor(valorProd);
		prod.setUnidades(unidadesProd);
		prod.setDescricao(descricaoProd);
		return prod;
	}
	
	public static List<String> listAll(List<Produto> armazemProd){
		List<String> nomesProd = new ArrayList<>();
		for(int i = 0; i<armazemProd.size();i++) {
			nomesProd.add(armazemProd.get(i).getNome());
		}
		return nomesProd;
	}
	
	
	
	
	
	
}