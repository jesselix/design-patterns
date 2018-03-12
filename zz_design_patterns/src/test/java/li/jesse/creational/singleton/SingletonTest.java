package li.jesse.creational.singleton;

import li.jesse.creational.singleton.template.*;
import org.junit.Test;

public class SingletonTest
{
	@Test
	public void testSingleton()
	{	
		System.out.println("--- non singleton ---");
		NonSingleton nonSingleton1 = new NonSingleton();
		NonSingleton nonSingleton2 = new NonSingleton();
		System.out.println(nonSingleton1);
		System.out.println(nonSingleton2);
		System.out.println(NonSingleton.getInstance());
		System.out.println(NonSingleton.getInstance());
		
		System.out.println("--- simple singleton ---");
		System.out.println(SimpleSingleton.getInstance());
		System.out.println(SimpleSingleton.getInstance());
		
		System.out.println("--- synchronized singleton ---");
		System.out.println(SynchronizedSingleton.getInstance());
		System.out.println(SynchronizedSingleton.getInstance());
		
		System.out.println("--- eager singleton ---");
		System.out.println(EagerSingleton.getInstance());
		System.out.println(EagerSingleton.getInstance());
		
		System.out.println("--- double checked locking singleton ---");
		System.out.println(DoubleCheckedLockingSingleton.getInstance());
		System.out.println(DoubleCheckedLockingSingleton.getInstance());
		
		System.out.println("--- static inner singleton ---");
		System.out.println(StaticInnerSingleton.getInstance());
		System.out.println(StaticInnerSingleton.getInstance());
	}
}


