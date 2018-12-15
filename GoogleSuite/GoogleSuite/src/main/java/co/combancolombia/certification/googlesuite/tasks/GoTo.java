package co.combancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.combancolombia.certification.googlesuite.userinterface.GoogleAppsComponent;;

public class GoTo implements Task{
	
	private Target googleApp;	
		

	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		//actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_AHORA_NO));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		return instrumented(GoTo.class, googleApp);
	}

}
