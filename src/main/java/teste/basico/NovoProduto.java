package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("borracha", 0.50);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		
		dao.abrirT().incluir(produto).fecharT().fechar();
	}
}
