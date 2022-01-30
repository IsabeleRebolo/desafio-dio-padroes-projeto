package subsistema1.crm;

import one.digitalInovation.gof.facade.Contato;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado, Contato contatos) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		System.out.println(contatos.getTel());
		System.out.println(contatos.getEmail());
		System.out.println(contatos.getLinkedin());
		System.out.println(contatos.getInsta());
	}
}
