import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class P20_ValidParentheses {
    /**
     * Verifica se a string contém parênteses bem formados.
     *
     * @param input String contendo apenas os caracteres '(', ')', '{', '}', '[' e ']'.
     * @return true se a string for válida; false caso contrário.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho da string 'input'. Cada caractere é processado uma única vez.
     * Espaço: O(n), no pior caso todos os caracteres são empilhados, como em "(((((((".
     */
    public boolean isValid(String input) {
        // Mapeia os parênteses de fechamento para seus correspondentes de abertura
        Map<Character, Character> closingToOpeningMap = new HashMap<>();
        closingToOpeningMap.put(')', '(');
        closingToOpeningMap.put(']', '[');
        closingToOpeningMap.put('}', '{');

        // Pilha para armazenar os parênteses de abertura enquanto percorre a string
        Stack<Character> openBrackets = new Stack<>();

        // Percorre cada caractere da string
        for (int currentIndex = 0; currentIndex < input.length(); currentIndex++) {
            char currentChar = input.charAt(currentIndex);

            // Se o caractere for um parêntese de abertura, empilha
            if (!closingToOpeningMap.containsKey(currentChar)) {
                openBrackets.push(currentChar);
            } else {
                // Se for um parêntese de fechamento, verifica se há correspondência
                if (openBrackets.isEmpty()) {
                    return false; // Retorna falso se não houver parêntese de abertura para fechar
                }

                // Desempilha o parêntese de abertura mais recente
                char lastOpened = openBrackets.pop();
                // Obtém o parêntese esperado de abertura para o caractere de fechamento atual
                char expectedOpening = closingToOpeningMap.get(currentChar);

                // Verifica se o parêntese de abertura corresponde ao esperado
                if (lastOpened != expectedOpening) {
                    return false; // Retorna falso se não corresponder
                }
            }
        }

        // Retorna verdadeiro se todos os parênteses de abertura tiverem sido fechados
        return openBrackets.isEmpty();
    }
}
