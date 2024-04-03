package rpgGame;

public abstract class Hero extends Unit{
	private boolean isShieldOn;

	public Hero(String name) {
		super(name);
	}
	
	@Override
	public void attack(Unit target) {
		int attack = ran.nextInt(getLimit())+getDefaultPower();
		// 전사 공격력2배스킬 유무 확인
		if(this.getName().equals("전사")) {
			Warrior warrior = (Warrior) this;
			if(warrior.isSkillOn()) {
				attack *= 2;
				warrior.setSkillOn(false);
				System.out.println("[전사] 스킬 사용으로 공격력이 2배 상승합니다.");
			}
		}
		int targetHp = target.getHp()-attack;
		
		if(targetHp <= 0) {
			System.out.printf("[%s]가 [%s]를 처치했습니다.\n",getName(),target.getName());
			targetHp = 0;
		}else {
			System.out.printf("[%s]가 [%s]에게 %d의 데미지를 입힙니다.\n",getName(),target.getName(),attack);
		}
		target.setHp(targetHp);
	}
	
	abstract public void Skill(Hero hero);

	public boolean isShieldOn() {
		return isShieldOn;
	}

	public void setShieldOn(boolean isShieldOn) {
		this.isShieldOn = isShieldOn;
	}
}
