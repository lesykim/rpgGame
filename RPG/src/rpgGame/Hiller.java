package rpgGame;

public class Hiller extends Hero{

	public Hiller() {
		super("힐러");
		this.setHp(500);
		this.setMaxhp(getHp());
		this.setLimit(ran.nextInt(30)+20);
	}

	@Override
	public void Skill() {
		
	}
	
}
