import java.util.HashMap;
import java.util.Map;

class P169_MajorityElement {
    /**
     * Encontra o elemento majoritário em um array, ou seja, o elemento que aparece mais
     * da metade das vezes no array.
     *
     * @param nums Array de inteiros.
     * @return O elemento majoritário.
     *
     * Complexidade do algoritmo:
     *  Tempo: O(n), onde n é o tamanho do array 'nums'. O array é percorrido uma vez para contar os elementos
     *  e outra vez (no pior caso) para encontrar o elemento com a maior contagem.
     *  Espaço: O(n), para armazenar as contagens dos elementos no HashMap.
     */
    public int majorityElement(int[] nums) {
        // Mapa para armazenar as contagens de cada número
        Map<Integer, Integer> numberCounts = new HashMap<>();

        // Percorre o array e atualiza a contagem de cada número no mapa
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int currentValue = nums[currentIndex];

            // Atualiza a contagem do número no mapa
            if (numberCounts.containsKey(currentValue)) {
                numberCounts.put(currentValue, numberCounts.get(currentValue) + 1);
            }else {
                numberCounts.put(currentValue, 1); // Adiciona o número com contagem inicial de 1
            }
        }

        int max_count = -1;
        int ans = -1;

        // Percorre o mapa para encontrar o número com a maior contagem
        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() > max_count) {
                max_count = entry.getValue(); // Atualiza a maior contagem
                ans = entry.getKey(); // Atualiza o número correspondente à maior contagem
            }
        }

        return ans; // Retorna o número majoritário
    }
}
