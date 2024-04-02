package rpgGame;

import java.util.HashMap;
import java.util.Map;

public class GameManager {
	static String nextStage = "";
	String curStage = "";
	
	Map<String, Stage> stageList = new HashMap<>();
	
	public GameManager() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("LOBBY", new StageLobby());
		
		nextStage = "TITLE";
	}
	
	private boolean changeStage() {
		return true;
	}
	
	public void run() {
		while(true) {
			if(!changeStage()) {
				break;
			}
		}
		System.err.println("GAME OVER");
	}
}
