package eslibroAutore;

public class main123 {
	public static void main(String[] args) {
		
		Author A1 = new Author("Samuele", "Del Moro", "SDM", "samueledelmoro@outlook.it");
		
		Book B1 = new Book("La Vita", A1, 20, 40);
		
		System.out.println(B1);
		B1.toString();
		A1.toString();
		
		
		
		}
	

}
