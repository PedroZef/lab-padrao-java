package subsistema2.crm;

public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	public CepApi() {
		super();
		
	}
	
	public static CepApi getInstancia() {
		
		return instancia;
		
	}

	public String recuperarCidade(String cep) {
		return "S. José dos Campos";
		
	}
	
	public String recuperarEstado(String cep) {
		return "S. Paulo";
		
	}
}
