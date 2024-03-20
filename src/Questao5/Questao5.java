package Questao5;

public class Questao5 {

	public static void main(String[] args) {

	     String str = "Hello, world!"; // String a ser invertida
	        String strInvertida = inverterString(str);
	        System.out.println("String invertida: " + strInvertida);
	    }

	    public static String inverterString(String str) {
	        char[] caracteres = str.toCharArray(); // Converte a string em um array de caracteres
	        int inicio = 0;
	        int fim = caracteres.length - 1;

	        // Inverte os caracteres trocando os caracteres das extremidades até se encontrarem no meio
	        while (inicio < fim) {
	            // Troca os caracteres de posição
	            char temp = caracteres[inicio];
	            caracteres[inicio] = caracteres[fim];
	            caracteres[fim] = temp;

	            // Avança para o próximo par de caracteres
	            inicio++;
	            fim--;
	        }

	        // Retorna a string invertida
	        return new String(caracteres);
	    }
	}
	