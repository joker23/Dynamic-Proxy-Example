package Main;
import java.util.*;

import java.lang.reflect.*;

import Annotations.canRun;
public class TestInvocationHandler implements InvocationHandler {
	private Object testImpl;
	private Hashtable<String,Method> methodTable;
	 
	public TestInvocationHandler(Object impl) {
		System.out.println("Constructor Called");
		this.testImpl = impl;
		Method[] mlist = testImpl.getClass().getMethods();
		methodTable = new Hashtable<String,Method>();
		for(Method m:mlist) methodTable.put(m.getName(),m);
	}
	 
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
	        throws Throwable {
		String name = method.getName();
		if(methodTable.containsKey(name)) {	
			if(methodTable.get(name).getAnnotation(canRun.class)!=null)
		   		return method.invoke(testImpl, args);
			else
				throw new NoSuchMethodException();
		}else throw new NoSuchMethodException();
	}
}