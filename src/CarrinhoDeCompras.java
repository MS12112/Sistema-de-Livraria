import java.util.ArrayList;

public class CarrinhoDeCompras  {

	protected ArrayList<Livro> livros = new ArrayList<Livro>();

	public double calcularTotal(){
		double total = 0.0;
		
		for (Livro l : livros) {
			
			total = total + l.calcularPrecoTotal();
		
		}
		
		return total;
	}


	public double PrecoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
