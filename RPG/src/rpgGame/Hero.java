package rpgGame;

public abstract class Hero extends Unit{
	private boolean isShieldOn;

	public Hero(String name) {
		super(name);
	}
	
	public void attack(Unit target) {
		int attack = ran.nextInt(getLimit())+getDefaultPower();
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
