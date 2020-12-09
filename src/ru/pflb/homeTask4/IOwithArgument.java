package ru.pflb.homeTask4;

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
        for (int i = 0; i<list.size(); i++)
            if(i%2 != 0){
                System.out.println(list.get(i));
            }
    }
}

