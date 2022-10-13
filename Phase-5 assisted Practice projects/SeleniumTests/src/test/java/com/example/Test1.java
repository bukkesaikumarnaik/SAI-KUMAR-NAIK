package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test1 {
  @Test
  public void f() {
	  System.out.println("Hello!!!");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Method");
  }

}
