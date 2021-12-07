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
}
