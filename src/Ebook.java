
public class Ebook extends Livro {



	public Ebook(String titulo, String autor, String isbn, Double preco, double tamanhoEmMb) {
		super(titulo, autor, isbn, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	//PROPRIEDADES
	protected double tamanhoEmMb;

	//METODOS
	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}

	
	@Override
	public double calcularPrecoTotal() {
		return this.getPreco();
	}



}
