package rpgGame;

public class Hiller extends Hero{
	
	public Hiller() {
		super("힐러");
		this.setHp(500);
		this.setMaxhp(getHp());
		this.setLimit(30);
		this.setDefaultPower(20);
	}

	@Override
	public void Skill(Hero hero) {
		int heroHp = hero.getHp()+10;
		if(hero.getMaxhp()<heroHp) {
			heroHp = hero.getMaxhp();
		}
		hero.setHp(heroHp);
		System.out.printf("[힐러]스킬을 [%s]에게 사용했습니다!\n[%s]의 체력이 +10 회복됩니다.",hero.getName(),hero.getName());
	}
	
}
