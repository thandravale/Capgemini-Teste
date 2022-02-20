import java.util.*;

public class Validador {
    
	public static void main(String[] args) {
        String [] simbolos = {"!","@","#","$","%","^","&","*","(",")","-","+"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        Integer tamanhoSenha = senha.length();
        // verifica o tamanho da senha, no caso de ser menor que 6 retorna a diferença.
        if(tamanhoSenha < 6) {
            System.out.println("faltam: " + (6 - tamanhoSenha));
        }
        // verifica a existencia de caracteres especiais
        if(senha.matches("^.*?((?i)\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|\\(|\\)|\\-|\\+).*$") == false) {
            System.out.println("a senha precisa conter pelo menos 1 caractere especial !@#$%^&*()-+");
        }
        // verifica a existencia de um Digito
        if(senha.matches("^.*?((?i)1|2|3|4|5|6|7|8|9|0).*$") == false) {
            System.out.println("a senha precisa conter pelo menos 1 Digito 123456789");
        }
        // verifica maiusculas
        if(senha.matches("(?=.*[A-Z]).*$") == false) {
            System.out.println("a senha precisa conter pelo menos 1 letra maiuscula");
        }
        // verifica minusculas
        if(senha.matches("(?=.*[a-z]).*$") == false) {
            System.out.println("a senha precisa conter pelo menos 1 letra minuscula");
        }
    }
}


// System.out.println(senha.matches("^.*?((?i)\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|\\(|\\)|\\-|\\+).*$"));
// "^.*?((?i)\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|\\(|\\)|\\-|\\+).*$"
// "\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|\\(|\\)|\\-|\\+"

// abcdefghijklmnopqrstuvw