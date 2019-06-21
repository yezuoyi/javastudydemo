package com.study.inherit.generic;

class Animal{}

class Human extends Animal{}

class Toy{}

class Duck<T extends Animal>{}


public class Main {

	public static void main(String[] args) {
		Duck<Animal> ad = new Duck<Animal>();
		Duck<Human> hd = new Duck<Human>();
	}
}
