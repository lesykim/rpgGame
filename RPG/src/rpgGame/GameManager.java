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
		
		curStage = "TITLE";
		nextStage = "LOBBY";
	}
	
	private boolean changeStage() {
		System.out.println("curStage : " + curStage);
		System.out.println("nextStage : " + nextStage);
		
		Stage stage = stageList.get(curStage);
		stage.init();
		
		curStage = nextStage;
		
		while(true) {
			if(!stage.update()) {
				break;
			}
		}
		
		if(nextStage.equals("")) {
			return false;
		}else {
			return true;			
		}
		
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
