import pack.Addition;
import pack.Substraction;
class PackageUse{
	public static void main(String[] args) {
		double res1=Addition.add(22,3);
		System.out.println("Addition is: "+res1);

		double res2=Substraction.sub(33,2);
		System.out.println("Substraction is: "+res2);
	}
}