package aaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// NullPointerException, IndexOutOfBoundsException
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Введите температуру по Фаренгейту:");
        int TF = Integer.parseInt(input.readLine());
        //int TC = (TF - 32)* 5 / 9;
        //System.out.println("Температура в градусах Цельсия = " + TC);

        try {
            System.out.println("Температура в градусах Цельсия = " + tempC(TF));
        }
        catch (NothingThereException e){
            e.printStackTrace();
        }

    }
    public static int tempC(int n) throws NothingThereException { //генерує власний клас вийняток
        if(n == 0){
            throw new NothingThereException("0 is abandoned");
        }
        else
            return (n - 32)* 5 / 9;

    }
}