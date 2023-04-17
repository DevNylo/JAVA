import java.util.Random;
import java.util.Scanner;

class Ex126 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o tamanho do Array: ");
		int tamanho = input.nextInt();

		System.out.println("Qual o número: ");
		int num = input.nextInt();

		int[] tamanhoArr = tamanhoFun(tamanho);
		int valores = numGerados(num, tamanhoArr);

		System.out.println("\nO número " + num + " encontra-se na posição: " + valores);
		System.out.println("\nOs números digitados foram: \n");
		exbNum(tamanhoArr);
	}

	public static int[] tamanhoFun(int tamanho) {

		Random random = new Random();

		int[] arrNum = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			int randNum = random.nextInt(0, 10);
			arrNum[i] = randNum;
		}
		return arrNum;

	}

	public static int numGerados(int num, int[] tamanhoArr) {

		int valor = 0;
		int i = 0;

		for (int digitados : tamanhoArr) {
			if (num == digitados) {
				valor = i;
				break;
			} else {
				valor = -1;
			}
			i++;
		}
		return valor;
	}

	public static void exbNum(int[] tamanhoArr) {

		for (int digitados : tamanhoArr) {
			System.out.print(digitados + " ");
		}
	}

}