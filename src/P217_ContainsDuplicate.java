import java.util.HashSet;

class P217_ContainsDuplicate {
    /**
     * Verifica se o vetor de inteiros contém elementos duplicados.
     * Utiliza um HashSet para rastrear os elementos já vistos.
     *
     * @param numbers Vetor de inteiros a ser verificado.
     * @return true se houver pelo menos um elemento duplicado; false caso contrário.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho do vetor 'numbers'. Cada número é verificado e adicionado ao HashSet no máximo uma vez.
     * Espaço: O(n), no pior caso, todos os elementos são únicos e armazenados no HashSet.
     */
    public boolean containsDuplicate(int[] numbers) {
        // Conjunto para armazenar os números já vistos
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // Itera sobre todos os números do vetor
        for (int number : numbers) {
            // Se o número já estiver no conjunto, então é duplicado
            if (uniqueNumbers.contains(number)) {
                return true;
            } // Caso contrário, adiciona o número ao conjunto
            uniqueNumbers.add(number);
        }

        // Se nenhum número duplicado foi encontrado, retorna false
        return false;
    }
}
