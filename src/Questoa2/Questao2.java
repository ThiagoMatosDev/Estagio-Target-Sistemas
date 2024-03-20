package Questoa2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
        
        scanner.close();
    }
    
    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        
        int a = 0;
        int b = 1;
        int soma = a + b;
        
        while (soma <= num) {
            if (soma == num) {
                return true;
            }
            a = b;
            b = soma;
            soma = a + b;
        }
        
        return false;
    }
}