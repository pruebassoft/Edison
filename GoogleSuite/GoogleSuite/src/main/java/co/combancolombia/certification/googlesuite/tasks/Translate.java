package co.combancolombia.certification.googlesuite.tasks;

import co.combancolombia.certification.googlesuite.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
				Enter.theValue("Chesse").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA));
		
	}

	public static Translate the() {
		return Tasks.instrumented(Translate.class);
	}
	
	

}
