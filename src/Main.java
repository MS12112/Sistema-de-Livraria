
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		LivroFisico fl = new LivroFisico("Matheus", " Ig", " 123456", 25.0, 1.0);
		
		carrinho.livros.add(fl);
		
		System.out.println(carrinho.calcularTotal());
	}

}
