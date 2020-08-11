package paket;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Razno {

	String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	Random rand = new Random();
 
	Set<String> identifiers = new HashSet<String>();

	public String randomName() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(5)+5;
	        for(int i = 0; i < length; i++) {
	            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
	        }
	        if(identifiers.contains(builder.toString())) {
	            builder = new StringBuilder();
	        }
	    }
	    return builder.toString();
	}

	
	
	
	
	
	
}
