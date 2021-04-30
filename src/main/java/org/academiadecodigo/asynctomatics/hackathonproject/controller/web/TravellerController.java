package org.academiadecodigo.asynctomatics.hackathonproject.controller.web;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;
import org.academiadecodigo.asynctomatics.hackathonproject.services.TravellerService;
import org.academiadecodigo.asynctomatics.hackathonproject.services.TravellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@CrossOrigin
@Controller
@RequestMapping("/in")
public class TravellerController {

    private TravellerService travellerService;

    @Autowired
    public void setTravellerService(TravellerService travellerService) {
        this.travellerService = travellerService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String signInLogin(Model model) {

        System.out.println("\nNEW Traveller\n");

        model.addAttribute("travellerlogin", new Traveller());
        model.addAttribute("travellersignin", new Traveller());

        return "sign-in";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/signin")
    public String signIn(@ModelAttribute("travellersignin") Traveller traveller, Model model) {

        String[] pass = traveller.getPassword().split(",");

        if (validatePhone(traveller.getPhone()) && validateNewEmail(traveller.getEmail()) && validate(traveller.getFirstName()) && validate(traveller.getLastName()) && validateNewPassword(pass)) {

            traveller.setPassword(pass[0]);
            travellerService.save(traveller);

            System.out.println("-----------------signIn------------------------");

            TripChoices newTrip = new TripChoices();
            Integer travellerId = travellerService.getTravellerByEmail(traveller.getEmail()).getId();
            newTrip.setTravellerId(travellerId);

            model.addAttribute("traveller", traveller.getFirstName());
            model.addAttribute("tripchoices", newTrip);

            return "welcome-traveller";
        }

        return "redirect:/in";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String logIn(@Valid @ModelAttribute("travellerlogin") Traveller traveller, Model model) {

        if (validateLogIn(traveller)) {

            System.out.println("-------------------logIn----------------------");

            TripChoices newTrip = new TripChoices();
            Integer travellerId = travellerService.getTravellerByEmail(traveller.getEmail()).getId();
            newTrip.setTravellerId(travellerId);

            model.addAttribute("traveller", traveller.getFirstName());
            model.addAttribute("tripchoices", newTrip);

            return "welcome-traveller";
        }

        return "redirect:/in";
    }

    private boolean validatePhone (String input) {
        return validate(input) && input.length() >= 9;
    }

    private boolean validateNewPassword (String[] input) {
        return validate(input[0]) && input[0].equals(input[1]);
    }

    private boolean validateNewEmail (String input) {
        return validate(input) && travellerService.getTravellerByEmail(input) == null;
    }

    private boolean validateLogIn (Traveller traveller) {

        String email = traveller.getEmail();
        String pass = traveller.getPassword();
        Traveller ActualTraveller = travellerService.getTravellerByEmail(email);

        return validate(pass) && validate(email) && ActualTraveller != null && pass.equals(ActualTraveller.getPassword());
    }

    private boolean validate (String input) {
        return input != null && !input.isEmpty();
    }

}