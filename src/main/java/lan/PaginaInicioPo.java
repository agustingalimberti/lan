package lan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaInicioPo extends BasePage{
        public PaginaInicioPo(WebDriver driver){
            super(driver);
        }
        String url = "https://www.latam.com/es_ar/";

        //captura de elementos//

    @FindBy (xpath = "//button[@id='onesignal-slidedown-cancel-button']")
    WebElement btnCerrarAlerta;

    @FindBy (xpath = "//input[@id='compra-select-origin']")
    WebElement origenVuelo;

    @FindBy (xpath = "//input[@id='compra-select-destination']")
    WebElement destinoVuelo;

    @FindBy (xpath = "//button[contains(text(),'Busca tu vuelo')]")
    WebElement btnBuscar;

    //Metodos//
    public void Inicio(){
        Log("iniciando");
        driver.get(url);
    }
    public void  cierreAlerta(){
        if(isVisible())
        btnCerrarAlerta.click();
    }

    public void elegirOrigenDestinoVuelo(){
        origenVuelo.click();
        origenVuelo.sendKeys("Buenos Aires");
        destinoVuelo.click();
        destinoVuelo.sendKeys("Santiago de Chile");
        waitForElementToAppear(btnBuscar);
        btnBuscar.click();
    }
    }

