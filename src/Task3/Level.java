package Task3;

import java.util.List;

public abstract class Level implements AnswerHandler {
    protected List<String> questions;
    protected  List<String> levelAnswers;


    @Override
    public abstract boolean answer(List<String> answers);
}
