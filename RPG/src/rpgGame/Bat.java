package rpgGame;

public class Bat extends Monster{
	
	public Bat(String name) {
		super("박쥐");
		this.hp = ran.nextInt(200)+100;
		this.maxhp = hp;
		this.limit = ran.nextInt(20)+10;
	}

}
