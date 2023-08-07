import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinha {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        int numeroDigitado, tentativa = 0;
        boolean acerto = false;
        String primeiroNome = "";
        System.out.println("Desafio de adivinhação!!!!");
        System.out.println("Este software gera randomicamente um número de 0 a 100.");
        System.out.println("Com isso, você tem 5 tentativas para advinhar qual esse número randomizado.");
        System.out.print("Digite seu primeiro nome: ");
        Scanner entrada = new Scanner(System.in);
        primeiroNome = entrada.nextLine();
        while (tentativa < 5) {
            System.out.print("Digite um número de 0 a 100: ");
            numeroDigitado = entrada.nextInt();
            tentativa++;
            if (numeroDigitado > numero) {
                System.out.println("Número inserido é maior");
                acerto = false;
            } else if (numeroDigitado < numero) {
                System.out.println("Número inserido é menor");
                acerto = false;
            } else {
                System.out.println(String.format("Parabéns %s! Você adivinhou o número randomizado = %d",primeiroNome, numeroDigitado));
                acerto = true;
                break;
            }
        }
        if (!acerto) {
            System.out.println("Número randomizado é: " + numero);
            System.out.println("Infelizmente você não adivinhou o número.");
        }

    }
}
