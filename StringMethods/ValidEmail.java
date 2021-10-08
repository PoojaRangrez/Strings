package xworkz.com.strings;

public class ValidEmail {

	public static void main(String[] args) {
		String email="xworkzpooja.com";
        boolean contains=email.contains("@gmail");
        boolean endsWith=email.endsWith(".com");
        if(contains==true && endsWith==true) {
        	System.out.println("Valid emailId");
        }else {
        	System.out.println("Plese provide valid emailId");
        }		
	}

}
