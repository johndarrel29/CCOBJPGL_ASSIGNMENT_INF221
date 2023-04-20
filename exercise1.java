public class exercise1 {

    // these are the assumption
    static boolean iwillNotCheat = true;
    static boolean IwillWin = true;

    public static void main(String[] args) throws Exception {
    
        //precondition
        assert iwillNotCheat == true : "dude why did you cheat, tsk tsk tsk";

        enterCompetition();

        //postcondition
        assert IwillWin == true : "better luck next time";


    }

    static void enterCompetition(){

        IwillWin = false;

    }
}
