package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdLevel extends Level{
    ThirdLevel(){
        questions = new ArrayList<>();
        questions.add("Вы прошли мимо. Пройдя не много вы наткулись на стаю волков. Вы не смогли отбиться и они вас сьели.");
        questions.add("Вы Купили топор. Пройдя не много вы наткулись на стаю волков. Вы отбились от волков и вышли из леса.");
        questions.add("Вы Купили пику. Пройдя не много вы наткулись на стаю волков. Вы отбились от волков и вышли из леса.");

    }

    @Override
    public boolean answer(List<String> answers) {

        switch (answers.get(answers.size() - 1)) {
            case "Пройти мимо" -> System.out.println(questions.get(0));
            case "Топор" -> System.out.println(questions.get(1));
            case "Пика" -> System.out.println(questions.get(2));
        }


        return false;
    }
}
