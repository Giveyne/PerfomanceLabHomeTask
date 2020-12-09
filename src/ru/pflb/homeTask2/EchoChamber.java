package ru.pflb.homeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EchoChamber {


    private List<String> echoList(){
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

    private void printList(List list){
        System.out.print("Приложение выводит: ");
        list.stream().forEach(s -> System.out.println(s));
    }


    public static void main(String[] args) {
       EchoChamber echoChamber = new EchoChamber();
       echoChamber.printList(echoChamber.echoList());
    }
}
