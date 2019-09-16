public class Program {
    public Program(boolean go){
        while(go){
            menu();
            switch(Inputhandler.intChoice()){
                case 1:
                    Chat chat = new Chat();
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
                "1: Chat"+
                "9: Exit/Stop";
        return help;
    }
}
