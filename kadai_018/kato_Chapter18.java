package kadai_018;

public abstract class kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区○×";
	
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
