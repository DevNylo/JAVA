import java.util.Scanner;

class Ex75 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    String form, diaSemana, diaDoMes;
    byte diaMes, diaSem, mes;
    short ano;

    System.out.println("Qual o dia do MÊS? ");
    diaMes = inputScan.nextByte();

    System.out.println("Qual o DIA DA SEMANA (0 a 6) ");
    diaSem = inputScan.nextByte();

    System.out.println("Qual o MÊS de (0 a 12) ");
    mes = inputScan.nextByte();

    System.out.println("Qual o ANO? ");
    ano = inputScan.nextShort();

    diaSemana = diaSemFun(diaSem);
    diaDoMes = diaMesFun(mes);
    form = formFun(diaMes, diaSemana, diaDoMes, ano);

    System.out.println(form);

  }

  public static String diaSemFun(byte diaSem) {
    String dia = "";

    if (diaSem == 0) {
      dia = "Domingo";
    } else if (diaSem == 1) {
      dia = "Segunda-feira";
    } else if (diaSem == 2) {
      dia = "Terça-feira";
    } else if (diaSem == 3) {
      dia = "Quarta-feira";
    } else if (diaSem == 4) {
      dia = "Quinta-feira";
    } else if (diaSem == 5) {
      dia = "Sexta-feira";
    } else if (diaSem == 6) {
      dia = "Sábado";
    } else {
      dia = "Dia da semana inválido";
    }
    return dia;
  }

  public static String diaMesFun(byte mes) {
    String mesNome = "";
    if (mes == 1) {
      mesNome = "Janeiro";
    } else if (mes == 2) {
      mesNome = "Fevereiro";
    } else if (mes == 3) {
      mesNome = "Março";
    } else if (mes == 4) {
      mesNome = "Abril";
    } else if (mes == 5) {
      mesNome = "Maio";
    } else if (mes == 6) {
      mesNome = "Junho";
    } else if (mes == 7) {
      mesNome = "Julho";
    } else if (mes == 8) {
      mesNome = "Agosto";
    } else if (mes == 9) {
      mesNome = "Setembro";
    } else if (mes == 10) {
      mesNome = "Outubro";
    } else if (mes == 11) {
      mesNome = "Novembro";
    } else if (mes == 12) {
      mesNome = "Dezembro";
    } else {
      mesNome = "Mês inválido";
    }
    return mesNome;
  }

  public static String formFun(byte diaMes, String diaSem, String mes, short ano) {
    String abnt = "Enviado " + diaSem + " , " + diaMes + " de " + mes + " de " + ano;
    return abnt;
  }
}
