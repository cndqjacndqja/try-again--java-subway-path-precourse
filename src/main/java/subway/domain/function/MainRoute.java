package subway.domain.function;

import java.util.Arrays;
import java.util.Scanner;

public enum MainRoute {
	LOOK_UP_ROUTE("1"){
		@Override
		void function(Scanner scanner) {

		}
	},
	FINISH("Q"){
		@Override
		void function(Scanner scanner) {

		}
	};

	private String command;
	abstract void function(Scanner scanner);

	MainRoute(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

	public static MainRoute findRoute(String command){
		return Arrays.stream(values())
			.filter(i -> i.getCommand().equals(command))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("올바르지 않은 명령어 입니다."));
	}

	public void apply(Scanner scanner) {
		function(scanner);
	}
}
