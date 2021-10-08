package xworkz.com.strings;

public class LastIndexOf {

	public static void main(String[] args) {
		String tree="Mango tree to Mango Fruit";
		int mango=tree.lastIndexOf('M');
		System.out.println(mango);
		
		String toy="barbie baby doll barbie";
		int doll=toy.lastIndexOf("bar");
		System.out.println(doll);
		
		String state="Karnataka State";
		int KA=state.lastIndexOf('t', 13);
		System.out.println(KA);
		
		String country="India Indian";
		int nation=country.lastIndexOf("Ind", 'a');
		System.out.println(nation);
	}

}
