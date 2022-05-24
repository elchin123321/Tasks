package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstLevel extends Level{
    FirstLevel(){
        questions = new ArrayList<>();
        questions.add("Вы оказались на пепепутье, на камне надпись 'Налево пойдешь смерть найдешь, направо пойдешь силу найдешь'");
        levelAnswers = new ArrayList<>(
                Arrays.asList("Пойти налево", "Пойти на право"));

    }

    @Override
    public boolean answer(List<String> answers) {
        System.out.println(questions.get(0));
        for(int i = 1; i<=levelAnswers.size();i++){
            System.out.println(i + ". " + levelAnswers.get(i-1));
        }
        Scanner in = new Scanner(System.in);

        int num;
        while (true){
            try {
                System.out.println("Введите номер ответа: ");
                num = in.nextInt();
                if(num>0 && num<=levelAnswers.size()){
                    break;
                }else {
                    System.out.println("Вы ввели неверный номер ответа!");
                }
            }catch (Exception ex){
                System.out.println("Не верный символ!");
                in.next();
            }
        }
        answers.add(levelAnswers.get(num-1));
        return true;
    }
}
