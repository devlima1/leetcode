class P27_RemoveElement {
    /**
     * Remove todas as ocorrências do valor especificado no array, preservando
     * a ordem dos elementos restantes. A modificação é feita diretamente no array.
     *
     * @param nums Array de inteiros a ser filtrado.
     * @param valueToRemove Valor que deve ser removido do array.
     * @return Novo comprimento do array após a remoção dos elementos.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho do array 'nums'. Cada elemento é visitado uma vez.
     * Espaço: O(1), já que a remoção é feita in-place, sem estruturas auxiliares.
     */
    public int removeElement(int[] nums, int valueToRemove) {
        // Índice para armazenar os valores válidos (não removidos)
        int validIndex = 0;

        // Percorre todos os elementos do array
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int currentValue = nums[currentIndex];

            // Se o valor atual não for o valor a ser removido
            if (currentValue != valueToRemove) {
                // Coloca o valor válido na posição do índice 'validIndex'
                nums[validIndex] = currentValue;
                validIndex++; // Avança o índice para o próximo valor válido
            }
        }

        // Retorna o novo comprimento do array com os elementos válidos
        return validIndex;
    }
}
