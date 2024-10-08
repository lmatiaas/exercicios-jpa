package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.println("ID: " + produto.getId() + " Produto: " + produto.getNome() + " Valor: R$ " + produto.getPreco());
		}
		dao.fechar();
	}
}
