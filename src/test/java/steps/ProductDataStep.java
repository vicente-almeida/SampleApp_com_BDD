package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.ProductDataPage;
import runners.RunCucumberTest;

public class ProductDataStep extends RunCucumberTest {
    ProductDataPage productDataPage = new ProductDataPage(driver);


    @Dado("^que eu estou no formulario Product Data$")
    public void que_eu_estou_no_formulario_Product_Data() {
        productDataPage.formProductData();

    }

    @Dado("^preencho todos os campos do formulario product data$")
    public void preencho_todos_os_campos_do_formulario_product_data() {
        productDataPage.fieldStartDate("10/14/2030");
        productDataPage.fieldInsuranceSum(4);
        productDataPage.fieldMeritRating("Bonus 9");
        productDataPage.fieldDamageInsurance(1);
        productDataPage.fieldOptionalProducts();
        productDataPage.fieldCourtesyCar(2);
    }

    @Quando("^eu clico em Next$")
    public void eu_clico_em_Next() {
        productDataPage.buttonNext();

    }

    @Então("^eu sou direcionado ao formulario Select Price Option$")
    public void eu_sou_direcionado_ao_formulario_Select_Price_Option() {
        productDataPage.formselectPrice();

    }
}
