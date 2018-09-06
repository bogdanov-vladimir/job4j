package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Bogdanov Vladimir
* @version $Id$
* @since 0.1
*/
public class CalculateTest{
	/**
	* Test echo
	*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName(){
		
		String input = "Bogdanov Vladimir";
		String expect = "Echo, echo, echo : Bogdanov Vladimir";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		
		assertThat(result, is(expect));
	}
}