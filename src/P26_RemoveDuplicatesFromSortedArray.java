class P26_RemoveDuplicatesFromSortedArray {
    /**
     * Remove os elementos duplicados de um array ordenado in-place.
     *
     * @param sortedArray Array de inteiros ordenado.
     * @return Quantidade de elementos únicos restantes.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho do array 'sortedArray'. Percorremos o array apenas uma vez.
     * Espaço: O(1), pois a remoção é feita in-place, sem uso de estruturas auxiliares.
     */
    public int removeDuplicates(int [] sortedArray) {
        // Índice do último valor único encontrado
        int lastUniqueIndex = 0;

        // Percorre o array a partir do segundo elemento
        for (int currentIndex = 1; currentIndex < sortedArray.length; currentIndex++) {
            int currentValue = sortedArray[currentIndex];
            int lastUniqueValue = sortedArray[lastUniqueIndex];

            // Se o valor atual for diferente do último valor único, é um novo valor
            if (currentValue != lastUniqueValue) {
                lastUniqueIndex++; // Avança o índice do último valor único
                sortedArray[lastUniqueIndex] = currentValue; // Avança o índice do último valor único
            }
        }

        // Retorna o número de elementos únicos encontrados (o índice + 1)
        return lastUniqueIndex + 1;
    }
}
