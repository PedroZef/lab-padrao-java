package one.digitalinnovation.gof.singleton;

/**
 * Singleton "agressivo"
 * @author PedroZef
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia = new SingletonLazy();
	
	public SingletonLazy() {
		super();
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
		instancia = new SingletonLazy();
		}
		return instancia;
		
	}

}
