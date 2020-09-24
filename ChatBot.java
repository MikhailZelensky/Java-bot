import java.util.Scanner;

public class ChatBot {
    public static void getMessage(String help) {
        System.out.println("чем я могу помочь?");
        Scanner b = new Scanner(System.in);
        Boolean nonExit = true;
        while (nonExit){
            switch (b.next()) {
                case "help":
                    System.out.println(help);
                    break;
                case "stop":
                    nonExit = false;
                    break;
                case "играть":
                    System.out.println("пока не могу");
                default:
                    System.out.println("Я не умею это делать");
            }
        }
    }
}
