enum Beer{
	Kingfisher,BeeraBoom , BeeraWhite, BeeraGrey;
}
class EnumTest{
	public static void main(String[] args){
		System.out.println("Hello Enum "+Beer.BeeraBoom);
		Beer b[]= Beer.values();
		for(Beer b1:b){
			System.out.println(b1);
		}
	}
}