package com.codewar.OrderOfBraces;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  String str = "([{}])";
	  str = str.replace("{}", "");
	  System.out.println("str : " + str);
	  str = str.replace("()", "");
	  System.out.println("str : " + str);
	  str = str.replace("[]", "");
	  System.out.println("str : " + str);
  }
}
