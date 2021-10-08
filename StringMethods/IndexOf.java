package xworkz.com.strings;

public class IndexOf {

	public static void main(String[] args) {
	   String name="Pooja";
	   int indexOf=name.indexOf('a');
       System.out.println(indexOf);
       
       String college="Pdit Hospet";
       int col=college.indexOf('o',6); 
       System.out.println(col);
       
       String city="Vijayanagara district";
       int place=city.indexOf("dis");
       System.out.println(place);
       
       String company="Tech Mahindra";
       int job=company.indexOf("dra",1);
       System.out.println(job);
	}

}
