package sample;

public class Dentaku {
		  public static void main(String args[]){
		    int a = 0;  /* 最初の数字 */
		    int b = 0;  /* 次の数字 */
		    String c;    /* 演算子 */
		    int d;     /* 結果を格納 */

		    if (args.length != 3){
		      errDisp("引数は3個入力して下さい");
		    }

		    try{
		      a = Integer.parseInt(args[0]);
		      b = Integer.parseInt(args[2]);
		    }catch(NumberFormatException e){
		      errDisp("数値でない値が入力されています");
		    }

		    c = args[1];

		    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
		    boolean errFlag = true;

		    for (int i = 0 ; i < 4 ; i++){
		      if (c.equals(opeStr[i])){
		        errFlag = false;
		      }
		    }

		    if (errFlag == true){
		      errDisp("演算子は kake waru tasu hiku の4つです");
		    }

		    if (c.equals("kake")){
		      d = a * b;
		    }else if (c.equals("tasu")){
		      d = a + b;
		    }else if (c.equals("hiku")){
		      d = a - b;
		    }else{
		      if (b == 0){
		        errDisp("0 で割ろうとしました");
		      }

		      d = a / b;
		    }

		    System.out.println("入力された式は " + a + " " + c + " " + b + " です");
		    System.out.println("計算結果は " + d + " です");
		  }

		  private static void errDisp(String errStr){
		    System.out.println("Usage : java dentaku 数値 演算子 数値");
		    System.out.println(errStr);
		    System.exit(0);  /* プログラムを終了する */
		  }
		}
