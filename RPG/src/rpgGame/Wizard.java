package rpgGame;

public class Wizard extends Hero {

	public Wizard() {
		super("마법사");
		this.hp = 800;
		this.maxhp = hp;
		this.limit = ran.nextInt(30)+20;
	}

	@Override
	public void Skill() {
		
	}

}
