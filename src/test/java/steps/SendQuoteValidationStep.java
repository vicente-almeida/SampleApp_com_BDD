package steps;

import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import pages.SendQuoteValidationPage;
import runners.RunCucumberTest;

public class SendQuoteValidationStep extends RunCucumberTest {
    SendQuoteValidationPage sendQuoteValidationPage = new SendQuoteValidationPage(driver);

    @Quando("^eu n�o preencho algum campo obrigat�rio$")
    public void eu_n�o_preencho_algum_campo_obrigat�rio() {
        sendQuoteValidationPage.fieldUserNameValidation();
        sendQuoteValidationPage.fieldPasswordValidation();
        sendQuoteValidationPage.fieldConfirmPasswordValidation();
        sendQuoteValidationPage.fieldCommentsValidation();

    }

    @Quando("^� apresentada a mensagem$")
    public void �_apresentada_a_mensagem() {
        sendQuoteValidationPage.messageValidation();

    }

    @Ent�o("^eu clico no bot�o ok da mensagem$")
    public void eu_clico_no_bot�o_ok_da_mensagem() {
        sendQuoteValidationPage.btnOKMessage();
    }
}
