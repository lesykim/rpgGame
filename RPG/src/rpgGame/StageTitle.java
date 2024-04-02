package rpgGame;

public class StageTitle extends Stage{
	
	@Override
	public boolean update() {
		while(true) {
			System.out.println("==== TEXT RPG ====");
			System.out.println("[시작]을 입력하세요.");
			String start = sc.next();
			if(start.equals("시작")) {
				break;
			}
		}
		GameManager.nextStage = "BATTLE";
		return false;
	}

	@Override
	public void init() {}

}
