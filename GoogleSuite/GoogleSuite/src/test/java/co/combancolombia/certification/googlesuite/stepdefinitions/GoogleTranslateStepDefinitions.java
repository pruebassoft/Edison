package co.combancolombia.certification.googlesuite.stepdefinitions;


import org.openqa.selenium.WebDriver;

import co.combancolombia.certification.googlesuite.tasks.GoTo;
import co.combancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.combancolombia.certification.googlesuite.tasks.Translate;
import co.combancolombia.certification.googlesuite.userinterface.GoogleAppsComponent;
import co.combancolombia.certification.googlesuite.userinterface.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp(){
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() {
	   susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
			   GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	   
	}

	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {
	    susan.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	

}
