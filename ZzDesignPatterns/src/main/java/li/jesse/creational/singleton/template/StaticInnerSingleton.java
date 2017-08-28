package li.jesse.creational.singleton.template;

/*
 * static inner
 * thread-safe
 * efficient
 */
public class StaticInnerSingleton
{
	private StaticInnerSingleton()
	{
		
	}
	
	private static class SingletonHolder
	{
		public static StaticInnerSingleton instance = new StaticInnerSingleton();
	}
	
	public static StaticInnerSingleton getInstance() 
	{
        return SingletonHolder.instance;
    }
}


