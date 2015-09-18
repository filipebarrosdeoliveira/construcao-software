package br.ufg.inf.es.construcao.avaliacao2;

/**
 * Avaliação 2.
 * Aluno: Filipe Barros de Oliveira.
 * Construção de Software.
 */


public class avaliacao2 {

    /**
     * @param n um valor inteiro.
     * @return true se o valor fornecido for primo e false caso contrário.
     */

    public static boolean primo(int n) {

        int i = 2;

        if (n < 1) {
            throw new IllegalArgumentException("n");
        }

        if (n % i == 0) {
            return false;
        }


        while (i <= n) {
            i = i + 1;
        }

        return true;
    }
}



