package UnitTests;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import TestClasses.TestClass1;

public class BaseTest {
	TestAdaptor bt;
	@Before
	public void setUp(){
		bt = new TestAdaptor();
	}
	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println(bt.runTest(TestClass1.class));
	}

}
