package lan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MedioDePago extends BasePage {
    public MedioDePago(WebDriver driver) {
        super(driver);
    }
    //Objetos//
    @FindBy (css= "#titulo_grupo_mp_caja_contenido_CREDIT_CARD")
    WebElement MenuTarjetaDeCredito;

    @FindBy (xpath = "//input[@title='Tarjeta Naranja']")
    WebElement ElegirTarjetaNaranja;

    @FindBy (xpath = "//input[@name='checkbox']")
    WebElement AceptarTerminosyCondiciones;

    @FindBy (xpath = "//input[@name='next_step']")
    WebElement btnContinuar;

    @FindBy (css = "#id_rut_titular")
    WebElement DNITitular;
    //Metodos//
    public void SeleccionarMedioDePago(){
        waitFor(20);
        MenuTarjetaDeCredito.click();
        ElegirTarjetaNaranja.click();
        Select SelectDNI = new Select(driver.findElement(By.xpath("//*[@id=\"id_tipo_foid\"]")));
        SelectDNI.selectByValue("ni");
        DNITitular.sendKeys("32795430");
        AceptarTerminosyCondiciones.click();
        waitFor(2);
       // btnContinuar.click();



    }
}
