package rpgGame;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager {
	private Random ran = new Random();
	
	private String packageName = "rpgGame.";
	private String[] monsterNames = {"Bat","Orc","Wolf"};
	private String[] heroNames = {"Warrior","Wizard","Healer"};
	public ArrayList<Monster> monsters;
	public ArrayList<Hero> heros;
	
	public UnitManager() {
		monsters = new ArrayList<>();
		heros = new ArrayList<>();
		settingHero();
	}
	
	private void settingUnit(String[] unitName, int index) {
		try {
			Class<?> unitClass = Class.forName(packageName+unitName[index]);
			Object obj = unitClass.getDeclaredConstructor().newInstance();
			
			if(obj instanceof Monster) {
				Monster monster = (Monster) obj;
				monster.setHp(ran.nextInt(200)+100);
				monster.setMaxhp(monster.getHp());
				monster.setLimit(ran.nextInt(20)+10);
				monsters.add(monster);
			}else if(obj instanceof Hero) {
				Hero hero = (Hero) obj;
				heros.add(hero);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void settingMonster(int size) {
		for(int i = 0; i<size; i++) {
			int n = ran.nextInt(3);
			settingUnit(monsterNames, n);
		}
	}
	
	public void settingHero() {
		for(int i = 0; i<3; i++) {
			settingUnit(heroNames, i);
		}
	}
	
}
