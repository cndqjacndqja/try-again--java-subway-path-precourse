package subway.controller;

import static subway.view.InputView.*;
import static subway.view.OutputView.*;

import java.util.Scanner;

import subway.domain.function.ShortestRoute;

public class ShortestRouteController {
	public void run(Scanner scanner) {
		printShortestRouteScreen();
		ShortestRoute shortestRoute = ShortestRoute.findRoute(inputLookUpRouteType(scanner));
		shortestRoute.apply(scanner);
	}
}
