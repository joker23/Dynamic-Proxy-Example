package TestClasses;
import Annotations.canRun;

public class TestClass1 implements Tests{

	public int run1(){
		return 1;
	}
	public int run2(){
		return 1;
	}
	public int run3(){
		return 1;
	}
	public int run4(){
		return 1;
	}
	public int run5(){
		return 1;
	}
	@canRun
	public int run6(){
		System.out.println("it ran");
		return 1;
	}
	@canRun
	public int run7(){
		return 1;
	}
}
