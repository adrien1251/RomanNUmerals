package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nbActu= Integer.parseInt(arabe);
		String result="";
		if(nbActu>0){
			if(nbActu>1000){
				result = convertMillierToRoman(nbActu);
				nbActu = nbActu%100;
			} else if(nbActu>100){
				result = convertCentaineToRoman(nbActu);
				nbActu = nbActu%10;
			} else if(nbActu>10){
				result = convertDizaineToRoman(nbActu);
				nbActu = nbActu%1;
			} else{
				result = convertUniteToRoman(nbActu);
				nbActu -= nbActu;
			}
		}

		return result;
	}

	public String convertUniteToRoman(int arabe) {
		String romain="";
		switch (arabe){
		case 1: arabe=1;
		romain ="I";
		break;
		case 2: arabe=2;
		romain ="II";
		break;
		case 3: arabe=3;
		romain ="III";
		break;
		case 4: arabe=4;
		romain ="IV";
		break;
		case 5: arabe=5;
		romain ="V";
		break;
		case 6: arabe=6;
		romain ="VI";
		break;
		case 7: arabe=7;
		romain ="VII";
		break;
		case 8: arabe=8;
		romain ="VIII";
		break;
		case 9: arabe=9;
		romain ="IX";
		break;
		}
		return romain;
	}
	public String convertDizaineToRoman(int arabe) {
		String romain="";
		int arabei=arabe/10;
		switch (arabei){
		case 1: arabe=1;
		romain ="X";
		break;
		case 2: arabe=2;
		romain ="XX";
		break;
		case 3: arabe=3;
		romain ="XXX";
		break;
		case 4: arabe=4;
		romain ="XL";
		break;
		case 5: arabe=5;
		romain ="L";
		break;
		case 6: arabe=6;
		romain ="LX";
		break;
		case 7: arabe=7;
		romain ="LXX";
		break;
		case 8: arabe=8;
		romain ="LXXX";
		break;
		case 9: arabe=9;
		romain ="XC";
		break;
		}
		return romain;
	}
	public String convertCentaineToRoman(int arabe) {
		String romain="";
		int arabei=arabe/100;
		switch (arabei){
		case 1: arabe=1;
		romain ="C";
		break;
		case 2: arabe=2;
		romain ="CC";
		break;
		case 3: arabe=3;
		romain ="CCC";
		break;
		case 4: arabe=4;
		romain ="CD";
		break;
		case 5: arabe=5;
		romain ="D";
		break;
		case 6: arabe=6;
		romain ="DC";
		break;
		case 7: arabe=7;
		romain ="DCC";
		break;
		case 8: arabe=8;
		romain ="DCCC";
		break;
		case 9: arabe=9;
		romain ="CM";
		break;
		}
		return romain;
	}
	public String convertMillierToRoman(int arabe) {
		String romain="";
		int arabei=arabe/1000;
		switch (arabei){
		case 1: arabe=1;
		romain ="M";
		break;
		case 2: arabe=2;
		romain ="MM";
		break;
		case 3: arabe=3;
		romain ="MMM";
		break;
		}
		return romain;
	}
	public String convertUnNombreUnitaireArabeEnNombreRomain(int nb){
		switch (nb) {
		case 1:
			return "I";
		case 2:
			return "II";
		case 3:
			return "III";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 6:
			return "VI";
		case 7:
			return "VII";
		case 8:
			return "VIII";
		case 9:
			return "IX";
		default:
			break;
		}
		return "";
	}

	public String convertFromRoman(String roman) {
		int result = 0, i=0;
		while(i<roman.length()){
			int tmp = convertUnCaractereRomainEnNombre(roman.charAt(i));
			if(i+1 < roman.length()){
				if(tmp < convertUnCaractereRomainEnNombre(roman.charAt(i+1))){
					tmp = convertUnCaractereRomainEnNombre(roman.charAt(i+1))-tmp;
					i++;
				}
			}
			result += tmp;
			i++;
		}
		return ""+result;
	}
	public int convertUnCaractereRomainEnNombre(char roman){

		switch (roman) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
