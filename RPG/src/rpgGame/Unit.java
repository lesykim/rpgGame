package rpgGame;

import java.util.Random;

public class Unit {
	Random ran = new Random();
	
	String name;
	int hp;
	int maxhp;
	int limit;
	
	public Unit(String name) {
		this.name = name;
	}
}
