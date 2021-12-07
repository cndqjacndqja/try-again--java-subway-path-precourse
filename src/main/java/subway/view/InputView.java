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

	public static String inputStartStation(Scanner scanner) {
		System.out.println("## 출발역을 입력하세요.");
		String startStation = scanner.nextLine();
		printEmptyLine();
		return startStation;
	}
	public static String inputEndStation(Scanner scanner) {
		System.out.println("## 도착역을 입력하세요.");
		String endStation = scanner.nextLine();
		printEmptyLine();
		return endStation;
	}

	private static void printEmptyLine() {
		System.out.println();
	}
}
