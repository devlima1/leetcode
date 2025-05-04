import java.util.Arrays;

class P242_ValidAnagram {
    /**
     * Verifica se duas strings são anagramas, ou seja, se possuem os mesmos caracteres
     * com a mesma frequência, mas possivelmente em ordem diferente.
     *
     * @param firstWord Primeira string.
     * @param secondWord Segunda string.
     * @return  true se forem anagramas; false caso contrário.
     *
     * Complexidade do algoritmo:
     * Tempo: O(n log n), onde n é o tamanho das strings 'firstWord' e 'secondWord'. A ordenação das duas strings
     * (usando Arrays.sort) tem complexidade O(n log n).
     * Espaço: O(n), onde n é o tamanho das strings, pois estamos usando arrays auxiliares para armazenar os caracteres.
     */
    public boolean isAnagram(String firstWord, String secondWord) {
        // Converte as strings em arrays de caracteres
        char[] sChars = firstWord.toCharArray();
        char[] tChars = secondWord.toCharArray();

        // Ordena os arrays de caracteres
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compara os arrays ordenados para verificar se são iguais
        return Arrays.equals(sChars, tChars);
    }
}
