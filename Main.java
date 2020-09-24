package com.company;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String help = "Я бот, буду уметь выдавать английское слово,\nполучать перевод" +
                "и получать корректность перевода,\nно сейчас я выводить информацию о себе." +
                "\nЧтобы начать, введите \"start\"" +
                "\nЧтобы завершить, введите \"stop\"";
        System.out.println("Привет!");
        System.out.println(help);
//        ChatBot x = new ChatBot;
        while (true) {
            Scanner a = new Scanner(System.in);
            String message = a.next();
            if (a.next().equals("start")){

//                getMessage(message);
            }
            else
                System.out.println("Чтобы начать, введите \"start\"");


        }
    }
}
