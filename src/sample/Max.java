package sample;

import java.util.Scanner;

class Max {

  public static void main(String args[]) {
    Scanner stdIn = new Scanner(System.in);
    int a, b, c, d;

    System.out.println("四つの整数を入力してください。");
    System.out.print("aの値：");  a = stdIn.nextInt();
    System.out.print("bの値：");  b = stdIn.nextInt();
    System.out.print("cの値：");  c = stdIn.nextInt();
    System.out.print("dの値：");  d = stdIn.nextInt();

    int max = getmax(a,b,c,d);
    System.out.println("最大値は" + max + "です。"); 
    int min = getmin(a,b,c,d);
    System.out.println("最小値は" + min + "です。");

  }
  
  public static int getmax(int a,int b, int c,int d){
	    int max = a;
	    if(b > max) max = b;
	    if(c > max) max = c;
	    if(d > max) max = d;
	    return max;
  }
  
  public static int getmin(int a,int b, int c,int d){
	    int min = a;
	    if(b < min) min = b;
	    if(c < min) min = c;
	    if(d < min) min = d;
	    return min;
  }
}