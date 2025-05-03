class P125_ValidPalindrome {
    /**
     * Verifica se uma string é um palíndromo, ignorando caracteres não alfanuméricos e diferenças de maiúsculas/minúsculas.
     *
     * @param text String a ser verificada.
     * @return  true se a string for um palíndromo válido; false caso contrário.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho da string 'text'. Cada caractere é visitado no máximo uma vez.
     * Espaço: O(1), pois a verificação é feita usando apenas ponteiros, sem estruturas auxiliares.
     */
    public boolean isPalindrome(String text) {
        // Ponteiros para as extremidades da string
        int leftPointer = 0;
        int rightPointer = text.length() - 1;

        // Enquanto o ponteiro da esquerda for menor que o da direita
        while(leftPointer < rightPointer) {
            char currentValueLeftPointer = text.charAt(leftPointer);
            char currentValueRightPointer = text.charAt(rightPointer);

            // Ignora caracteres não alfanuméricos à esquerda
            if (!Character.isLetterOrDigit(currentValueLeftPointer)) {
                leftPointer++; // Avança o ponteiro da esquerda
                continue;
            }

            // Ignora caracteres não alfanuméricos à direita
            if (!Character.isLetterOrDigit(currentValueRightPointer)) {
                rightPointer--; // Avança o ponteiro da esquerda
                continue;
            }

            // Compara os caracteres, ignorando diferenças de maiúsculas e minúsculas
            if (Character.toLowerCase(currentValueLeftPointer) != Character.toLowerCase(currentValueRightPointer)) {
                return false; // Retorna falso se os caracteres não coincidirem
            }

            // Avança ambos os ponteiros
            leftPointer++;
            rightPointer--;
        }

        // Se os ponteiros se cruzaram sem encontrar diferenças, é um palíndromo
        return true;
    }
}
