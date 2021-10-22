package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.SendQuotePage;
import runners.RunCucumberTest;

public class SendQuoteStep extends RunCucumberTest {
    SendQuotePage sendQuotePage = new SendQuotePage(driver);

    @Dado("^que eu estou no formulario Send Quote$")
    public void que_eu_estou_no_formulario_Send_Quote() {
        sendQuotePage.formSendQuote();

    }

    @Dado("^preencho todos os campos desse formulario$")
    public void preencho_todos_os_campos_desse_formulario() {
        sendQuotePage.fieldEmail();
        sendQuotePage.fieldPhone();
        sendQuotePage.fieldUserName();
        sendQuotePage.fieldPassword();
        sendQuotePage.fieldConfirmPassowrd();
        sendQuotePage.fieldComments();

    }

    @Dado("^eu clico no botão Send$")
    public void eu_clico_no_botão_Send() {
        sendQuotePage.btnSend();

    }

    @Quando("^a mensagem é apresentada$")
    public void a_mensagem_é_apresentada() {
        sendQuotePage.messageSuccess();

    }

    @Então("^eu clico no botão ok$")
    public void eu_clico_no_botão_ok() {
        sendQuotePage.okBtn();

    }


}
