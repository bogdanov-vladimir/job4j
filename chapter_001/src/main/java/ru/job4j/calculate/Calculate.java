package ru.job4j.calculate;

/**
* @author Bogdanov Vladimir (bogd_vlad@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Calculate {
	/**
	*Main	
	* @param args - args
	*/
	public static void main(String[] args) {
		System.out.println(echo("VladimirBogdanov"));
	}
	
	/**
	* @param name -your name
	* @return echo + your name
	*/
	public static String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
	
	
}