package subway.utils;

import static subway.utils.Constant.*;

import subway.domain.StationRepository;

public class Validate {
	public static void validateStartStationAndEndStation(String startStationName, String endStationName) {
		validateIsExistStation(startStationName);
		validateIsExistStation(endStationName);
		validateIsEqualsStartStationNameAndEndStationName(startStationName, endStationName);
	}

	private static void validateIsEqualsStartStationNameAndEndStationName(String startStationName, String endStationName) {
		if (startStationName.equals(endStationName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE + "출발역과 도착역이 동일합니다.");
		}
	}

	private static void validateIsExistStation(String stationName) {
		if (!StationRepository.isExist(stationName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE + "존재하지 않는 역입니다.");
		}
	}
}
