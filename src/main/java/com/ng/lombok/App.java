package com.ng.lombok;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		Lombok lombok = new Lombok("Charan", 0);

		System.out.println(lombok);

		lombok.setName("Nirmal");
		lombok.setId(10);

		System.out.println(lombok);

		Lombok lombokBuilder = lombok.builder().Id(0).name("Nirmal").build();

		System.out.println(lombokBuilder);

		Lombok lomboknull = new Lombok();

		// Lombok lombokBuildernull = lombok.builder().Id(0).name(null).build();

	}
}
