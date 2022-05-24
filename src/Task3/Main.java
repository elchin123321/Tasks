package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        LevelsChain firstLevel = new LevelsChain(new FirstLevel());
        LevelsChain secondLevel = new LevelsChain(new SecondLevel());
        LevelsChain thirdLevel = new LevelsChain(new ThirdLevel());
        firstLevel.setNextLevel(secondLevel);
        secondLevel.setNextLevel(thirdLevel);

        while (true){
            if(firstLevel.answer(answers)){
                break;
            }
        }
    }
}
