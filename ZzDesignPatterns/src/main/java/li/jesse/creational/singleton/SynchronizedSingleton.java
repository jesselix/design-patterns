package li.jesse.creational.singleton;

/*
 * lazy initialization
 * thread-safe
 * inefficient
 */
public class SynchronizedSingleton
{
	private static SynchronizedSingleton instance;

	private SynchronizedSingleton()
	{
		
	}
	
	public static synchronized SynchronizedSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new SynchronizedSingleton();
		}
		
		return instance;
	}
}