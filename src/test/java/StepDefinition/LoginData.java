package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginData {
    WebDriver driver;

    @Given("Utilisateur est sur le site Swag labs")
    public void utilisateur_est_sur_le_site_swag_labs() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("Utilisateur saisit username{string}")
    public void utilisateurSaisitUsername(String username) {

        driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
    }
    @And("Utilisateur saisit un Password {string}")
    public void utilisateurSaisitUnPassword(String password) {
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    @And("Utilisateur va Cliquer sur le Bouton Login")
    public void utilisateurVaCliquerSurLeBoutonLogin() {
        driver.findElement(By.cssSelector("#login-button")).click();
    }

    @Then("Utilisateur va se redirigige vers son compte")
    public void utilisateurVaSeRedirigigeVersSonCompte() {
        System.out.println("l'utilisateur est redirigé vers : "+ driver.getCurrentUrl());
    }


}
