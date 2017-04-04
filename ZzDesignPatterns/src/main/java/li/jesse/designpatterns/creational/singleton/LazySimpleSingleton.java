package li.jesse.designpatterns.creational.singleton;

/*
 * lazy initialization
 * thread-unsafe
 */
public class LazySimpleSingleton
{
	private static LazySimpleSingleton instance;

	private LazySimpleSingleton()
	{
		
	}
	
	public static LazySimpleSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySimpleSingleton();
		}
		
		return instance;
	}
}