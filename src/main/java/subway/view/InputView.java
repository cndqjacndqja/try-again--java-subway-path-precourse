package subway.view;

import java.util.Scanner;

public class InputView {
	public static String inputMainFunctionCommand(Scanner scanner) {
		System.out.println("## 원하는 기능을 선택하세요.");
		String inputCommand = scanner.nextLine();
		printEmptyLine();
		return inputCommand;
	}

	private static void printEmptyLine() {
		System.out.println();
	}
}
