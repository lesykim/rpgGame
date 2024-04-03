package rpgGame;

import java.util.Random;

public abstract class Unit {
	public Random ran = new Random();
	
	private String name;
	private int hp;
	private int maxhp;
	private int limit;
	private int defaultPower;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getDefaultPower() {
		return defaultPower;
	}

	public void setDefaultPower(int defaultPower) {
		this.defaultPower = defaultPower;
	}
	
	public void printData() {
		System.out.printf("[%s] [%d/%d] [%d]\n",name,hp,maxhp,limit+defaultPower);
	}
	
	public abstract void attack(Unit target);

}
