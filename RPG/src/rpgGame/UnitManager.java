package rpgGame;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager {
	private Random ran = new Random();
	
	private String packageName = "rpgGame.";
	private String[] monsterNames = {"Bat","Orc","Wolf"};
	public ArrayList<Monster> monsters;
	public ArrayList<Hero> heros;
	
	public void settingMonster(int size) {
		for(int i = 0; i<size; i++) {
			int n = ran.nextInt(3);
			try {
				Class<?> monsterClass = Class.forName(packageName+monsterNames[n]);
				Object obj = monsterClass.getDeclaredConstructor().newInstance();
				
				if(obj instanceof Monster) {
					Monster monster = (Monster) obj;
					monster.setHp(ran.nextInt(200)+100);
					monster.setMaxhp(monster.getHp());
					monster.setLimit(ran.nextInt(20)+10);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void settingHero() {
		heros.add(new Warrior());
		heros.add(new Wizard());
		heros.add(new Hiller());
	}
	
}
