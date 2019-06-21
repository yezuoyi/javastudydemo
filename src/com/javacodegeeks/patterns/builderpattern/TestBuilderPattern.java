package com.javacodegeeks.patterns.builderpattern;

import com.alibaba.fastjson.JSON;

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		//System.out.println(car);
		System.out.println(JSON.toJSON(car));
		
		carBuilder = new SportsCarBuilder();
		director = new CarDirector(carBuilder);
		director.build();
		car = carBuilder.getCar();
		//System.out.println(car);
		
		System.out.println(JSON.toJSON(car));
	}

}
