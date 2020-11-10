package TelaPizza;

import java.util.Scanner;

import Engine.Calculo;
import Engine.Pizza;

public abstract class TelaPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int diametro = 0;
		float preco = 0;
		Calculo calculo = null;
		String nome = null;
		int tamanho = 0;
		int raio = tamanho / 2;
		Pizza[] pizza;

		boolean booleano = true;
		
		while (booleano == true) {
			char decisao = '2';
			System.out.println("SEJA BEM VINDO A NOSSA TABELA DE PIZZAS (CUSTO E BENEFICIO");
			boolean booleanoIf = true;

			if (booleanoIf == true) {

				pizza = new Pizza[10];

				for (int i = 0; i < pizza.length + 1; i++) {
					System.out.println(" Digite uma pizza:");
					nome = ler.next();
					System.out.println("Digite o tamanho(Será calculado em Centimetros) :");
					tamanho = ler.nextInt();
					System.out.println("Digite o Preço R$:");
					preco = ler.nextFloat();
					raio = tamanho / 2;
					Calculo calcCB = new Calculo(nome, tamanho, preco);
					int calcCircuferencia = 0;
					int resultado = calcCB.CalculoC(tamanho, calcCircuferencia, raio);

					System.out.println("Deseja continuar selecionando ou deseja exibir calculo?  ");
					System.out.println("Para Selecionar mais pizzas digite 'S', e para calcular digite C:");
					decisao = ler.next().charAt(0);
					if (decisao == 'C') {
						System.out.println("Pizza: "+ nome+ " || tamanho em Cm: " + tamanho + " || Preço R$: "+ preco + " || Calculo da circunferencia: " + calcCB.CalculoC(tamanho, calcCircuferencia, raio));
						
						
						booleano = false;
					}
				}
			}
			

		}
	}
}
