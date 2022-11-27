import java.util.Scanner;

class Ex125 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Qual a quantidade de matérias: ");
		int qtdNotas = input.nextInt();

		double[] notas = notasFun(qtdNotas);
		double maior = maiorNota(notas);
		double menor = menorNota(notas);
		double medias = mediaNotas(notas);

		System.out.println("A Maior nota é: " + maior);
		System.out.println("A Menor nota é: " + menor);
		System.out.println("A média é: " + medias);

		digNota(notas);

	}

	public static double[] notasFun(int qtdNotas) {

		Scanner input = new Scanner(System.in);

		double[] notasArr = new double[qtdNotas];

		for (int i = 0; i < qtdNotas; i++) {
			System.out.print("Digite a nota: ");
			double nota = input.nextDouble();

			notasArr[i] = nota;
		}
		return notasArr;
	}

	public static double mediaNotas(double[] notas) {

		double tamNotas = notas.length;
		double mediaCount = 0;

		for (double media : notas) {
			mediaCount = mediaCount + media;

		}
		return mediaCount / tamNotas;

	}

	public static double maiorNota(double[] notas) {

		double notaRtn = 0;

		for (double maior : notas) {
			if (maior > notaRtn) {
				notaRtn = maior;
			}
		}
		return notaRtn;

	}

	public static double menorNota(double[] notas) {

		double notaRtn = 10;

		for (double menor : notas) {
			if (menor <= notaRtn) {
				notaRtn = menor;
			}
		}
		return notaRtn;

	}

	public static void digNota(double[] notas) {

		int i = 1;
		System.out.println("Notas digitadas:");

		for (double digitar : notas) {
			System.out.print(digitar);
			if(i < notas.length) {
				System.out.print(" - ");
			}
			i++;
		
		}

	}
}