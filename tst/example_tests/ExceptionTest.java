package example_tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExceptionTest {
	
  @Test(expectedExceptions = ArithmeticException.class)
  public void f() {
	  int i=1/0;
  }
  
  @Test(enabled=false)//test not run, but will be in report
  public void f1() {
	  
  }
  
  @Test(groups = "method1")
  public void f2() {
	  System.out.println("f2 method1");
  }
  
  @Test(groups = "method2")
  public void f3() {
	  System.out.println("f3 method2");
  }
  
  @Test(groups = "method3")
  public void f4() {
	  System.out.println("f4 method3");
  }
  @Test
  @Parameters(value = "number")
  public void f5(int number) {
	  System.out.println("f5 @Parameters "+(number+1));
  } 
  
}
