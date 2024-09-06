package com.ng.lombok;

/**
 * Hello world!
 *
 */
public class App {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {

		Lombok lombok = new Lombok("Charan", 0);

		System.out.println(lombok);

		lombok.setName("Nirmal");
		lombok.setId(10);

		System.out.println(lombok);

		Lombok lombokBuilder = lombok.builder().Id(0).name("Nirmal").build();

		System.out.println(lombokBuilder);

		Lombok lomboknull = new Lombok();

		// this will throw null pointer exception as non null is set on name
		Lombok lombokBuildernull = lombok.builder().Id(0).name(null).build();

	}
}
