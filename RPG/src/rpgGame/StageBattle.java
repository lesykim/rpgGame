package rpgGame;

import java.util.ArrayList;
import java.util.Random;

public class StageBattle extends Stage{
	private Random ran = new Random();
	private UnitManager unitManager;
	private ArrayList<Hero> heros;
	private ArrayList<Monster> monsters;
	
	public StageBattle() {
		unitManager = new UnitManager();
		heros = null;
		monsters = null;
	}
	
	@Override
	public void init() {
		unitManager.monsters.clear();
		unitManager.settingMonster(4);
		heros = null;
		heros = unitManager.heros;
	}
	
	private void heroAttack(int idx) {
		Hero hero = heros.get(idx);
		if(hero.getHp() <= 0) {
			return;
		}
		
		System.out.println("==== [메뉴 선택] ====");
		System.out.printf("[%s] ",hero.getName());
		System.out.println("[1.어택] [2.스킬]");
		int select = inputNumber();
		if(select == 1) {
			while(true) {
				int index = ran.nextInt(monsters.size());
				Monster monster = monsters.get(index);
				if(monster.getHp() > 0) {
					hero.attack(monster);
					break;
				}
			}
		}else if(select == 2) {
			if(idx == 0) {
				// 전사 스킬 : 다음 전투시 자신의 공격력 두배 && 이번턴 공격 X
				hero.Skill(hero);
			}else if(idx == 1) {
				// 법사 스킬 : 이번턴 아군 한명에게 랜덤으로 쉴드 생성
				int h = ran.nextInt(heros.size());
				hero.Skill(heros.get(h));
			}else if(idx == 2) {
				// 힐러 스킬 : 이번턴 아군 한명에게 랜덤으로 힐
				int h = ran.nextInt(heros.size());
				hero.Skill(heros.get(h));
			}
		}
	}
	
	@Override
	public boolean update() {
		GameManager.nextStage = "BATTLE";
		
		for(int i = 0; i<heros.size(); i++) {
			heroAttack(i);
		}
		return false;
	}

}
