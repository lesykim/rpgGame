package rpgGame;

public class Hiller extends Hero{

	public Hiller() {
		super("힐러");
		this.hp = 500;
		this.maxhp = hp;
		this.limit = ran.nextInt(30)+20;
	}

	@Override
	public void Skill() {
		
	}
	
}
