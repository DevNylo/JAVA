import java.util.Scanner;

class Ex85 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    // Exercício 85 - Joo-Kenn-Poo!

    String jogador, computador, winner;

    System.out.print("Escolha a sua jogada! ");
    jogador = inputScan.next();

    computador = compPlay();

    winner = analys(jogador, computador);

    System.out.println(winner);

  }
  public static String analys (String player1, String player2){
    
    String winner = "";

    if (player1.equalsIgnoreCase("Papel") && player2.equalsIgnoreCase("Pedra!")){
      winner = "Joo-Kenn-Poo!\nJogador "+player1+" x Máquina "+player2+"\nJogador Venceu!";
      
    }else if (player1.equalsIgnoreCase("Pedra") && player2.equalsIgnoreCase("Tesoura!")){
      winner = "Joo-Kenn-Poo!\nJogador "+player1+" x Máquina "+player2+"\nJogador Venceu!";
      
    }else if (player1.equalsIgnoreCase("Tesoura") && player2.equalsIgnoreCase("Papel!")){
      winner = "Joo-Kenn-Poo!\nJogador "+player1+" x Máquina "+player2+"\nJogador Venceu!";
      
    }else if(player1.equalsIgnoreCase("Tesoura")
           &&player2.equalsIgnoreCase("Tesoura!")
           ||player1.equalsIgnoreCase("Papel")
           &&player2.equalsIgnoreCase("Papel!")
           ||player1.equalsIgnoreCase("Pedra") 
           &&player2.equalsIgnoreCase("Pedra!")){
      winner = "Joo-Kenn-Poo!\nJogador "+player1+" x Máquina "+player2+"\nEmpate!";
      
    }else{
      winner = "Joo-Kenn-Poo!\nJogador "+player1+" x Máquina "+player2+"\nComputador Venceu!";
    }
    
    return winner;
  } 

  public static String compPlay() {

    double jogada = Math.ceil(Math.random() * 3);

    String computer = "";

    if (jogada == 1) {
      computer = "Papel!";
    } else if (jogada == 2) {
      computer = "Pedra!";
    } else {
      computer = "Tesoura!";
    }
    return computer;

  }
}