package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import pages.PriceOptionPage;
import runners.RunCucumberTest;

public class PriceOptionStep extends RunCucumberTest {
    PriceOptionPage priceOptionPage = new PriceOptionPage(driver);

    @Dado("^que eu estou no formul�rio Select Price$")
    public void que_eu_estou_no_formul�rio_Select_Price() {
        priceOptionPage.formPriceOption();

    }

    @Quando("^eu clico em um dos pre�os$")
    public void eu_clico_em_um_dos_pre�os() {
        priceOptionPage.clickPrice();

    }

    @Quando("^clico no bot�o de Next$")
    public void clico_no_bot�o_de_Next() {
        priceOptionPage.clickBtnNext();

    }

    @Ent�o("^eu sou direcionado ao formul�rio Send Quote$")
    public void eu_sou_direcionado_ao_formul�rio_Send_Quote() {
        priceOptionPage.formSendQuote();

    }
}
