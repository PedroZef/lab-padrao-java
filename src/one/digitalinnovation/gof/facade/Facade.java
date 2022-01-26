package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.crm.CepApi;

public class Facade {
	
	public void migraCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.graverCliente(nome, cep, cidade, estado);
		
	}

}
