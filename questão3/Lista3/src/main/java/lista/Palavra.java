package lista;

public class Palavra {

    private String palavra;
    private boolean ePalindromo;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.ePalindromo = ePalindromo(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public boolean ePalindromo() {
        return ePalindromo;
    }

    private boolean ePalindromo(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
