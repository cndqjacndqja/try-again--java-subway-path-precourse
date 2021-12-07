package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class SectionRepository {
	private static List<Section> sectionList = new ArrayList<>();

	static {
		sectionList.add(new Section(new Station("교대역"), new Station("강남역"), 2, 3));
		sectionList.add(new Section(new Station("강남역"), new Station("교대역"), 2, 3));
		sectionList.add(new Section(new Station("강남역"), new Station("역삼역"), 2, 3));
		sectionList.add(new Section(new Station("역삼역"), new Station("강남역"), 2, 3));
		sectionList.add(new Section(new Station("교대역"), new Station("남부터미널역"), 3, 2));
		sectionList.add(new Section(new Station("남부터미널역"), new Station("교대역"), 3, 2));
		sectionList.add(new Section(new Station("남부터미널역"), new Station("양재역"), 1, 1));
		sectionList.add(new Section(new Station("양재역"), new Station("남부터미널역"), 1, 1));
		sectionList.add(new Section(new Station("양재역"), new Station("매봉역"), 1, 1));
		sectionList.add(new Section(new Station("매봉역"), new Station("양재역"), 1, 1));
		sectionList.add(new Section(new Station("강남역"), new Station("양재역"), 2, 8));
		sectionList.add(new Section(new Station("양재역"), new Station("강남역"), 2, 8));
		sectionList.add(new Section(new Station("양재역"), new Station("양재시민의숲역"), 10, 3));
		sectionList.add(new Section(new Station("양재시민의숲역"), new Station("양재역"), 10, 3));
	}

	private static Section findSectionByPath(String startStationName, String endStationName) {
		return sectionList.stream()
			.filter(i -> i.findSectionByPath(startStationName, endStationName))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 경로 입니다."));
	}

	public static int findShortestPathListDistance(List<String> shortestRoutePath) {
		int distance = 0;
		for (int i = 0; i < shortestRoutePath.size() - 1; i++) {
			Section section = findSectionByPath(shortestRoutePath.get(i), shortestRoutePath.get(i+1));
			distance += section.getDistance();
		}
		return distance;
	}

	public static int findShortestPathListTime(List<String> shortestRoutePath) {
		int time = 0;
		for (int i = 0; i < shortestRoutePath.size() - 1; i++) {
			Section section = findSectionByPath(shortestRoutePath.get(i), shortestRoutePath.get(i+1));
			time += section.getTime();
		}
		return time;
	}
}
