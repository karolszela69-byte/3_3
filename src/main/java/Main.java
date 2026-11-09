public class Main {
    public static void main(String[] args) {
        int rozmiar = 10;
        int[][] tabliczka = new int[rozmiar][rozmiar];

        
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tabliczka[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Tabliczka mnożenia 10x10:");
        
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                
                System.out.printf("%4d", tabliczka[i][j]);
            }
            System.out.println(); 
        }
    }
}
            
        
                