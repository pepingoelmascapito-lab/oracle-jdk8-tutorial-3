package com.example;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("what is a hight tier human to a low tier god");

		/*
		 * El text block es una caracteristica nueva de la version 21 de Java y permite
		 * crear cadenas de caracteres que abarquen varias lineas sin necesidad de
		 * caracteres de cambio de linea ni secuencias de escape
		 */

		String tradicionalmente = "{\n" + "    \"name\"" + ": \"John Doe\",\n" + "	\"age\""
				+ ": 213987781328791327893128793217987198327893279813279831792839728179832978312798798321 anos,\n"
				+ "}";

		System.out.println(tradicionalmente );
		
		String textBlock = """
				{
				    wasaaaaaaaaa
				    1
				    2
				    3
				    4
				    5
				    6
				    7
				    8
				    9
				    
				}
				""";
 		System.out.println(textBlock + "ñiñiñiñiñi");
	}
}
