package rpgGame;

public class Monster extends Unit{

	public Monster(String name) {
		super(name);
	}

	@Override
	public void attack(Unit target) {
		int attack = ran.nextInt(getLimit())+getDefaultPower();
		// 쉴드 구현
		Hero hero = (Hero) target;
		if(hero.isShieldOn()) {
			System.out.printf("[%s]에게 쉴드가 있습니다. \n[%s]는 데미지를 입히지 못합니다.\n",target.getName(),getName());
			hero.setShieldOn(false);
			return;
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

}
