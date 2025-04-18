import java.util.HashMap;

class P1_TwoSum {
    /**
     * Encontra os dois números no array que somam ao 'target' e retorna seus índices.
     *
     * @param nums   Array de inteiros (pode conter negativos ou duplicatas).
     * @param target Valor alvo da soma.
     * @return       Array com os dois índices dos números que somam ao target.
     * @throws IllegalArgumentException Se nenhum par for encontrado.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n), onde n é o tamanho do array 'nums'. Passamos por cada elemento apenas uma vez.
     * Espaço: O(n), para armazenar os elementos no HashMap.
     */
    public int[] twoSum(int[] nums, int target) {
        // HashMap para armazenar os números já vistos e seus respectivos índices
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();

        // Percorre cada número do array
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int currentNumber = nums[currentIndex];
            // Calcula o complemento que, somado ao número atual, atinge o target
            int complement = target - currentNumber;

            // Verifica se o complemento já foi visto antes no array
            if (seenNumbers.containsKey(complement)) {
                // Se sim, retorna os índices do complemento e do número atual
                int complementIndex = seenNumbers.get(complement);
                return new int[]{complementIndex, currentIndex};
            }

            // Se não, armazena o número atual e seu índice no HashMap
            seenNumbers.put(currentNumber, currentIndex);
        }

        // Lança exceção se nenhum par que some ao target for encontrado
        throw new IllegalArgumentException("No solution found");
    }
}
