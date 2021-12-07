package subway.domain;

public class Section {
	private Station startStation;
	private Station endStation;
	private int distance;
	private int time;

	public Section(Station startStation, Station endStation, int distance, int time) {
		this.startStation = startStation;
		this.endStation = endStation;
		this.distance = distance;
		this.time = time;
	}

	public boolean findSectionByPath(String startStation, String endStation) {
		return this.startStation.getName().equals(startStation) && this.endStation.getName().equals(endStation);
	}

	public int getDistance() {
		return distance;
	}

	public int getTime() {
		return time;
	}
}
