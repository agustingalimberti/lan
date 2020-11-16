package lan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacionDelPasajero extends BasePage{
    public InformacionDelPasajero(WebDriver driver) {
        super(driver);
    }
    //Objetos//
   @FindBy (xpath = "//input[@name='adult-0.name']")
    WebElement NombrePasajero;

    @FindBy (xpath = "//input[@name='adult-0.surname']")
    WebElement ApellidoPasajero;

    @FindBy (xpath = "//input[@name='adult-0.documentNumber']")
    WebElement DNIPasajero;

   @FindBy (xpath = "//input[@name='contact.email']")
   WebElement MailPasajero;

   @FindBy (xpath = "//input[@name='contact.phoneAreaCode']")
    WebElement CodigoDeAreaTelefonico;

   @FindBy (xpath = "//input[@name='contact.phoneNumber']")
    WebElement NumeroTelefonico;

    //Metodos//
    public void CompletarDatosPasajero(){
        NombrePasajero.sendKeys("Agustin");
        ApellidoPasajero.sendKeys("Galimberti");
        DNIPasajero.sendKeys("41845740");
        MailPasajero.sendKeys("agustingalimberti11@gmail.com");
        CodigoDeAreaTelefonico.sendKeys("380");
        NumeroTelefonico.sendKeys("154988767");
    }
}
