public class ChatProgram{
    public ChatProgram(boolean go){
        while(go){
            menu();
            switch(Inputhandler.intChoice()){
                case 1:
                    Login login = new Login(go);
                    break;
                case 9:
                    go = false;
                    System.out.println("Going back...");
                    break;
            }
        }

    }
    public String menu(){
        String menu =
                "1: Login\n"+
                "9: Exit/Stop\n";
        return menu;
    }
}
