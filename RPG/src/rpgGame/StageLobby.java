package rpgGame;

public class StageLobby extends Stage{

	private int inputNumber() {
		while(true) {
			System.out.print(": ");
			String select =sc.next();
			int number = -1;
			try {
				number = Integer.parseInt(select);				
			} catch (Exception e) {
				System.err.println("숫자를 입력하세요.");
			}
			if(number == 1||number == 2) {
				return number;
			}else {
				System.err.println("잘못된 메뉴");
			}
		}
	}
	
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
