package com.tjetc.demo.homework02;

import java.util.Scanner;

public class Testdemo1 {
    public void showEat(Person person){
        person.eat();
    }

    public static void main(String[] args) {
//        Chinese chinese = new Chinese("张三","男",20);
//        English english = new English("史蒂文","男",22);
//        chinese.eat();
//        english.eat();
        Scanner scanner = new Scanner(System.in);
        String cName = scanner.nextLine();
        String cSex = scanner.nextLine();
        Integer cAge = Integer.valueOf(scanner.nextLine());
        String eName = scanner.nextLine();
        String eSex = scanner.nextLine();
        Integer eAge = Integer.valueOf(scanner.nextLine());
        Chinese chinese = new Chinese(cName,cSex,cAge);
        English english = new English(eName,eSex,eAge);
        Testdemo1 testdemo1 = new Testdemo1();
        testdemo1.showEat(chinese);
        testdemo1.showEat(english);
        if(chinese instanceof Chinese){
            Chinese chinese1 = (Chinese)chinese;
            chinese1.shadowBoxing();
        }
        if(english instanceof English){
            English english1 = (English)english;
            english1.horseRiding();
        }
    }
}
