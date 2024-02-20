package Leetcode;
import java.util.*;
public class newValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','.','9','5','.','.','.'}
                ,{'.','9','8','1','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};


        ArrayList<Character> rowlh = new ArrayList<>();
        ArrayList<Character> collh = new ArrayList<>();
        int indexI = 2;
        int startI = 0;
        int indexJ = 2;
        int startJ = 0;
        ArrayList<Character> p = new ArrayList<>();
        ArrayList<Character> valid = new ArrayList<>();


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(!rowlh.contains(board[i][j])) rowlh.add(board[i][j]);
                else if(board[i][j] !='.') System.out.println(false);
                if(!collh.contains(board[j][i])) collh.add(board[j][i]);
                else if(board[j][i] !='.') System.out.println(false);
            }
            collh.clear();
            rowlh.clear();

        }
    }
}
