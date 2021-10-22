package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.PriceOptionPage;
import runners.RunCucumberTest;

public class PriceOptionStep extends RunCucumberTest {
    PriceOptionPage priceOptionPage = new PriceOptionPage(driver);

    @Dado("^que eu estou no formulário Select Price$")
    public void que_eu_estou_no_formulário_Select_Price() {
        priceOptionPage.formPriceOption();

    }

    @Quando("^eu clico em um dos preços$")
    public void eu_clico_em_um_dos_preços() {
        priceOptionPage.clickPrice();

    }

    @Quando("^clico no botão de Next$")
    public void clico_no_botão_de_Next() {
        priceOptionPage.clickBtnNext();

    }

    @Então("^eu sou direcionado ao formulário Send Quote$")
    public void eu_sou_direcionado_ao_formulário_Send_Quote() {
        priceOptionPage.formSendQuote();

    }
}
