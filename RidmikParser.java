import java.util.Scanner;

/**
 * 
 * @author Shamim Hasnath
 * @version 1.2
 * @since 2012
 *
 */
import java.util.HashMap;
import java.util.Map;

class BanglaUnicode {
	
	private Map<String, String> map = new HashMap<String, String>();
	private Map<String, String> kars = new HashMap<String,String>();
	private Map<String, String> jkt = new HashMap<String, String>();
	private Map<String, String> djkt = new HashMap<String, String>();
	private Map<String, String> djktt = new HashMap<String, String>();
	
	public BanglaUnicode(){
		// Same : a, k, g, c, f, e, b, v, l, m, p
		map.put("o", "\u0985"); // shore o
		map.put("O", "\u0993"); // rossho o
		map.put("a", "\u0986"); // aa
		map.put("A", "\u0986"); // aa
		map.put("S", "\u09B6"); // talobbo sho
		map.put("sh", "\u09B6"); // talobbo sho
		map.put("s", "\u09B8");  // donto sho
		map.put("Sh", "\u09B7"); // murdonno sho
		map.put("h", "\u09B9"); // ho
		map.put("H", "\u09B9"); // ho
		map.put("r", "\u09B0"); // ro
		map.put("R", "\u09DC"); // dhoye shunne ro
		map.put("Rh", "\u09DD"); // dhoye shunne ro
		map.put("k", "\u0995"); // ko
		map.put("K", "\u0995"); // ko
		map.put("q", "\u0995");
		map.put("qq", "\u0981"); // chondro bindu
		map.put("kh", "\u0996"); // kho
		map.put("g", "\u0997"); // go
		map.put("G", "\u0997"); //go
		map.put("gh", "\u0998"); // gho
		map.put("Ng", "\u0999"); // unga		
		map.put("c", "\u099A"); // cho
		map.put("C", "\u099A"); // cho
		map.put("ch", "\u099B"); // ccho
		map.put("j", "\u099C"); // jo
		map.put("jh", "\u099D"); // jho
		map.put("J", "\u099C"); // jho
		map.put("NG", "\u099E"); // niyo
		map.put("T", "\u099F"); // To
		map.put("Th", "\u09A0"); // Tho
		map.put("TH", "\u09CE"); // khondiyo to
		map.put("f", "\u09AB"); // fo
		map.put("F", "\u09AB"); // fo
		map.put("ph", "\u09AB"); // fo
		map.put("i", "\u0987"); // rossho i
		map.put("I", "\u0988"); // dhirgo i
		map.put("e", "\u098F"); // e
		map.put("E", "\u098F"); // e
		map.put("u", "\u0989"); // rossho u
		map.put("U", "\u098A"); // dhirgo u
		map.put("b", "\u09AC"); // bo
		map.put("B", "\u09AC"); // bo
		map.put("w", "\u09AC"); // bo
		map.put("bh", "\u09AD"); // bho
		map.put("V", "\u09AD"); // bho
		map.put("v", "\u09AD"); // bho
		map.put("t", "\u09A4"); // to
		map.put("th", "\u09A5"); // tho
		map.put("d", "\u09A6"); // do
		map.put("dh", "\u09A7"); // dho
		map.put("D", "\u09A1"); // do
		map.put("Dh", "\u09A2"); // dho
		map.put("n", "\u09A8"); // donto no
		map.put("N", "\u09A3"); // murdo no
		map.put("z", "\u09AF"); // zho
		map.put("Z", "\u09AF"); // zho fola
		map.put("y", "\u09DF"); // ontosto yo
		map.put("l", "\u09B2"); // lo
		map.put("L", "\u09B2"); // lo
		map.put("m", "\u09AE"); // mo
		map.put("M", "\u09AE"); // mo
		map.put("P", "\u09AA"); // po
		map.put("p", "\u09AA"); // po
		map.put("ng", "\u0982"); // onushar
		map.put("cb", "\u0981"); // chondro point
		map.put("x", "\u0995\u09CD\u09B8");
		map.put("OU", "\u0994");
		map.put("OI", "\u0990");
		map.put("hs", "\u09CD");
		map.put("nj", "\u099E\u09CD\u099C"); //
		map.put("nc", "\u099E\u09CD\u099A"); //
		
		
		kars.put("o", ""); // o kar
		kars.put("a", "\u09BE"); // aa kar
		kars.put("A", "\u09BE"); // aa kar
		kars.put("e", "\u09C7"); // e kar
		kars.put("E", "\u09C7"); // e kar
		kars.put("O", "\u09CB"); // O kar
		kars.put("OI", "\u09C8"); // OI kar
		kars.put("OU", "\u09CC");
		kars.put("i", "\u09BF"); // rossho i kar
		kars.put("I", "\u09C0"); //dhirgo i karu
		kars.put("u", "\u09C1"); // rossho u kar
		kars.put("U", "\u09C2"); // dhirgo u kar
		kars.put("oo", "\u09C1"); // rossho u kar
		
		// each of 2nd sits under 1st
		jkt.put("k", "kTtnNslw");
		jkt.put("g", "gnNmlw");
		jkt.put("ch", "w");
		jkt.put("Ng", "gkm");
		jkt.put("NG", "cj");
		jkt.put("g", "gnNmlw");
		jkt.put("G", "gnNmlw");
		jkt.put("th", "w");
		jkt.put("gh", "Nn");
		jkt.put("c", "c");
		jkt.put("j", "jw");
		jkt.put("T", "T");
		jkt.put("D", "D");
		jkt.put("R", "g");
		jkt.put("N", "DNmw");
		jkt.put("t", "tnmwN");
		jkt.put("d", "wdm");
		jkt.put("dh", "wn");
		jkt.put("n", "ndwmtsDT");
		jkt.put("p", "plTtns");
		jkt.put("f", "l");
		jkt.put("ph", "l");
		jkt.put("b", "jdbwl");
		jkt.put("v", "l");
		jkt.put("bh", "l");
		jkt.put("m", "npfwvmlb");
		jkt.put("l", "lwmpkgTDf");
		jkt.put("Sh", "kTNpmf");
		jkt.put("S", "clwnm");
		jkt.put("sh", "clwnm");
		jkt.put("s", "kTtnpfmlw");
		jkt.put("h", "Nnmlw");
		jkt.put("cb", "");
		jkt.put("jh", "");
		jkt.put("TH", "");
		jkt.put("qq", "");
		jkt.put("ng", "");
		jkt.put("kh", "");
		jkt.put("gg", "");
		jkt.put("dh", "");
		jkt.put("Th", "");
		
		// first sits under each of 2nd
		djkt.put("kh", "Ngs");
		djkt.put("ch", "c"); 
		djkt.put("Dh", "N");
		djkt.put("ph", "mls");
		djkt.put("dh", "gdnbl");
		djkt.put("bh", "dm");
		djkt.put("Sh", "k");
		djkt.put("th", "tns");
		djkt.put("Th", "Nn");
		djkt.put("jh", "j");
		djkt.put("NG", "cj");
		
		// first sits under 2nd(dual)
		djktt.put("ch", "NG");
		djktt.put("gh", "Ng");
		djktt.put("Th", "Sh");
		djktt.put("jh", "NG");
		djktt.put("sh", "ch");
		
	}
	
