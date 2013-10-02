package Main;

import Annotations.canRun;

public class TestClass implements TestInterface {
	@canRun
	public String hello() {
		return "Hello";
	}
	public String breakRules(){
		return "Rules Broken";
	}
	@canRun
	public String toString(){
		return "called to String";
	}
}
