package eslibroAutore;

public class Book {
	private String nome;
	private Author Author1;
	private double prezzo;
	private int quantit�;
	
	
	public Book(String nome, Author author1, double prezzo, int quantit�) {
		super();
		this.nome = nome;
		Author1 = author1;
		this.prezzo = prezzo;
		this.quantit� = quantit�;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Author getAuthor1() {
		return Author1;
	}
	public void setAuthor1(Author author1) {
		Author1 = author1;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	@Override
	public String toString() {
		return "Book [nome=" + nome + " "+ Author1 +"]";
		
	}
	
	
	
	
	

}
