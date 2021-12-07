package subway.view;

import java.util.Scanner;

public class InputView {
	public static String inputMainFunctionCommand(Scanner scanner) {
		System.out.println("## 원하는 기능을 선택하세요.");
		String inputCommand = scanner.nextLine();
		printEmptyLine();
		return inputCommand;
	}

	public static String inputLookUpRouteType(Scanner scanner) {
		System.out.println("## 원하는 기능을 선택하세요.");
		String lookupRouteType = scanner.nextLine();
		printEmptyLine();
		return lookupRouteType;
	}

	private static void printEmptyLine() {
		System.out.println();
	}
}
