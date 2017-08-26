package li.jesse.structural.proxy;

import li.jesse.structural.proxy.jdkdynamicproxy.template.MyInvocatioHandler;
import li.jesse.structural.proxy.jdkdynamicproxy.template.Service;
import li.jesse.structural.proxy.jdkdynamicproxy.template.UserServiceImpl;
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

    @Test
    public void testJdkDynanmicProxy()
    {
        Service service = new UserServiceImpl();
        MyInvocatioHandler handler = new MyInvocatioHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.add();
    }
}
