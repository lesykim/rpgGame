package rpgGame;

public class Wizard extends Hero {

	public Wizard() {
		super("마법사");
		this.setHp(800);
		this.setMaxhp(getHp());
		this.setLimit(30);
		this.setDefaultPower(20);
	}

	@Override
	public void Skill(Hero hero) {
		hero.setShieldOn(true);
		System.out.printf("[마법사]스킬을 [%s]에게 사용했습니다!\n[%s]에게 쉴드가 생성되었습니다.\n",hero.getName(),hero.getName());
	}
	
}
