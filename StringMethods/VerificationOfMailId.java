package xworkz.com.strings;

public class VerificationOfMailId {

	public static void main(String[] args) {
		String email="poojarangrej@outlook.com";
		
		boolean endsWith=email.endsWith(".com");
		
		boolean microsoft=email.contains("outlook.com");
		boolean google=email.contains("gmail.com");
		boolean yahoo=email.contains("yahoo.com");
		
		if(microsoft==true && endsWith==true) {
			System.out.println("It is free webmail service from Microsoft");		
		}else if(google==true && endsWith==true) {
			System.out.println("It is free webmail service from Google");		
		}else if(yahoo==true && endsWith==true) {
			System.out.println("It is Yahoo Mail used for spam filtering");		
		}

		

	}

}
