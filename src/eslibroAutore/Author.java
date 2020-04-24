package eslibroAutore;

public class Author {
	
	String Nome;
	String Cognome;
	String Gender;
	String Mail;
	
	
	
	public Author(String nome, String cognome, String gender, String mail) {
		super();
		Nome = nome;
		Cognome = cognome;
		Gender = gender;
		Mail = mail;
	}



	@Override
	public String toString() {
		
		return "Pseudo=" + Gender + "";
	}
	}


