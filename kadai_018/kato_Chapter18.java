package kadai_018;

public abstract class kato_Chapter18 {
	
	public String familyName;
	public String givenName;
	public String address;
	
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
