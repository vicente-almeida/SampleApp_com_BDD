package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.VehicleDataPage;
import runners.RunCucumberTest;


public class VehicleDataStep extends RunCucumberTest {

    VehicleDataPage vehicleDataPage = new VehicleDataPage(driver);


    @Dado("^que eu acesso a aplicação$")
    public void que_eu_acesso_a_aplicação() {
        vehicleDataPage.acessarAplicacao();


    }

    @Dado("^clico no link Automobile$")
    public void clico_no_link_Automobile() {
        vehicleDataPage.clickLinkAutomobile();


    }

    @Dado("^preencho as informações do formulário Vehicle Data$")
    public void preencho_as_informações_do_formulário_Vehicle_Data() {
        vehicleDataPage.fieldMake("Honda");
        vehicleDataPage.fieldEnginePerformance();
        vehicleDataPage.fieldDateManufacture("09/19/2011");
        vehicleDataPage.fieldNumberSeats();
        vehicleDataPage.fieldFuelType();
        vehicleDataPage.fieldListPrice("700");
        vehicleDataPage.fieldAnnualMileage("500");


    }

    @Quando("^clico no botão Next$")
    public void clico_em_Next() {
        vehicleDataPage.btnNext();

    }

    @Então("^eu sou direcionado ao formuláro Insurant Data$")
    public void eu_sou_direcionado_ao_formuláro_Insurant_Data() {
        vehicleDataPage.formInsurantData();


    }


}
