package subway.domain.function;

import static subway.view.InputView.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import subway.domain.SectionRepository;
import subway.service.ShortestRouteDistance;

public enum ShortestRoute {
	FIND_SHORTEST_DISTANCE("1") {
		@Override
		void function(Scanner scanner) {
			String startStation = inputStartStation(scanner);
			String endStation = inputEndStation(scanner);
			List<String> shortestRoutePath = ShortestRouteDistance.findShortestRoutePath(startStation, endStation);
			int totalDistance = SectionRepository.findShortestPathListDistance(shortestRoutePath);
			int totalTime = SectionRepository.findShortestPathListTime(shortestRoutePath);
		}
	},
	FIND_SHORTEST_TIME("2") {
		@Override
		void function(Scanner scanner) {

		}
	},
	BACK("B") {
		@Override
		void function(Scanner scanner) {

		}
	};

	private String command;

	abstract void function(Scanner scanner);

	ShortestRoute(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

	public static ShortestRoute findRoute(String command) {
		return Arrays.stream(values())
			.filter(i -> i.getCommand().equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("올바르지 않은 명령어 입니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}
}
