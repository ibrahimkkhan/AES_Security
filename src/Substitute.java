package src;
import java.util.*;

public class Substitute {

    // byte[] predeterminedTable = new byte[128];
    ArrayList<Integer> predeterminedTable = new ArrayList<Integer>();

    /* This operation is based on randomess */
    public void populateTable(){ //populate predetermined table()
        
        for(int i = 0; i < 128; i++){
            predeterminedTable.add(i);
            // Random rand = new Random(); //instance of random class
            // int upperbound = 256; //generate random values from 0-255 (0x00 - 0xFF)
            // int int_random = rand.nextInt(upperbound); 
            // // String hex = Integer.toHexString(int_random);
            // //System.out.println("int_random is" + int_random);
            // predeterminedTable[i] = (byte) int_random;
            // System.out.println(predeterminedTable[i]);
            
            // // for(int j = 0; j < 16; j++){
                



            // //     //System.out.println(predeterminedTable[i][j]);
            // // }
        }
        Collections.shuffle(predeterminedTable);
        // for(Integer i: predeterminedTable){
        //     System.out.println("i is " + i);
        // }
    }

    public byte[][] substituteBytes(byte[][] table){ //populate predetermined table()
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int element = table[i][j];
                int substitute = predeterminedTable.get(element);
                byte b_substitute = (byte) substitute;
                table[i][j] = b_substitute;
            }
        }

        return table;
    }
}