	public String getDual(char x, char carry){
		return map.get(Character.toString(carry)+Character.toString(x));
	}
	public String get(char x){
		return map.get(Character.toString(x));
	}
	public String getKar(char x){
		return kars.get(Character.toString(x));
	}
	public String getDualKar(char x, char carry){
		return kars.get(Character.toString(carry)+Character.toString(x));
	}
	public String getJkt(char carry){
		return jkt.get(Character.toString(carry));
	}
	public String getDualJkt(char secondCarry, char carry){
		return jkt.get(Character.toString(secondCarry)+Character.toString(carry));
	}
	public String getDjkt(char secondCarry, char carry){
		return djkt.get(Character.toString(secondCarry)+Character.toString(carry));
	}
	public String getDjktt(char secondCarry, char carry){
		return djktt.get(Character.toString(secondCarry)+Character.toString(carry));
	}
	/*public static void main(String[] a){
		RidmikParser.main(new String[]{});
	}*/
}


public class RidmikParser{
	
	private BanglaUnicode unicode = new BanglaUnicode();

	public static void main(String[] arg){
		RidmikParser parser = new RidmikParser();
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		
		while(sc.hasNext()){
			String eng = sc.nextLine();
			System.out.println(parser.toBangla(eng));
		}*/

		int argc = arg.length;
		

		for(int i=0;i<argc;i++){
			System.out.print(parser.toBangla(arg[i]));
			System.out.print(" ");
		}
		
	}
	
	/**
	 * 
	 * @param engWord (String) the english word, might contain spaces or any other characters
	 * @return parsed Bangla string in unicode
	 */

