package teste.umpramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Narnia", 9.9);
		Filme filmeB = new Filme("AAA", 9.8);
		
		Ator atorA = new Ator("ana");
		Ator atorB = new Ator("Leo");
		
		filmeA.adicionarAtor(atorB);
		filmeA.adicionarAtor(atorA);
		filmeB.adicionarAtor(atorA);
		filmeB.adicionarAtor(atorB);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
	}
}
