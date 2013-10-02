package Main;

import java.lang.reflect.*;
public class Test {
	public static void main(String[] args) {
		TestClass impl = new TestClass();
		TestClass impl2 = impl;
		TestInterface t = (TestInterface) ProxyFactory.getProxy(impl);
		
		System.out.printf("t.hello(): %s%n", t.hello());
		System.out.printf("impl.hello(): %s%n", impl.hello());
		try{
			System.out.printf("t.breakRules(): %s%n", t.breakRules());
		} catch(Exception e){
			System.out.println("t.breakRules(): caught exception...");
		}
		System.out.printf("impl.breakRules(): %s%n",impl.breakRules());
		System.out.printf("t.toString(): %s%n", t);
		System.out.printf("impl.equals(t): %s%n",impl.equals(t));
		try{
			System.out.println("t.equals(impl): "+t.equals(impl));
		}catch(Exception e){
			System.out.println("t.equals(impl): caught exception...");
		}
	}
}

