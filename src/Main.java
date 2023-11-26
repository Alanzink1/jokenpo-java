import java.util.Objects;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String reco = "s";

        Scanner scan = new Scanner(System.in);

        String ali = "s";

        while(ali.equalsIgnoreCase("s")) {
            System.out.println("""
                    ===============
                      JO KEN PO!
                    ===============
                    Jogador 1:
                                        
                    [0] Pedra
                    [1] Papel
                    [2] Tesoura
                                        
                    Faça sua escolha:
                    """);
            int escolhaJogador1 = scan.nextInt();
            System.out.printf("%n%n%n%n%n");
            System.out.println("""
                    ===============
                      JO KEN PO!
                    ===============
                    Jogador 2:
                                        
                    [0] Pedra
                    [1] Papel
                    [2] Tesoura
                                        
                    Faça sua escolha:
                    """);
            int escolhaJogador2 = scan.nextInt();

            if (escolhaJogador1 > 2 || escolhaJogador2 > 2) {
                System.out.println("Inválido! Recomece...");
            } else {
                if (escolhaJogador1 == 0 && escolhaJogador2 == 1) {
                    System.out.println("""
                                   Jogador 1: Pedra
                                   Jogador 2: Papel
                            ///Ganhador: Papel (Jogador 2)///
                            """);
                } else if (escolhaJogador1 == 1 && escolhaJogador2 == 2) {
                    System.out.println("""
                                   Jogador 1: Papel
                                   Jogador 2: Tesoura
                            ///Ganhador: Tesoura (Jogador 2)///
                            """);
                } else if (escolhaJogador1 == 0 && escolhaJogador2 == 2) {
                    System.out.println("""
                                   Jogador 1: Pedra
                                   Jogador 2: Tesoura
                            ///Ganhador: Pedra (Jogador 1)///
                            """);
                } else if (escolhaJogador1 == 1 && escolhaJogador2 == 0) {
                    System.out.println("""
                                   Jogador 1: Papel
                                   Jogador 2: Pedra
                            ///Ganhador: Papel (Jogador 1)///
                            """);
                } else if (escolhaJogador1 == 2 && escolhaJogador2 == 1) {
                    System.out.println("""
                                   Jogador 1: Tesoura
                                   Jogador 2: Papel
                            ///Ganhador: Papel (Jogador 1)///
                            """);
                } else if (escolhaJogador1 == 2 && escolhaJogador2 == 0) {
                    System.out.println("""
                                   Jogador 1: Tesoura
                                   Jogador 2: Pedra
                            ///Ganhador: Papel (Jogador 2)///
                            """);
                } else {
                    System.out.println("/// EMPATE ///");
                }
            }

            System.out.printf("%n%n%nDeseja continuar a jogar? (s/n)");
            ali = scan.next();
        }
    }
}