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

    @RequestMapping(method = RequestMethod.GET, path = {"/log", ""})
    public String signInLogin(Model model) {

        System.out.println("\n" + new Traveller() + "\n");

        model.addAttribute("travellerlogin", new Traveller());
        model.addAttribute("travellersignin", new Traveller());

        return "sign-in";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/signin")
    public String signIn(@ModelAttribute("travellersignin") Traveller traveller, Model model) {
        travellerService.save(traveller);

        System.out.println("------------------------------------------");
        System.out.println("\n" + traveller + "\n");
        System.out.println("\n" + traveller.getFirstName() + "\n");

        model.addAttribute("traveller", traveller.getFirstName());
        model.addAttribute("tripchoices", new TripChoices());
        return "welcome-traveller";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String logIn(@Valid @ModelAttribute("travellerlogin") Traveller traveller, Model model) {

        System.out.println("------------------------------------------");
        System.out.println("\n" + traveller + "\n");
        System.out.println("\n" + traveller.getFirstName() + "\n");

        model.addAttribute("traveller", traveller.getFirstName());
        model.addAttribute("tripchoices", new TripChoices());

        return "welcome-traveller";
    }
}