package com.test.dp01.impl;

import com.test.dp01.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack () {
		System.out.println ("<< Silence >>");
	}
}

