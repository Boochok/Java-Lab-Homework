package com.epam.pair.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.factorial(6));
    }

    public String factorial(int n){
        String result = "factorial calculated unsuccessefully.";
        int facOutResult=1;

        System.out.println("Input factorial degree.");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            n=Integer.parseInt(bufferedReader.readLine());

            if (n<=0){
                System.out.println("You need to input number > 0");
            }
            else {
                int[] facOut = new int[n];
                for (int i = 0; i < n; i++) {
                    facOut[i]=i+1;
                }
                for (int i = 0; i < n; i++) {
                    facOutResult = facOutResult * facOut[i];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "factorial calculated successefully = " + facOutResult;
    }

    public int multiplication(){
        int firstMultiPlie = 0 ;
        int secondMultiPlie = 0 ;
        int multiplierResult = 0;


        System.out.println("Inpu first multiplicating number.");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            firstMultiPlie = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Input second multiplicating number.");
            secondMultiPlie = Integer.parseInt(bufferedReader.readLine());
            multiplierResult = firstMultiPlie*secondMultiPlie;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multiplierResult;
    }

    public int division(){
        int deviden = 0;
        int devider = 1;
        int divisionResult =0;

        System.out.println("input deviden number:");


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            deviden=Integer.parseInt(bufferedReader.readLine());
            System.out.println("Input devider:");
            devider=Integer.parseInt(bufferedReader.readLine());
            divisionResult=deviden/devider;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return divisionResult;
    }
}
