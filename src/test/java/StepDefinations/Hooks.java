package StepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hooks {

    @Before// her senaryodan once
    public void before(Scenario scenario){
        System.out.println("Senarya basladi..");
        System.out.println(scenario.getId()+"senaryonun id si");
        System.out.println(scenario.getName()+"senaryonun adi");
    }

    @After //Her senaryodan sonra calisr
    public void after(Scenario scenario){
        System.out.println("Senaryo bitti");
        System.out.println(scenario.getStatus()+"senaryonun sonucu");


        try{ //en son cikmadan ekrani gorelim diye koyduk bilerek
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Driver.quitDriver();
    }
}
