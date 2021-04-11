package src;
import java.util.*;



public class AES {

    public static String plainTextO = "buy me some potato chips please";
    public static String key = "keys are boring1";
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Encrypt(plainTextO);
    }

    public static void Encrypt(String plainText){
        ptIntoBlocks(plainText);
        
        //keyExpansion(); //! To be implemented
    }

    public static byte[][] ptIntoBlocks(String plainText){
        byte [][] ptBlock = new byte [4][4];
        int index = 0;

        for(int row = 0; row < 4 ; row++){
            for (int col = 0; col < 4; col++){
                ptBlock[col][row] = (byte) plainText.charAt(index++);
            }
        }

        System.out.println(ptBlock[3][3]);
        return ptBlock;
    }

}