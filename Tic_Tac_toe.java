 import java.util.Scanner;
public class tic_tac_toe {
    public void Player1_Condition(char value1, char value2, char value3) {
        if (value1 == value2) {
            if (value1 == value3) {
                System.out.println("Player One Win the Match");

            }
        }
    }
    public void Player2_Condition(char value1, char value2, char value3) {
        if (value1 == value2) {
            if (value1 == value3) {
                System.out.println("Player Two Win the Match");
            }
        }
    }
    public static void main(String[] args) {
        // Input import class
        Scanner sc = new Scanner(System.in);
        //        player1
        char symbol1;
        char symbol2;
        char game_input_Player_1;
        char game_input_Player_2;
        char arr[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================player 1 please Choice the symbol only x or 0 ================================");
        do {
            symbol1 = sc.nextLine().charAt(0);
            if (symbol1 == '0' || symbol1 == 'x') {
                System.out.println("Player 1 value is " + symbol1);
                break;
            } else {
                System.out.println("please Enter the correct value");

            }
        } while (symbol1 != '0' || symbol1 != 'x');
        if (symbol1 == '0') {
            symbol2 = 'x';
            System.out.println("Player 2 value is " + symbol2);
        } else if (symbol1 == 'x') {
            symbol2 = '0';
            System.out.println("Player 2 value is " + symbol2);
        }
        tic_tac_toe tic = new tic_tac_toe();

        if (symbol1 == '0') {
            for (int k = 0; k < 4; k++) {
                game_input_Player_1 = sc.nextLine().charAt(0);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr[i][j] == game_input_Player_1) {
                            arr[i][j] = 0;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                tic.Player1_Condition(arr[0][0], arr[0][1], arr[0][2]);
                tic.Player1_Condition(arr[1][0], arr[1][1], arr[1][2]);
                tic.Player1_Condition(arr[2][0], arr[2][1], arr[2][2]);
                tic.Player1_Condition(arr[0][0], arr[1][0], arr[2][0]);
                tic.Player1_Condition(arr[0][1], arr[1][1], arr[2][1]);
                tic.Player1_Condition(arr[0][2], arr[1][2], arr[2][2]);
                tic.Player1_Condition(arr[0][0], arr[1][1], arr[2][2]);
                game_input_Player_2 = sc.nextLine().charAt(0);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr[i][j] == game_input_Player_2) {
                            arr[i][j] = 'x';

                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                tic.Player2_Condition(arr[0][0],arr[0][1],arr[0][2]);
                tic.Player2_Condition(arr[1][0],arr[1][1],arr[1][2]);
                tic.Player2_Condition(arr[2][0],arr[2][1],arr[2][2]);
                tic.Player2_Condition(arr[0][0],arr[1][0],arr[2][0]);
                tic.Player2_Condition(arr[0][1],arr[1][1],arr[2][1]);
                tic.Player2_Condition(arr[0][2],arr[1][2],arr[2][2]);
                tic.Player2_Condition(arr[0][0],arr[1][1],arr[2][2]);
            }
        }
        /////////////////////////////
        else if (symbol1 == 'x') {
            for (int k = 0; k < 4; k++) {
                game_input_Player_1 = sc.nextLine().charAt(0);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr[i][j] == game_input_Player_1) {
                            arr[i][j] = 0;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                tic.Player2_Condition(arr[0][0],arr[0][1],arr[0][2]);
                tic.Player2_Condition(arr[1][0],arr[1][1],arr[1][2]);
                tic.Player2_Condition(arr[2][0],arr[2][1],arr[2][2]);
                tic.Player2_Condition(arr[0][0],arr[1][0],arr[2][0]);
                tic.Player2_Condition(arr[0][1],arr[1][1],arr[2][1]);
                tic.Player2_Condition(arr[0][2],arr[1][2],arr[2][2]);
                tic.Player2_Condition(arr[0][0],arr[1][1],arr[2][2]);

                game_input_Player_2 = sc.nextLine().charAt(0);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr[i][j] == game_input_Player_2) {
                            arr[i][j] = 'x';
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                tic.Player1_Condition(arr[0][0], arr[0][1], arr[0][2]);
                tic.Player1_Condition(arr[1][0], arr[1][1], arr[1][2]);
                tic.Player1_Condition(arr[2][0], arr[2][1], arr[2][2]);
                tic.Player1_Condition(arr[0][0], arr[1][0], arr[2][0]);
                tic.Player1_Condition(arr[0][1], arr[1][1], arr[2][1]);
                tic.Player1_Condition(arr[0][2], arr[1][2], arr[2][2]);
                tic.Player1_Condition(arr[0][0], arr[1][1], arr[2][2]);
            }
        }
    }
}
