package subway.view;

import static subway.utils.Constant.*;

import java.util.List;

public class OutputView {
	public static void printMainScreen() {
		System.out.println("## 메인 화면");
		System.out.println("1. 경로 조회");
		System.out.println("Q. 종료");
		printEmptyLine();
	}

	public static void printShortestRouteScreen() {
		System.out.println("## 경로 기준");
		System.out.println("1. 최단 거리");
		System.out.println("2. 최소 시간");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}

	public static void printShortestRouteByDistanceResult(List<String> shortestRoutePathList, int totalDistance, int totalTime) {
		System.out.println("## 조회 결과");
		System.out.println(INFO_MESSAGE + "---");
		System.out.println(INFO_MESSAGE + "총 거리: " + totalDistance + "km");
		System.out.println(INFO_MESSAGE + "총 소요 시간: " + totalTime + "분");
		System.out.println(INFO_MESSAGE + "---");
		for (String shortestRoutePath: shortestRoutePathList) {
			System.out.println(INFO_MESSAGE + shortestRoutePath);
		}
		printEmptyLine();
	}

	private static void printEmptyLine() {
		System.out.println();
	}
}
