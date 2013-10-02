package UnitTests;
import Annotations.canRun;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAdaptor {
	public int runTest(Class c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		int ret = 0;
		for(Method m: c.getMethods()){
			canRun anno = m.getAnnotation(canRun.class);
			if(anno!=null){
				ret ++;
			}
		}return ret;
	}
}
