public class bubble {
    import java.util.Scanner;


    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;
        char[][] board = new char[rows][cols];

        initializeBoard(board);

        printBoard(board);

        while (!isGameOver(board)) {
           
            
            printBoard(board);
        }

        System.out.println("¡Juego terminado!");
    }

   
    private static void initializeBoard(char[][] board) {
        
    }

    private static void printBoard(char[][] board) {
        
    }

    private static boolean isGameOver(char[][] board) {
       
        return false;
    }

    
    private static void handleInput(char[][] board) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la columna para disparar la burbuja: ");
        int column = scanner.nextInt();

       
    }

    
    private static void updateBoard(char[][] board, int column) {
       
    }
}

