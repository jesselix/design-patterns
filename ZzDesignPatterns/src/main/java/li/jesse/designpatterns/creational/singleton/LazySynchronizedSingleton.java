package li.jesse.designpatterns.creational.singleton;

/*
 * lazy initialization
 * thread-safe
 * inefficient
 */
public class LazySynchronizedSingleton
{
	private static LazySynchronizedSingleton instance;

	private LazySynchronizedSingleton()
	{
		
	}
	
	public static synchronized LazySynchronizedSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySynchronizedSingleton();
		}
		
		return instance;
	}
}