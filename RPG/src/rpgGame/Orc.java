package rpgGame;

public class Orc extends Unit{
	
	public Orc() {
		super("오크");
		this.hp = ran.nextInt(200)+100;
		this.maxhp = hp;
		this.power = ran.nextInt(20)+10;
	}

}
