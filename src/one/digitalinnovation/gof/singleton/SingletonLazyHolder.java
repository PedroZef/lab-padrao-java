package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/240/18148">Referencia</a>
 * @author PedroZef
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		
	}
	public SingletonLazyHolder() {
		super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
		
	}

}
