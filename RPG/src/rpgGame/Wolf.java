package rpgGame;

public class Wolf extends Monster{

	public Wolf(String name) {
		super("늑대");
		this.hp = ran.nextInt(200)+100;
		this.maxhp = hp;
		this.limit = ran.nextInt(20)+10;
	}

}
