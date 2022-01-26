/**
 * 
 */
package subsistema1.crm;

/**
 * @author PedroZef
 *
 */
public class CrmService {
	
	private CrmService() {
		super();
		
	}
	
	public static void graverCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}

}
		



