package sample;
public class PrimeNum {

    public static void main(String args[]) {
    	int num = Integer.parseInt(args[0]);
    	boolean b = checkPrimeNum(num);
    	
    	if(b) {
    		System.out.println(num + "は素数です。");
    	}else {
    		System.out.println(num + "は素数ではありません。");
    	}
    }
    
    public static boolean checkPrimeNum(int num){
    	boolean b = false;
    	if(num == 2)  {
    		b = true;
    	}else if(num < 2 || num % 2 == 0) {
    		b = false;
    	}else {
    		for(int n = 3; n <= Math.sqrt((double)num); n += 2) {
    			if(num % n == 0) {
    				b = false;
    				break;
    			}
    		}
    	}
    	return b;
    }
}