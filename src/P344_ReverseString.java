class P344_ReverseString {
    /**
     * Inverte os caracteres de um array de caracteres in-place.
     *
     * @param text Array de caracteres a ser invertido.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho do array 'text'. Cada caractere é trocado no máximo uma vez.
     * Espaço: O(1), já que a inversão é feita in-place, sem uso de memória extra além das variáveis temporárias.
     */
    public void reverseString(char[] text) {
        // Ponteiros inicial e final
        int leftPointer = 0;
        int rightPointer = text.length - 1;

        // Continua enquanto os ponteiros não se encontrarem
        while(leftPointer < rightPointer) {
            // Armazena os caracteres das extremidades
            char currentValueLeftPointer = text[leftPointer];
            char currentValueRightPointer = text[rightPointer];

            // Realiza a troca dos caracteres
            char swapTemp = currentValueLeftPointer;
            text[leftPointer] = currentValueRightPointer;
            text[rightPointer] = swapTemp;

            // Move os ponteiros para o centro
            leftPointer++;
            rightPointer--;
        }
    }
}
