package li.jesse.structural.proxy;

import li.jesse.structural.proxy.staticproxy.template.Proxy;
import li.jesse.structural.proxy.staticproxy.template.RealSubject;
import org.junit.Test;

public class ProxyTest
{
    @Test
    public void testStaticProxy()
    {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
