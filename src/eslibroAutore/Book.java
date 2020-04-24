package eslibroAutore;

public class Book {
	private String nome;
	private Author Author1;
	private double prezzo;
	private int quantità;
	
	
	public Book(String nome, Author author1, double prezzo, int quantità) {
		super();
		this.nome = nome;
		Author1 = author1;
		this.prezzo = prezzo;
		this.quantità = quantità;
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
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	@Override
	public String toString() {
		return "Book [nome=" + nome + " "+ Author1 +"]";
		
	}
	
	
	
	
	

}
