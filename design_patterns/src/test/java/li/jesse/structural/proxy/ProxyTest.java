package li.jesse.structural.proxy;

import li.jesse.structural.proxy.cglibproxy.CglibProxy;
import li.jesse.structural.proxy.common.UserService2;
import li.jesse.structural.proxy.common.UserService2Impl;
import li.jesse.structural.proxy.jdkdynamicproxy.MyInvocatioHandler;
import li.jesse.structural.proxy.jdkdynamicproxy.Service;
import li.jesse.structural.proxy.jdkdynamicproxy.UserServiceImpl;
import li.jesse.structural.proxy.staticproxy.Proxy;
import li.jesse.structural.proxy.staticproxy.RealSubject;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

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

    @Test
    public void testCglibProxy()
    {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService2Impl.class);
        enhancer.setCallback(cglibProxy);

        UserService2 o = (UserService2)enhancer.create();

        System.out.println(o.getName(1));
        System.out.println(o.getAge(1));
//        o.getName(1);
//        o.getAge(1);
    }
}
