package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.SendQuoteValidationPage;
import runners.RunCucumberTest;

public class SendQuoteValidationStep extends RunCucumberTest {
    SendQuoteValidationPage sendQuoteValidationPage = new SendQuoteValidationPage(driver);

    @Quando("^eu não preencho algum campo obrigatório$")
    public void eu_não_preencho_algum_campo_obrigatório() {
        sendQuoteValidationPage.fieldUserNameValidation();
        sendQuoteValidationPage.fieldPasswordValidation();
        sendQuoteValidationPage.fieldConfirmPasswordValidation();
        sendQuoteValidationPage.fieldCommentsValidation();

    }

    @Quando("^é apresentada a mensagem$")
    public void é_apresentada_a_mensagem() {
        sendQuoteValidationPage.messageValidation();

    }

    @Então("^eu clico no botão ok da mensagem$")
    public void eu_clico_no_botão_ok_da_mensagem() {
        sendQuoteValidationPage.btnOKMessage();
    }
}
