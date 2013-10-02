package Main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;

import TestClasses.TestClass1;
import TestClasses.Tests;

public class ProxyFactory {
    public static Object getProxy(final Object s) {
        return (Object) Proxy.newProxyInstance(s.getClass().getClassLoader(),
        		s.getClass().getInterfaces(),
        		new TestInvocationHandler(s));
    }
    
//    public static void main(String[] args){
//    	TestClass1 test = new TestClass1();
//    	TestClass1 prox = (TestClass1) ProxyFactory.getProxy(test);
//    	System.out.println(test == prox);
//    	System.out.println(test.run1() == prox.run1());
//    }
}