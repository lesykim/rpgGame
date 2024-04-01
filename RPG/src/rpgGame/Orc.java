package rpgGame;

public class Orc extends Monster{
	
	public Orc() {
		super("오크");
		this.hp = ran.nextInt(200)+100;
		this.maxhp = hp;
		this.limit = ran.nextInt(20)+10;
	}

}
