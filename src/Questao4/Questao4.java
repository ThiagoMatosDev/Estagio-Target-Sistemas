package Questao4;

public class Questao4 {

	public static void main(String[] args) {

	       // Simulando a situação
        boolean[] interruptores = {false, false, false}; // false representa desligado
        boolean[] situacaoInicial = new boolean[interruptores.length];

        // Salva a situação inicial das lâmpadas
        for (int i = 0; i < interruptores.length; i++) {
            situacaoInicial[i] = interruptores[i];
        }

        // Primeira ida à sala
        ligarInterruptor(interruptores, 0); // Ligar o primeiro interruptor
        desligarInterruptor(interruptores, 0); // Desligar o primeiro interruptor e ligar o segundo

        // Segunda ida à sala
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i] != situacaoInicial[i]) {
                System.out.println("O interruptor " + (i + 1) + " controla a lâmpada.");
            }
        }
    }

    // Método para ligar um interruptor
    public static void ligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = true;
    }

    // Método para desligar um interruptor
    public static void desligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = false;
    }
}
