package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice(){
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in); 
		
		String input = scanner.next();
		
		while (!(input.equals("r") || input.equals("s") || input.equals("p"))) {
			System.out.println("正しい文字を入力して下さい(r/s/p)");
			input = scanner.next();
		}
		
		return input;
		
		
	}
	
	public String getRandom() {
		
		String[] aiteArray = {"r","s","p"};
		
		int index = (int)Math.floor(Math.random()* 3);
		
		return aiteArray[index];
			
		
	}
	
	public void playGame() {
		
		String myhand = getMyChoice();
		String aitehand = getRandom();
		
		HashMap<String,String> jankenMap = new HashMap<String,String>();
		jankenMap.put("r", "グー");
		jankenMap.put("s", "チョキ");
		jankenMap.put("p", "パー");
		
		System.out.println("自分の手は"+ jankenMap.get(myhand)+ ",対戦相手の手は"+ jankenMap.get(aitehand));

		
		if (myhand.equals(aitehand)) {
			System.out.println("あいこです");
		}else if (
		    (myhand.equals("r") && aitehand.equals("s"))|| 
		    (myhand.equals("s") && aitehand.equals("p"))|| 
		    (myhand.equals("p") && aitehand.equals("r"))){
		    	System.out.println("自分の勝ちです");
		    }else {
		    	System.out.println("自分の負けです");
		    }
		
	}

}
