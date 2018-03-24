package li.jesse.creational.singleton.template;

/*
 * lazy initialization
 * thread-unsafe
 */
public class SimpleSingleton
{
	private static SimpleSingleton instance;

	private SimpleSingleton()
	{
		
	}
	
	public static SimpleSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new SimpleSingleton();
		}
		
		return instance;
	}
}