class P704_BinarySearch {
    /**
     * Realiza uma busca binária em um array ordenado de inteiros.
     *
     * @param nums   Array ordenado de inteiros.
     * @param target Valor a ser encontrado.
     * @return       Índice do elemento caso encontrado; -1 caso contrário.
     *
     * Complexidade do algoritmo:
     * Tempo: O(log n), onde n é o tamanho do array 'nums'. A cada iteração, o espaço de busca é reduzido pela metade.
     * Espaço: O(1), já que a busca é feita in-place, utilizando apenas variáveis para os ponteiros.
     */
    public int search(int [] nums, int target) {
        // Inicializa os ponteiros para o início e fim do array
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        // Enquanto ainda houver elementos no intervalo de busca
        while (leftPointer <= rightPointer) {
            // Calcula o índice do meio evitando overflow
            int middleIndex = leftPointer + (rightPointer - leftPointer) / 2;
            int middleValue = nums[middleIndex];

            // Verifica se o valor do meio é o alvo
            if (middleValue == target) {
                return middleIndex;
            }

            // Se o valor do meio for maior que o alvo, descarta a metade direita
            if (middleValue > target) {
                rightPointer = middleIndex - 1;
            } else {
                // Caso contrário, descarta a metade esquerda
                leftPointer = middleIndex + 1;
            }
        }

        // Elemento não encontrado
        return -1;
    }
}
