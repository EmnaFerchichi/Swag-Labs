package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    WebDriver driver;

    @Given("l'utilisateur est sur le site Swag labs")
    public void l_utilisateur_est_sur_le_site_swag_labs() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("Utilisateur saisit un UserName")
    public void utilisateurSaisitUnUserName() {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
    }

    @And("Utilisateur saisit un Password")
    public void utilisateurSaisitUnPassword() {
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    }

    @And("Utilisateur Clique sur le Bouton Login")
    public void utilisateurCliqueSurLeBouton() {
        driver.findElement(By.cssSelector("#login-button")).click();
    }

    @Then("Utilisateur se redirigige vers son compte")
    public void utilisateurSeRedirigigeVersSonCompte() {
        System.out.println("l'utilisateur est redirigé vers : "+ driver.getCurrentUrl());
    }
}
