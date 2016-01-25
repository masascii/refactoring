package sample;

public class Uruu {
	public static void main(String args[]) {
		if (args.length!=1) {
			System.out.println("西暦を入力してください。");
			return;
		}
		// String 型のコマンドライン引数 args[0] を int 型に変換
		int a = Integer.parseInt(args[0]);
		Uruucheck(a);
	}
	
	public static void Uruucheck(int a){
		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println(a + "年は閏年です。");
		} else {
			System.out.println(a + "年は閏年ではありません。");
		}
	}
}
