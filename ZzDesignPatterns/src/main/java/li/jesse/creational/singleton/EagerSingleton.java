package li.jesse.creational.singleton;

/*
 * eager initialization
 * thread-safe
 * slow
 */
public class EagerSingleton
{
private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton()
	{
		
	}
	
	public static EagerSingleton getInstance()
	{
		return instance;
	}
}


