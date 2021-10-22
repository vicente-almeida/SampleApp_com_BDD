package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import pages.VehicleDataPage;
import runners.RunCucumberTest;


public class VehicleDataStep extends RunCucumberTest {

    VehicleDataPage vehicleDataPage = new VehicleDataPage(driver);


    @Dado("^que eu acesso a aplica��o$")
    public void que_eu_acesso_a_aplica��o() {
        vehicleDataPage.acessarAplicacao();


    }

    @Dado("^clico no link Automobile$")
    public void clico_no_link_Automobile() {
        vehicleDataPage.clickLinkAutomobile();


    }

    @Dado("^preencho as informa��es do formul�rio Vehicle Data$")
    public void preencho_as_informa��es_do_formul�rio_Vehicle_Data() {
        vehicleDataPage.fieldMake("Honda");
        vehicleDataPage.fieldEnginePerformance();
        vehicleDataPage.fieldDateManufacture("09/19/2011");
        vehicleDataPage.fieldNumberSeats();
        vehicleDataPage.fieldFuelType();
        vehicleDataPage.fieldListPrice("700");
        vehicleDataPage.fieldAnnualMileage("500");


    }

    @Quando("^clico no bot�o Next$")
    public void clico_em_Next() {
        vehicleDataPage.btnNext();

    }

    @Ent�o("^eu sou direcionado ao formul�ro Insurant Data$")
    public void eu_sou_direcionado_ao_formul�ro_Insurant_Data() {
        vehicleDataPage.formInsurantData();


    }


}
