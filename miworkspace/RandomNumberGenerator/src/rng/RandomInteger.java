package rng;
import java.util.Random;

public class RandomInteger {
	public static void main(String... aArgs){
	    log("Generating 10 random integers in range 0..99.");
	    
	    //note a single Random object is reused here
	    Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 10; ++idx){
	      int randomInt = randomGenerator.nextInt(2)+1;
	      log("Generated : " + randomInt);
	    }
	    
	    log("Done.");
	  }
	  
	  private static void log(String aMessage){
	    System.out.println(aMessage);
	  }
	}
