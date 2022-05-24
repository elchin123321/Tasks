package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondLevel extends Level{
    SecondLevel(){
        questions = new ArrayList<>();
        questions.add("Вы пошли налево. Пройдя 200 метро вы наткулись на стаю волков, которые вас сьели.");
        questions.add("Вы пошли направа и спустя некоторое время наткнулись на торговца. Вы можете пройти мимо или купить у него один из следующих предметов:");
        levelAnswers = new ArrayList<>();
        levelAnswers.add("Пройти мимо");
        levelAnswers.add("Топор");
        levelAnswers.add("Пика");
    }

    @Override
    public boolean answer(List<String> answers) {
        if(answers.get(answers.size()-1).equals("Пойти налево")){
            System.out.println(questions.get(0));
            return false;
        }
        System.out.println(questions.get(1));
        for(int i = 1; i<=levelAnswers.size();i++){
            System.out.println(i + ". " + levelAnswers.get(i-1));
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер ответа: ");
        int num;
        while (true){
            try {
                num = in.nextInt();
                if(num>0 && num<=levelAnswers.size()){
                    break;
                }else {
                    System.out.println("Вы ввели неверный номер ответа! \nВведите номер ответа:");
                }
            }catch (Exception ex){
                System.out.println("Не верный символ \nВведите номер ответа:");
            }
        }
        answers.add(levelAnswers.get(num-1));
        return true;
    }
}
