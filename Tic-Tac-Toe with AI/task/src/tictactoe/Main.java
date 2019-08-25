package tictactoe;


public class Main {
    public static void main(String[] args) {

        int ROWS = 3;
        int COLS = 3;
        char[][] arrayResults = new char [ROWS][COLS];


        arrayResults[0][0] = 'O';

        arrayResults[0][1] = 'O';

        arrayResults[0][2] = 'O';

        arrayResults[1][0] = 'O';

        arrayResults[1][1] = 'O';

        arrayResults[1][2] = 'O';

        arrayResults[2][0] = 'O';

        arrayResults[2][1] = 'O';

        arrayResults[2][2] = 'O';

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arrayResults[i][j] +" ");
            }
            System.out.println("");
        }

    }
}
