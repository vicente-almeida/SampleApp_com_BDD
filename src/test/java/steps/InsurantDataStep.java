package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.InsurantDataPage;
import runners.RunCucumberTest;

public class InsurantDataStep extends RunCucumberTest {

    InsurantDataPage insurantDataPage = new InsurantDataPage(driver);

    @Dado("^que eu estou no formulario Insurant Data$")
    public void que_eu_estou_no_formulario_Insurant_Data() {
        insurantDataPage.formInsurantData();

    }

    @Dado("^preencho todos os campos do formulario$")
    public void preencho_todos_os_campos_do_formulario() {
        insurantDataPage.fieldName("Aline");
        insurantDataPage.fieldSurname("Silva");
        insurantDataPage.fieldBirthdate("07/02/1980");
        insurantDataPage.fieldGender();
        insurantDataPage.fieldCountry();
        insurantDataPage.fieldZipCoude();
        insurantDataPage.fieldCity();
        insurantDataPage.fieldOcuppation();
        insurantDataPage.fieldHobbies();
        insurantDataPage.fieldWebSite();


    }

    @Quando("^clico em Next$")
    public void clico_em_Next() {
        insurantDataPage.btnNext();

    }

    @Então("^eu sou direcionado ao formulario Product Data$")
    public void eu_sou_direcionado_ao_formulario_Product_Data() {
        insurantDataPage.formProductData();

    }
}
