package day12_if_statements;

import java.util.Scanner;

public class HomeWork2ChooseLanguage {
//    create a class ChooseLanguage
//
//ask the user to enter a number based on the language they wanted to use.
//        1 - English
//	2 - Spanish
//	3 - Turkish
//	4 - Russian
//	5 - French
//
//    based on the number they picked print a message:
//
//            1 : "hello, thank for your call"
//            2 : "hola, gracias para llamar"
//            3 : "merhaba, aradiginiz icin tesekkurler"
//            4 : "privet, spasibo za vash zvonok"
//            5 : "Merci ,pour votre appel"
//    any other number: "We will use English by default"
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number based on the language they wanted to use: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian" +
            "\n\t5 - French");
    int num = input.nextInt();
    if(num == 1){
        System.out.println("hello, thank for your call");
    }else if(num == 2){
        System.out.println("hola, gracias para llamar");
    }else if(num == 3){
        System.out.println("merhaba, aradiginiz icin tesekkurler");
    }else if(num == 4){
        System.out.println("privet, spasibo za vash zvonok");
    }else if(num == 5){
        System.out.println("Merci ,pour votre appel");
    }else{
        System.out.println("We will use English by default");
    }
}
}
//  Saim's code
//    Scanner input = new Scanner(System.in);
//        System.out.println("Please choose a language: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
//                int option = input.nextInt();
//                String message;
//
//                if(option == 1){
//                message = "hello, thank for your call";
//                } else if (option == 2){
//                message = "hola, gracias para llamar";
//                } else if (option == 3){
//                message = "merhaba, aradiginiz icin tesekkurler";
//                } else if (option == 4){
//                message = "privet, spasibo za vash zvonok";
//                } else if(option == 5){
//                message = "Merci ,pour votre appel";
//                } else {
//                message = "We will use English by default";
//                }
//
//                System.out.println(message);
