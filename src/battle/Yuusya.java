package battle;

public class Yuusya {
	private String name = "Toukoudai Tarou";
	
	public String getName() {
		return name;
	}
	
	public void battle(Monster m) {
		if(m.getHp() <= 50) {
			System.out.println("Victory!");
		}else if(m.getAttack() >= 10) {
			System.out.println("Lose");
		}
	}
	
	public static void main(String args[]) {
		Yuusya y = new Yuusya();
		Monster m = new Monster();
		y.battle(m);
	}
}