	public String toBangla(String engWord){
		
		StringBuilder st = new StringBuilder();
		char carry = 0;
		char secondCarry = 0;
		char thirdCarry = 0;
		boolean tempNoCarry = false;
		boolean jukta = false;
		char[] charArray;
		boolean prevJukta = false;
		

		charArray = engWord.toCharArray();

		// ======================= The great for loop starts =======================
		for(char now : charArray){
			
			// we won't parse anything other than english letters & digits
			if(!((now >= 'a' && now <= 'z') || (now >= 'A' && now <= 'Z') || (now >= '0' && now <= '9'))){
				st.append(now);
				carry = 0;
                // if a bug shows up first thing to do is reset secondCarry, thirdCarry etc here
				continue;
			}
			
			if(now == 'A' || now == 'B' || now == 'C' || now == 'E' || now == 'F' || now == 'P' || now == 'X')
				now = Character.toLowerCase(now);
			if(now == 'K' || now == 'L' || now == 'M' || now == 'V' || now == 'Y' || now == 'W' || now == 'Q' )
				now = Character.toLowerCase(now);
			
			if(now == 'H' && carry != 'T') // khondiyo to -> TH
				now = 'h';
			
			// 'w' should be 'O' when it's the first one or comes after a vowel
			if((carry == 0 || isVowel(carry)) && now == 'w')
				now = 'O';

			
			if(isVowel(now)){
				
				// special for wri kar & wri
				if(carry=='r' && secondCarry == 'r' && now =='i'){
					
					if(thirdCarry == 0){
						st.delete(st.length()-2, st.length());
						st.append("\u098B"); // wri						
					}else {
						st.delete(st.length()-3, st.length());
						st.append("\u09C3"); // wri kar
					}
					carry = 'i';
					continue;

				}
				
				String dual;
				if(secondCarry != 0)
					dual = unicode.getDualKar(now, carry);
				else dual = unicode.getDual(now, carry); // dual as the first character of st
				
				if(dual != null){					
					if(carry != 'o')
						st.delete(st.length()-1, st.length());
					if(isVowel(secondCarry)){ // a dual kar does not applied on vowel
						st.append(unicode.get(carry)).append(unicode.get(now));
					}else
						st.append(dual);					
				}else if(now == 'o' && carry != 0){
					if(isVowel(carry))
						st.append(unicode.get('O'));
					else {
						thirdCarry = secondCarry;
						secondCarry = carry;
						carry =  now; // carry = 0 
						continue;
					}
				}else if(isVowel(carry) || carry == 0){
					if(now == 'a' && carry != 0) // not first a
						st.append(unicode.get('y')).append(unicode.getKar('a'));
					else
						st.append(unicode.get(now));
				}else {
					st.append(unicode.getKar(now));
				}
	
			}
			

			if(now == 'y' || now == 'Z' || now == 'r')
				jukta = false;
			
			// when previous was a jukta and dual of the later two is not available
			// go to the else part of the next if block i.e now is independent
			tempNoCarry = jukta && unicode.getDual(now, carry) == null;
			
			if(isConsonant(now) && isConsonant(carry) && !tempNoCarry){
				
				// handle jo fola
				
				if(now == 'y' || now == 'Z'){
					if(now == 'y' && carry == 'q' && secondCarry == 'q');
					else 
						now = 'z';
				}
				
				//handle gg as in gyan,
				//second carry not n, to skip onushar/unga
				
				if(carry=='g' && now=='g' && secondCarry !='N' && secondCarry != 'n'){
					st.delete(st.length()-1, st.length());
					st.append("\u099C\u09CD\u099E");
					prevJukta = jukta;
					jukta = true;
					secondCarry = 'g';
					continue;
				}
				
				// handle kkh = kSh
				if(secondCarry == 'k' && carry == 'k' && now == 'h')
					carry = 'S';
				
				// check if dual
				String dual = unicode.getDual(now, carry);
				
				if(dual != null){
					
					// handle kaNgkShito
					if(thirdCarry == 'g' && secondCarry == 'k' && carry == 'S' && now == 'h')
						prevJukta = jukta = false;
					
					boolean firstOrAfterVowelOrJukta = isVowel(secondCarry) || secondCarry == 0 || prevJukta;
					
					if(dualSitsUnder(thirdCarry, secondCarry, carry, now) && !firstOrAfterVowelOrJukta){
						st.delete(st.length()-1, st.length());
						if(secondCarry == 'r' && thirdCarry == 'r')
							st.delete(st.length()-1, st.length());
						if(jukta);
						else if(secondCarry != 0 && !isVowel(secondCarry))
							st.append("\u09CD");
						
						st.append(dual);
						prevJukta = jukta;
						// Jukta should be false in case we want to have three jukta letters
						jukta = true;
						
					}else {
						if(jukta)
							st.delete(st.length()-2, st.length());
						else st.delete(st.length()-1, st.length());
						
						if(secondCarry == 'g' && carry == 'g' && now == 'h'){ // handled gg previously, now more pain
							st.delete(st.length()-1, st.length());
							st.append(unicode.get('g'));
						}
						
						st.append(dual);
						prevJukta = jukta;
						jukta = false;
					}
					
					
				}else {
					
					prevJukta = jukta;
					jukta = false;
					
					if(secondCarry != 'r' && carry == 'r' && now == 'z'){
						st.append("\u200D\u09CD"); // handle rya as in ransom/rapid
					}
					else if(carry == 'r' && secondCarry != 'r');
					 // no ref when (c) rr (c)
					else if(carry == 'r' && secondCarry == 'r' && isConsonant(thirdCarry));
					 // ref when (v) rr (c)
					else if(carry == 'r' && secondCarry == 'r' && (isVowel(thirdCarry) || thirdCarry == 0)){
						st.delete(st.length()-1, st.length());						
						st.append("\u09CD"); // jukta added for ref, but jukta not true
					}
					
					else if(notJukta(thirdCarry, secondCarry, carry, now));
					else {
						st.append("\u09CD");
						//prevJukta = jukta;
						jukta = true;
					}
					
					st.append(unicode.get(now));

				}				
				
			} else if(isConsonant(now)){
				
				if(isVowel(carry) && now == 'Z')
					st.append("\u09CD");
				
				if(carry == 0 && now == 'x')
					st.append(unicode.get('e'));
				
				prevJukta = jukta;
				jukta = false;
				
				// to write b-fola 
				if(now == 'w' && isConsonant(carry) && isConsonant(secondCarry)){
					st.append("\u09CD");
					prevJukta = jukta;
					jukta = true;
				}
				// handle lakshmi/ lokhnou
				if(thirdCarry == 'k' && secondCarry == 'S' && carry == 'h' && (now == 'N' || now == 'm')){
					st.append("\u09CD");
					prevJukta = false;
					jukta = true;
				}
				st.append(unicode.get(now));

			}
			
			thirdCarry = secondCarry;
			secondCarry = carry;
			carry = now;
		} // end of for loop
		
		return st.toString();
	}
	
