package metodosJava;

public class Main {
	public static void main(String[] args) {
		// Calculadora
		System.out.println("Calculadora");
		Calculadora.soma(9, 6);
		Calculadora.subtracao(10, 1.8);
		Calculadora.multiplicacao(4, 8);
		Calculadora.divisao(3, 2.5);

		// Mensagem
		System.out.println("Mensagem");
		Mensagem.obterMensagem(4);
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(1);

		// Empréstimo
		System.out.println("Empréstimo");
		Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(3000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		Emprestimo.calcular(1000, 2);

		// Quadrilatero
		System.out.println("Quadrilatero");
		Quadrilatero.area(5);
		Quadrilatero.area(5, 5);
		Quadrilatero.area(2.9, 17.5);
		Quadrilatero.area(15.7, 12.5, 17.9);
	}
}
