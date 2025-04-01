package view;

import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("Penny",10,30);
		
		System.out.println(produto.toString());
	}

}
