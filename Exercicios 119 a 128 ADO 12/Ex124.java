import java.util.Scanner;

class Ex124 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int numero = input.nextInt();

		int[] tabNum = doubroFun(numero);

		formTab(tabNum);
	}

	public static int[] doubroFun(int numero) {

		int[] numArr = new int[10];

		for (int i = 0; i < 10; i++) {
			numArr[i] = numero;
		}
		return numArr;
	}

	public static void formTab(int[] tabNum) {

		int i = 1;
		for (int numeros : tabNum) {
			System.out.println(i + " x " + numeros + " = " + numeros * i);
			i++;

		}
	}
}