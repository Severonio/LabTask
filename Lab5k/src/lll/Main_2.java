package lll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[2];
        System.out.println("S: ");
        array[0] = "hello";
        try{
            for (int i = 0; i < array.length; i++) {
                while(!array[i].equals("end")) {
                    array[i] = reader.readLine();
                }
            }
        }
        catch (NullPointerException e){
            System.err.println(e+" here");
        }


        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        Arrays.sort(array);

    }

}

