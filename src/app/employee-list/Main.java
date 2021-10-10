package com.company;

import java.lang.reflect.Array;
import  java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Soal No 1 \n2. Soal No 2 \nPilih : ");
        int pilih = input.nextInt();
        if(pilih == 1){
            soalNo1();
        }else{
            soalNo2();
        }
        soalNo1();

    }

    public static void soalNo1(){
        Scanner input = new Scanner(System.in);
        int toNumber =0;
        int number = 0;
        List<Integer> fnumber = new ArrayList();
        try{
            int lagi;
            do{
                System.out.println();
               System.out.print("input number : ");
               number = input.nextInt();
               fnumber.add(number);
               System.out.print("input again ? \n1.No, \n2. Yes \n choose: ");
               lagi = input.nextInt();

           }while(lagi != 1);
            System.out.print("to number :");
            toNumber = input.nextInt();
            System.out.print("hasil : "+ processInput(fnumber, toNumber));

        }catch (ArrayIndexOutOfBoundsException e){
        }catch (InputMismatchException er){
            System.out.print("Pilihan tidak ada");
        }

    }

    public static int processInput(List<Integer> list, int toNumber){
        int hasil= 0;
        for(int num : list) {
            hasil += num;
        }
        return hasil;
    }

    public static void soalNo2(){
        List<String> vowelChar = new ArrayList<>();
        List<String> consChar = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kalimat : ");
        String kata = input.nextLine();
        for(int i=0;i<kata.length();i++){
            char ch = kata.charAt(i);
            if(ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o'){
                String k = String.valueOf(ch);
                vowelChar.add(k);
            }
            else{
                String k = String.valueOf(ch);
                consChar.add(k);
            }
        }
        System.out.print("Vowel     : ");
        Collections.sort(vowelChar);
        for(String h : vowelChar){
            System.out.print(" "+ h);
        }

        System.out.println();
        Collections.sort(consChar);
        System.out.print("Consonant : ");
        for(String m : consChar){
            System.out.print(" "+ m);
        }
    }
}
