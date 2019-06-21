package com.study.inherit.generic;

import com.alibaba.fastjson.JSON;

public class Myapp {
	public static void main(String[] args) {
		System.out.println(JSON.toJSON(args));
	}
}
