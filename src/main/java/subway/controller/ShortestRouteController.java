package subway.controller;

import static subway.view.InputView.*;
import static subway.view.OutputView.*;

import java.util.Scanner;

public class ShortestRouteController {
	public void run(Scanner scanner) {
		printShortestRouteScreen();
		inputLookUpRouteType(scanner);
	}
}
