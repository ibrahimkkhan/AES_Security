package src;
import java.util.*;

import src.Substitute;



public class AES {

    public static String plainTextO = "buy me some potato chips please";
    public static String key = "keys are boring1";
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Encrypt(plainTextO);
        
    }

    public static void Encrypt(String plainText){
        Substitute s = new Substitute();
        byte [][] ptMatrix = new byte [4][4];
        byte [][] keyMatrix = new byte [4][4];
        byte [][] addRoundMatrix = new byte [4][4];
        byte [][] substituteMatrix = new byte [4][4];
        
        ptMatrix = divideIntoBlocks(plainText);
        keyMatrix = divideIntoBlocks(key);
        //keyExpansion(); //! To be implemented
        addRoundMatrix = addRoundKey(ptMatrix, keyMatrix);
        
        s.populateTable();
        s.substitute_bytes(addRoundMatrix);
    }

    public static byte[][] divideIntoBlocks(String text){
        byte [][] matrix = new byte [4][4];
        int index = 0;

        for(int row = 0; row < 4 ; row++){
            for (int col = 0; col < 4; col++){
                matrix[col][row] = (byte) text.charAt(index++);
            }
        }

        System.out.println(matrix[0][0]);
        return matrix;
    }

    public static byte[][] addRoundKey(byte[][] ptMatrix,  byte[][] keyMatrix){
        byte [][] round_matrix = new byte [4][4];

        for(int row = 0; row < 4 ; row++){
            for (int col = 0; col < 4; col++){
                byte pt_temp = ptMatrix[col][row];
                byte key_temp = keyMatrix[col][row];
                byte b = (byte) ((pt_temp ^ key_temp) & 0x000000ff);
                round_matrix[col][row] = b;
            }
        }

        System.out.println(round_matrix[0][0]);
        return round_matrix;
    }

}