	boolean isVowel(char now){
		if("AEIOUaeiou".indexOf(now) == -1)
			return false;
		return true;
	}
	
	boolean isConsonant(char now){
		return !isVowel(now) && Character.isLetter(now);
	}
	
	boolean isCharInString(char now, String foo){
		if(foo.indexOf(now) == -1)
			return false;	
		return true;
	}
	
	boolean dualSitsUnder(char thirdCarry, char secondCarry, char carry, char now){
		
		if(secondCarry == 'r' && thirdCarry == 'r')
			return true;
		
		if(secondCarry == 'r')
			return false;
		
		String djkt = unicode.getDjkt(carry, now);
		if(djkt != null)
			if(isCharInString(secondCarry, djkt))
				return true;

		String djktt = unicode.getDjktt(carry, now);
		if(djktt != null)
			return djktt.contains(Character.toString(thirdCarry)+Character.toString(secondCarry)); // ? true : false;

		// if we didn't cover it here, let's assume it sits under a consonant so we return true
		// but making it false has some advantages, e.g. the blocks that has only two lines
		// can be removed.. So when we're finished this function should return false
		return false;
	}
	
	boolean notJukta(char thirdCarry, char secondCarry, char carry, char now){
		
		if(now == 'r' || now == 'z' || now == 'w')
			return false;
	
		String foo = unicode.getDualJkt(secondCarry, carry);

		if(foo != null)
			return !isCharInString(now, foo); //? false : true;
		
		foo = unicode.getJkt(carry);
		if(foo != null)
			return !isCharInString(now, foo); // ? false : true;
		
		
		// if we didn't cover it here let's assume a consonant sits under it so we return false
		// but making it true has some advantages, e.g. the blocks that has only two lines
		// can be removed.. So when we're finished, this function should return true
		return true;
	}
	
}

