package Questao3;

public class Questao3 {

	public static void main(String[] args) {

	     // Sequência a)
        int proximoA = proximoElementoA(7);
        System.out.println("Sequencia a): " + proximoA);

        // Sequência b)
        int proximoB = proximoElementoB(64);
        System.out.println("Sequencia b): " + proximoB);

        // Sequência c)
        int proximoC = proximoElementoC(36);
        System.out.println("Sequencia c): " + proximoC);

        // Sequência d)
        int proximoD = proximoElementoD(64);
        System.out.println("Sequencia d): " + proximoD);

        // Sequência e)
        int proximoE = proximoElementoE(8);
        System.out.println("Sequencia e): " + proximoE);

        // Sequência f)
        int proximoF = proximoElementoF(19);
        System.out.println("Sequencia f): " + proximoF);
    }

    // Método para encontrar o próximo elemento da sequência a)
    public static int proximoElementoA(int ultimo) {
        return ultimo + 2;
    }

    // Método para encontrar o próximo elemento da sequência b)
    public static int proximoElementoB(int ultimo) {
        return ultimo * 2;
    }

    // Método para encontrar o próximo elemento da sequência c)
    public static int proximoElementoC(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 1) * (raiz + 1);
    }

    // Método para encontrar o próximo elemento da sequência d)
    public static int proximoElementoD(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo) + 1;
        return raiz * raiz;
    }

    // Método para encontrar o próximo elemento da sequência e)
    public static int proximoElementoE(int ultimo) {
        int a = 1;
        int b = 1;
        int soma = a + b;
        while (soma <= ultimo) {
            a = b;
            b = soma;
            soma = a + b;
        }
        return soma;
    }

    // Método para encontrar o próximo elemento da sequência f)
    public static int proximoElementoF(int ultimo) {
        return ultimo + 1;
    }
}
