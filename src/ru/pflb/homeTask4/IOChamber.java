package ru.pflb.homeTask4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOChamber {

    public static void main(String[] args) throws IOException{
        IOnotArgument iOnotArgument = new IOnotArgument();
        IOwithArgument ioUtil = new IOwithArgument();

        if(args.length == 0){
            System.out.print("Запуск без аргумента: \n");
            ioUtil.printList(ioUtil.echoList());
        }
        else {
            System.out.print("Запуск с аргументом: \n");
            File file = new File(args[0]);
            try {
                iOnotArgument.notArgument(file);
            }
            catch (FileNotFoundException e){
                System.out.println("Файл не расспознан введите ваши сообщения: \n");
                ioUtil.printList(ioUtil.echoList());
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
