package com.javatechie.bdd_example;

import cucumber.api.java.en.And;
import cucumber.runtime.junit.Assertions;
import model.Active;
import model.Address;
import model.Contract;
import model.Subscriber;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AddressService<contract1> {



  Address address = new Address("France" , "92130 les moulins",Active.nonActive) ;
	Contract contract1 = new Contract(2,address);
	Subscriber subscriber = new Subscriber("borhene","akkari",contract1);
	String percentage = "";
	boolean result ;

	@Given("^Subscriber with \"([^\"]*)\" and \"([^\"]*)\"")
	public void execute_DiscountService_Business(String arg0,String arg1) throws Throwable {
		System.out.println( subscriber.getContract().getAddress().getCountry().equalsIgnoreCase(arg1));
		result = subscriber.getContract().getAddress().getCountry().equalsIgnoreCase(arg1) ;
		if (subscriber.getContract().getAddress().getCountry() == arg1  ) {
			System.out.println(" un abonnée avec une adresse principale "+arg0 + " en "+arg1);
		}
		else {
			System.out.println(" un abonnée avec une adresse principale "+arg0 + " en "+arg1);

		}
	}


	@When("^le conseiller connecté à \"([^\"]*)\" modifie l'adresse de l'abonné \"([^\"]*)\"$")
	public void leConseillerConnectéÀModifieLAdresseDeLAbonné(String arg0, String arg1) throws Throwable {
		 if (result) System.out.println("le conseiller connecté à "+arg0+" modifie l'adresse de l'abonné "+arg1);
		 else System.out.println("Condition n'est pas satisfaite ");

	}

	@Then("^the adress of subscriber is modified and saved in all its contracts$")
	public void theAdressOfSubscriberIsModifiedAndSavedInAllItsContracts() {
		String newAdress = " la nouvelle adress is saved " ;
		if (result == true )
		{subscriber.getContract().getAddress().setLocation(newAdress);
		System.out.println("l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné");}
		else
		{
			System.out.println("l'abonné n'est pas en france on va pas modifier");
		}



	}

	@And("^a movment of modification of the adress is created$")
	public void aMovmentOfModificationOfTheAdressIsCreated() {
	if(result == true)	{System.out.println("un mouvement de modification d'adresse est créé");System.out.println("fin de Scenario");}
	else
		{
			System.out.println(" y'aura pas de mouvement de modification d'adresse a  créer ");
			System.out.println("fin de Scenario");
		}
	}
}
