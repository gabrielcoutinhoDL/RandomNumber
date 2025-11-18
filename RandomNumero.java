
import java.util.Scanner;
import java.util.Random;

public class RandomNumero {

    public static void main(String[] args) {
    int numMax = 100;
    int numMin = 0;
    int tentativas = 0;
    int numDigitado = -1;

    Random numRandom = new Random();

    int numSorteio = numRandom.nextInt(100);

    Scanner sc = new Scanner(System.in);

    System.out.println("### SISTEMA DE ADIVINHAÇÃO NUMÉRICA ###");

    while (numDigitado != numSorteio){
        tentativas++;
        System.out.println(tentativas + "° tentativa");
        System.out.println("Digite um número entre " + numMin + " e " + numMax +":");
        numDigitado = sc.nextInt();
        
        if (numMin<numDigitado && numDigitado<numSorteio){
            numMin = numDigitado;
        }

        if (numMax > numDigitado && numDigitado>numSorteio){
            numMax = numDigitado;
        } 
    }
        System.out.println("Parabéns ! Você acertou com " + tentativas + " tentativa! O numéro sorteado foi: " + numSorteio);
    }
}
