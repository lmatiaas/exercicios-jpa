package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		Tio tia = new Tio("maria");
		Tio tio = new Tio("joao");
		Sobrinho sobrinho = new Sobrinho("Leo");
		Sobrinho sobrinha = new Sobrinho("Ana");
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		dao.abrirT().incluir(tio).incluir(tia).incluir(sobrinha).incluir(sobrinho).fecharT().fechar();
	}
}
