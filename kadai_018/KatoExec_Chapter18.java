package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		katoTaro_Chapter18 taro = new katoTaro_Chapter18();
		taro.setGivenName("太郎");
        taro.execIntroduce();
		
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName("一郎");
		ichiro.execIntroduce();
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName("花子");
        hanako.execIntroduce();
		

	}

}
