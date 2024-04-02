package rpgGame;

public class Warrior extends Hero{

	private boolean isSkillOn;
	
	public Warrior() {
		super("전사");
		
		this.setHp(1000);
		this.setMaxhp(getHp());
		this.setLimit(30);
		this.setDefaultPower(20);
	}

	@Override
	public void Skill(Hero hero) {
		isSkillOn = true;
		System.out.printf("[전사]스킬을 사용했습니다!\n다음턴 전사의 공격력은 두배가 됩니다.\n");
	}

	public boolean isSkillOn() {
		return isSkillOn;
	}

	public void setSkillOn(boolean isSkillOn) {
		this.isSkillOn = isSkillOn;
	}

}
