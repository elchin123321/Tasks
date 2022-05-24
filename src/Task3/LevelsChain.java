package Task3;

import java.util.List;

public class LevelsChain implements AnswerHandler {
    private final Level currentLevel;
    private LevelsChain nextLevel;
    LevelsChain(Level level){
        currentLevel = level;
    }
    @Override
    public boolean answer(List<String> list) {
        if(!currentLevel.answer(list)) {
            return false;
        }
        else if(nextLevel!=null){
            nextLevel.answer(list);
            return true;
        }else {
            return false;
        }
    }

    public void setNextLevel(LevelsChain nextLevel) {
        this.nextLevel = nextLevel;
    }
}
