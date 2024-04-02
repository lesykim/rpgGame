package rpgGame;

public class StageLobby extends Stage{
	
	@Override
	public boolean update() {
		System.out.println("====[LOBBY]====");
		System.out.println("[1.전투] [2.종료]");
		int select = inputNumber();
		if(select == 1) {
			GameManager.nextStage = "LOBBY";			
		}else if(select == 2) {
			GameManager.nextStage = "";
		}
		return false;
	}

	@Override
	public void init() {}

}
