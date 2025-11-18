
public abstract class Livro {
	
	//PROPRIEDADES

	protected String titulo;
	protected String autor;
	protected String isbn;
	protected Double preco;

	//METODO CONSTRUTOR
	public Livro(String titulo, String autor, String isbn, Double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}
	
	public Livro() {
		
	}


	//METODOS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public abstract double calcularPrecoTotal();

	
}
