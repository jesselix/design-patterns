package li.jesse.creational.singleton.template;

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
