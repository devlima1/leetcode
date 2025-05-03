import java.util.HashMap;
import java.util.Map;

public class P409_LongestPalindrome {
    /**
     * Retorna o comprimento do maior palíndromo que pode ser formado com as letras
     * da string 's'.
     * Letras maiúsculas e minúsculas são tratadas como distintas.
     *
     * @param s String contendo letras maiúsculas e minúsculas.
     * @return O comprimento do maior palíndromo possível.
     *
     *         Complexidade do algoritmo:
     *         Tempo: O(n), onde n é o comprimento da string 's'. Percorre a string
     *         uma vez para contar os caracteres
     *         e uma vez para calcular o comprimento do palíndromo.
     *         Espaço: O(k), onde k é o número de caracteres distintos em 's'.
     */
    public int LongestPalindrome(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();

        // Pega a contagem de todos os caracteres do string s
        for (char currentChar : s.toCharArray()) {
            if (charCounts.containsKey(currentChar)) {
                charCounts.put(currentChar, charCounts.get(currentChar) + 1);
            } else {
                charCounts.put(currentChar, 1);
            }
        }

        int palindromeLenght = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            // Se o comprimento atual do palíndromo for par, podemos adicionar qualquer
            // caractere.
            if (palindromeLenght % 2 == 0) {
                palindromeLenght += entry.getValue();
                // O palíndromo atual tem comprimento ímpar.
            } else {
                // Se o caractere que queremos adicionar ocorre um número par de vezes, podemos
                // simplesmente adicioná-lo.
                if (entry.getValue() % 2 == 0) {
                    palindromeLenght += entry.getValue();
                } else {
                    palindromeLenght += entry.getValue() - 1;
                }
            }
        }
        return palindromeLenght;
    }
}
