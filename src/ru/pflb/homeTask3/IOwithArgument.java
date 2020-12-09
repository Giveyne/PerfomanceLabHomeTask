package ru.pflb.homeTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOwithArgument {

    public List<String> echoList(){
        List<String> list = new ArrayList<>();
        String string = "";
        System.out.print("Пользователь вводит: ");
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            if((string = in.nextLine()).isEmpty()){
                return list;
            }
            list.add(string);
        }
        return list;
    }
    public void printList(List<String> list) {
        System.out.print("Приложение выводит: ");
            list.stream().forEach(s -> System.out.println(s));

    }
}

