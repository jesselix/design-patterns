package li.jesse.creational.singleton.template;

/*
 * lazy initialization
 * thread-safe
 */
public class DoubleCheckedLockingSingleton
{
	private volatile static DoubleCheckedLockingSingleton instance;
	
    private DoubleCheckedLockingSingleton()
    {
    	
    }
 
    public static DoubleCheckedLockingSingleton getInstance() 
    {
        if (instance == null) 
        {                         
            synchronized (DoubleCheckedLockingSingleton.class) 
            {
                if (instance == null) 
                {       
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        
        return instance;
    }
}