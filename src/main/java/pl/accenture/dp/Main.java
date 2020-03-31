package pl.accenture.dp;

import pl.accenture.dp.domain.MyInterfaceForFirstTask;
import pl.accenture.dp.domain.MyInterfaceForSecondTask;
import pl.accenture.dp.domain.MyInterfaceForThirdTask;

public class Main{
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
    }

    private static void zadanie3() {
        //done 3 - anonimowa
        MyInterfaceForThirdTask anonimowa3 = new MyInterfaceForThirdTask() {
            @Override
            public String go(String name) {
                return "To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 3 "+name;
            }

        };

        //done 3 - lambda
        MyInterfaceForThirdTask lambda3 = name -> {
            return "To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 3 "+name;
        };
    }

    private static void zadanie2() {
        //done 2 - anonimowa
        MyInterfaceForSecondTask anonimowa2 = new MyInterfaceForSecondTask() {
            @Override
            public String go() {
                return "To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 2";
            }
        };

        //done 2 - lambda
        MyInterfaceForSecondTask lambda2 = () -> "To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 2";
    }

    static void zadanie1(){

        //done 1 - anonimowa
        MyInterfaceForFirstTask anonimowa1 = new MyInterfaceForFirstTask() {
            @Override
            public void go() {
                System.out.println("To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 1");
            }
        };

        //done 1 - lambda
        MyInterfaceForFirstTask lambda1 = () -> System.out.println("To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 1");

    }
}
