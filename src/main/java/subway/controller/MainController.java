package subway.controller;

import static subway.utils.Constant.*;
import static subway.view.InputView.*;
import static subway.view.OutputView.*;

import java.util.Scanner;

import subway.domain.function.MainRoute;

public class MainController {
	public void run(Scanner scanner) {
		printMainScreen();
		try{
			MainRoute mainRoute = MainRoute.findRoute(inputMainFunctionCommand(scanner));
			mainRoute.apply(scanner);
		}catch (IllegalArgumentException illegalArgumentException) {
			System.out.println(ERROR_MESSAGE + illegalArgumentException.getMessage());
			run(scanner);
		}

	}
}
