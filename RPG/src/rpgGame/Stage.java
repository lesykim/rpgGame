package rpgGame;

import java.util.Scanner;

public abstract class Stage {
	public Scanner sc = new Scanner(System.in);
	public abstract boolean update();
	public abstract void init();
}
