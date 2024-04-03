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
		monsters = null;
		monsters = unitManager.monsters;
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
	
	private void printInfo() {
		System.out.println("=====[Heros]=====");
		for(Hero hero : heros) {
			hero.printData();
		}
		System.out.println("====[Monsters]===");
		for(Monster monster : monsters) {
			monster.printData();
		}
	}
	
	private void monsterAttack(int index) {
		Monster monster = monsters.get(index);
		if(monster.getHp() <= 0) {
			return;
		}
		while(true) {
			int idx = ran.nextInt(heros.size());
			Hero hero = heros.get(idx);
			if(monster.getHp() > 0) {
				monster.attack(hero);
				break;
			}
		}
	}
	
	private boolean isGameOver() {
		int n = 0;
		for(Hero hero : heros) {
			if(hero.getHp() <= 0) {
				n++;
			}
		}
		if(n == heros.size()) {
			return true;
		}
		return false;
	}
	
	private boolean isStageClear() {
		int n = 0;
		for(Monster monster : monsters) {
			if(monster.getHp() <= 0) {
				n++;
			}
		}
		if(n == monsters.size()||isGameOver()) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean update() {
		while(true) {
			for(int i = 0; i<heros.size(); i++) {
				printInfo();
				heroAttack(i);
				if(isStageClear()) {
					break;				
				}
			}
			System.out.println("====!!Monster Attack!!====");
			for(int i = 0; i<monsters.size(); i++) {
				monsterAttack(i);
			}
			if(isStageClear()) {
				break;				
			}
		}
		if(isGameOver()) {
			GameManager.nextStage = "";
		}else {
			System.out.println("STAGE CLEAR!");
			GameManager.nextStage = "BATTLE";			
		}
		return false;
	}

}
