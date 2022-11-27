import java.util.Scanner;

class Ex127 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();

		String[] arrDeFrase = fraseFunArr(frase);

		exbSplit(arrDeFrase);

	}

	public static String[] fraseFunArr(String frase) {

		String[] fraseArr = frase.split(" ");

		return fraseArr;
	}

	public static void exbSplit(String[] arrDeFrase) {

		int tamanho = 0;
		
		for (String frase : arrDeFrase) {
			tamanho = tamanho + 1;
		}

		System.out.println("A frase contem " + tamanho + " palavras, e são elas:");

		for (String frase : arrDeFrase) {
			System.out.println(frase);

		}
	}
}