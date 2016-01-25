package sample;

public class Kinshu {
	
	  public static final int[] YEN_TYPES = {
	    10000,5000,1000,500,100,50,10,5,1
	  };
	  
	  public static final int LENGTH = YEN_TYPES.length;
	  public static void main(String[] args) {
	    int yen = 87654;
	    int[] count = new int[LENGTH];
	    
	    for (int i = 0; i < LENGTH; i++) {
	      while (yen >= YEN_TYPES[i]) {
	        yen -= YEN_TYPES[i];
	        count[i]++;
	      }
	    }
	    
	    for (int i = 0; i < LENGTH; i++) {
	      System.out.println(YEN_TYPES[i] + "円\t" + count[i] + "枚");
	    }
	  }
	}
