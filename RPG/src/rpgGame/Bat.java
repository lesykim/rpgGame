package rpgGame;

public class Bat extends Unit{
	
	public Bat(String name) {
		super("박쥐");
		this.hp = ran.nextInt(200)+100;
		this.maxhp = hp;
		this.power = ran.nextInt(20)+10;
	}

}
