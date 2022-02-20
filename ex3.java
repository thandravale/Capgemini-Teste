
public class anagramas{
    static final int MAX = 256;

    static boolean comparaArrays(char arr1[], char arr2[]){
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    static Integer search(String padrao, String textoOriginal){
        int tamanhoPadrao = padrao.length();
        int tamanhoTexto = textoOriginal.length();
        int count = 0;
        char[] contadorPadrao = new char[MAX];
        char[] contadorGeral = new char[MAX];
        for (int i = 0; i < tamanhoPadrao; i++){
            (contadorPadrao[padrao.charAt(i)])++;
            (contadorGeral[textoOriginal.charAt(i)])++;
        }
        for (int i = tamanhoPadrao; i < tamanhoTexto; i++){
            if (comparaArrays(contadorPadrao, contadorGeral)){
                count ++;
            }
            (contadorGeral[textoOriginal.charAt(i)])++;
            contadorGeral[textoOriginal.charAt(i-tamanhoPadrao)]--;
        }
        if (comparaArrays(contadorPadrao, contadorGeral)){
            count ++;
        }
        return count;
    }

    public static void main(String args[]){
        int countResult = 0;
        String texto = "ifailuhkqq";
        String unico = caracteresUnicos(texto);
        for(int i =0; i < unico.length(); i++) {
            if(search(String.valueOf(unico.charAt(i)), texto) >= 2) {
                countResult ++;
            }
        }
        for(int i = 0; i<texto.length(); i++){
            for (int j = texto.length(); j > i+1; j--){
                if(search(texto.substring(i, j), texto) >= 2) {
                    countResult ++;
                }
            }
        }
        System.out.println(countResult-1);
    }

    private static String caracteresUnicos(String texto){
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            if(!resultado.contains(String.valueOf(texto.charAt(i)))) {
                resultado += String.valueOf(texto.charAt(i));
            }
        }
        return resultado;
    }
}
