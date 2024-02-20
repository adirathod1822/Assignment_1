//package Leetcode;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class validSudoku {
//    public static void main(String[] args) {
//        ArrayList<Integer> l = new ArrayList<>();
//        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
//                        ,{'6','.','.','.','9','5','.','.','.'}
//                        ,{'.','9','8','1','.','.','.','6','.'}
//                        ,{'8','.','.','.','6','.','.','.','3'}
//                        ,{'4','.','.','8','.','3','.','.','1'}
//                        ,{'7','.','.','.','2','.','.','.','6'}
//                        ,{'.','6','.','.','.','.','2','8','.'}
//                        ,{'.','.','.','4','1','9','.','.','5'}
//                        ,{'.','.','.','.','8','.','.','7','9'}};
//        int indexI = 2;
//        int startI = 0;
//        int indexJ = 2;
//        int startJ = 0;
//        ArrayList<Character> p = new ArrayList<>();
//        ArrayList<Character> valid = new ArrayList<>();
//        int loop =0;
//        while (loop!=9) {
//            System.out.println(loop + " ");
//            for (int i = startI; i <= indexI; i++) {
//                for (int j = startJ; j <= indexJ; j++) {
//                    System.out.print("[" + i + "," + j + "]" + ":" + board[i][j] + "  ");
//                    if (!p.contains(board[i][j])) p.add(board[i][j]);
//                    else if (board[i][j] != '.') valid.add(board[i][j]);
//                }
//                System.out.println();
//            }
//            if(indexJ<8 && startJ<7){
//                indexJ += 3;
//                startJ += 3;
//            }
//            else{
//                indexJ = 2;
//                startJ = 0;
//                if(loop==2 || loop==5) {
//                    indexI +=3;
//                    startI +=3;
//                }
//            }
//
//            p.clear();
//            loop+=1;
//        }
//        System.out.println(indexJ);
//        System.out.println(startJ);
////        if(indexJ == )
//        System.out.println(valid);
//
//
//
//
//    }
////    public static void checkRowCol(char[][] board){
////        ArrayList<Character> rowlh = new ArrayList<>();
////        ArrayList<Character> collh = new ArrayList<>();
////        boolean valid = true;
////        for (int i = 0; i < board.length; i++) {
////            for (int j = 0; j < board.length; j++) {
////                if(!rowlh.contains(board[i][j])) rowlh.add(board[i][j]);
////                else if(board[i][j] !='.')rowvalid = false;
////                if(!collh.contains(board[j][i])) collh.add(board[j][i]);
////                else if(board[j][i] !='.')colvalid = false;
////            }
////            collh.clear();
////            rowlh.clear();
//////            System.out.println();
////        }
//
//        System.out.println("Column "+colvalid);
//        System.out.println("row "+rowvalid);
//    }
//    public static void twodArrayIndex( char[][] board){
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print("["+i+","+j+"]");
//            }
//            System.out.println();
//        }
//    }
//}
