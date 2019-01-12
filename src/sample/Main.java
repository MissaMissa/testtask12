package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static int n;
        public static void main(String[] args) {
            System.out.println("Hello, this is test task №2");
            System.out.println("The Factorial");
            for (int i = 0; i < 15; i++) {
                usl();
                fact(n);
                rep();
            }
        }
        private static void usl() {
            System.out.println("Pleas input 'n' - number, we find n! (From 1 till 17)");
            Scanner scanner = new Scanner(System.in);
            try {
                n = Integer.parseInt(scanner.nextLine());
                if ((n >= 1) && (n <= 16)) {
                    System.out.println("Calculating...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. U need type number from 1 till 16\n");
                System.out.println("last result was:");
            }
        }
        private static void fact(int n) {
            int result =1;
            for (int i = n; i >1 ; i--) {
                result *=i;
            }
            System.out.println("n! = "+ result);
            System.out.println();
        }
        private static void rep() {
            Scanner tryAgain = new Scanner(System.in);
            System.out.println("If You want to repeat - type y \nIf not you can type any symbol");
            if ((tryAgain.next().equals("y"))) {
            } else {
                System.out.println("Thx for using this app. Good Luck. Bye!");
                System.exit(0); }
        }
    }
