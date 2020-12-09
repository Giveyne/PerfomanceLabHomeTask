package ru.pflb.homeTask1;

public class Multiplication {
    protected void getTable(){
        for(int i = 1; i <10; i++){
            for(int j = 1; j<10; j++){
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}
