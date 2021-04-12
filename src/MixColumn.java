package src;
import java.util.*;

public class MixColumn {

    byte[][] predeterminedTable = new byte[4][4];

    predeterminedTable = {{2,3,1,1}, {1,2,3,1}, {1,1,2,3}, {3,1,1,2}};

    public byte[][] muliplyMatrices(byte[][] matrix){
        byte[][] result = new byte[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int number = 0;
                for(int k = 0; k < 4; k++){
                    number += matrix[i][j] * predeterminedTable[j][i];
                }
                // result[i][j] = ;
            }
        }
    }

}