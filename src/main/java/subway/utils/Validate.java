package subway.utils;

import static subway.utils.Constant.*;

public class Validate {
	public static void validateIsEqualsStartNameAndEndName(String startStationName, String endStationName) {
		if (startStationName.equals(endStationName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE + "출발역과 도착역이 동일합니다.");
		}
	}
}
