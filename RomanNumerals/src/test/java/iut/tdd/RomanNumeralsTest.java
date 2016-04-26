package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	 public void doit_retourner_les_chiffres_romain_de_I_a_IX(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("I", romanNumeral.convertToRoman("1"));
		 Assert.assertEquals("II", romanNumeral.convertToRoman("2"));
		 Assert.assertEquals("III", romanNumeral.convertToRoman("3"));
		 Assert.assertEquals("IV", romanNumeral.convertToRoman("4"));
		 Assert.assertEquals("V", romanNumeral.convertToRoman("5"));
		 Assert.assertEquals("VI", romanNumeral.convertToRoman("6"));
		 Assert.assertEquals("VII", romanNumeral.convertToRoman("7"));
		 Assert.assertEquals("VIII", romanNumeral.convertToRoman("8"));
		 Assert.assertEquals("IX", romanNumeral.convertToRoman("9"));
	 }
	@Test
	 public void doit_retourner_les_chiffres_romain_de_X_a_C(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("XVL", romanNumeral.convertToRoman("55"));
	 }
	 @Test
	 public void doit_retourner_1_quand_I(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("1", romanNumeral.convertFromRoman("I"));
	 }
	 @Test
	 public void doit_retourner_50_quand_XXXXX(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("50", romanNumeral.convertFromRoman("XXXXX"));
	 }
	 @Test
	 public void doit_retourner_4_quand_IV(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("4", romanNumeral.convertFromRoman("IV"));
	 }
	 @Test
	 public void doit_retourner_1452_quand_MCCCCLII(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("1452", romanNumeral.convertFromRoman("MCCCCLII"));
	 }
	 @Test
	 public void doit_retourner_11_quand_IIIX(){
		 RomanNumerals romanNumeral = new RomanNumerals();
		 Assert.assertEquals("11", romanNumeral.convertFromRoman("IIIX"));
	 }
	 
	 
}
