public class ProgramMenu{
    public ProgramMenu(boolean go){
        while(go){
            menu();
            switch(Inputhandler.intChoice()){
                case 1:
                    ChatProgram chatProgram = new ChatProgram(go);
                    break;
                case 9:
                    go = false;
                    System.out.println("Shutting down...");
                    break;
            }
        }

    }
    public String menu(){
        String help =
                "1: Chat Program" +
                "9: Exit/Stop";
        return help;
    }
}
