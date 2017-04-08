package li.jesse.designpatterns.creational.singleton;

public class NonSingleton
{
	private static NonSingleton instance;

	public NonSingleton()
	{
		
	}
	
	public static NonSingleton getInstance()
	{
		instance = new NonSingleton();
		
		return instance;
	}
}
