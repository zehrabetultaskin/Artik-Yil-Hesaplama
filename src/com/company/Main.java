package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    //Kullanıcı tarafından girilen yılın artık olup olmadığını bulan program
        Scanner input=new Scanner(System.in);
        int year;
        System.out.print("Yıl giriniz: ");
        year=input.nextInt();
        if(year%4==0){
            System.out.println(year+" bir artık yıldırıyor! ");
        }
        else{
            System.out.println(year+" bir artık yıldırıcı değil!");
        }

    }
}
