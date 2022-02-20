public class Estrelas {
    
	public static void main(String[] args) {
        int i,j, coluna = 6;
		for (i = 0; i < coluna; i++) {
            for (j = 1*(coluna-i); j >= 0; j--){
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}