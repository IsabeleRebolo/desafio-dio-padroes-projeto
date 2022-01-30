package one.digitalInovation.gof.facade;

import Subsistema3.contato.ContatoApi;
import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String cpf, String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		Contato contatos = new Contato();
		contatos.setEmail(ContatoApi.getInstancia().solicitarEmail(cpf));
		contatos.setTel(ContatoApi.getInstancia().solicitarTelefone(cpf));
		contatos.setLinkedin(ContatoApi.getInstancia().solicitarLinkedin(cpf));
		contatos.setInsta(ContatoApi.getInstancia().solicitarInstagran(cpf));

		CrmService.gravarCliente(nome, cep, cidade, estado, contatos);
	}
}
