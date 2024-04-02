package rpgGame;

public class Wizard extends Hero {

	public Wizard() {
		super("마법사");
		
		this.setHp(800);
		this.setMaxhp(getHp());
		this.setLimit(ran.nextInt(30)+20);
	}

	@Override
	public void Skill() {
		
	}

}
