package rpgGame;

public class Warrior extends Hero{

	public Warrior() {
		super("전사");
		this.hp = 1000;
		this.maxhp = hp;
		this.limit = ran.nextInt(30)+20;
	}

	@Override
	public void Skill() {
		
	}

}
