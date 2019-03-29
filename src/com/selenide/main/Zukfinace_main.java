package com.selenide.main;

import com.selenide.pages.Base;
import com.selenide.test.Test_Case1;
import com.selenide.test.Test_Case2;

public class Zukfinace_main {

	public static void main(String args[]) {
		Base base = new Base();
		base.setup();
		Test_Case1 t1 = new Test_Case1();
		t1.login();
		Test_Case2 t2 = new Test_Case2();
		t2.createNewApp();

	}
}
