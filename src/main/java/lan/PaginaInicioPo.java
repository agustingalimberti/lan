package lan;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaInicioPo extends BasePage {
    public PaginaInicioPo(WebDriver driver) {
        super(driver);
    }

    String url = "https://www.latam.com/es_ar/";

    //captura de elementos//

    @FindBy(css = "#onesignal-slidedown-cancel-button")
    WebElement btnCerrarAlerta;

    @FindBy(xpath = "//input[@id='compra-select-origin']")
    WebElement origenVuelo;

    @FindBy(css = "#ui-id-10")
    WebElement ciudadBuenosAires;

    @FindBy(xpath = "//input[@id='compra-select-destination']")
    WebElement destinoVuelo;

    @FindBy(css = "#ui-id-2")
    WebElement ciudadSantiagoChile;

    @FindBy(xpath = "//button[contains(text(),'Busca tu vuelo')]")
    WebElement btnBuscar;

    @FindBy(xpath = "//div[@id='onesignal-slidedown-dialog']")
    WebElement bannerInicio;

    //Metodos//
    public void Inicio() {
        Log("iniciando");
        driver.get(url);
    }

    public void cierreAlerta() {
        waitFor(20);
        waitForElementToAppear(bannerInicio);
        if (isVisible(bannerInicio)) {
            btnCerrarAlerta.click();
        } else {
            Log("no aparecio el banner de inicio");
        }
    }

    public void elegirOrigen(){
        waitFor(5);
        waitForElementToAppear(origenVuelo);
       origenVuelo.click();
       origenVuelo.sendKeys("BUE");
       waitFor(2);
       if(ciudadBuenosAires.isSelected()) {
           ciudadBuenosAires.click();
           ciudadBuenosAires.submit();
       }else{
           Log("No se encontro la ciudad");
       }
    }

}
