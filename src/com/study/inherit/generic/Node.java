package com.study.inherit.generic;

public class Node<T> {
	private T value;
	Node<T> next;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Node<String> first = new Node<String>();
		first.setValue("Justin");
		first.next = new Node<String>();
		first.next.setValue("hello,world");
	}
}
