package subway;

import java.util.Scanner;

import jdk.jfr.internal.tool.Main;
import subway.controller.MainController;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        MainController mainController = new MainController();
        mainController.run(scanner);
    }
}
