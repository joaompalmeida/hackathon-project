package org.academiadecodigo.asynctomatics.hackathonproject.controller.web;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Traveller;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.academiadecodigo.asynctomatics.hackathonproject.services.TravellerService;
import org.academiadecodigo.asynctomatics.hackathonproject.services.TripService;
import org.academiadecodigo.asynctomatics.hackathonproject.services.TripServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/trip")
public class TripControllerWeb {

    private TripService tripService;
    private TravellerService travellerService;

    @Autowired
    public void setTravellerService(TravellerService travellerService) {
        this.travellerService = travellerService;
    }

    @Autowired
    public void setTripService(TripService tripService) {
        this.tripService = tripService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String tripForm(Model model) {
        return "redirect:/in";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public String tripChoices(@Valid @ModelAttribute("tripchoices") TripChoices tripChoices, Model model) {

        System.out.println("\n-------TRIP CHOICES-------\n");

        if (tripChoices.getTravellerId() > 0) {
            tripService.createTripList(tripChoices);

            model.addAttribute("trip", tripService.getTrip(0));
            model.addAttribute("counter", "0");
            model.addAttribute("traveller", travellerService.getTravellerById(tripChoices.getTravellerId()));

            return "roulette";
        }

        return "redirect:/in";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/roulette",  "/roulette/{n}"})
    public String tripRouletteGet(Model model) {
        return "redirect:/in";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/roulette/{n}")
    public String tripRoulette(@Valid @ModelAttribute("traveller") Traveller traveller, @PathVariable Integer n, Model model) {

        System.out.println("\n-------ROULETTE: " + n + "--------\n");

        if (n >= 2) {
            return "nextweek";
        }

        model.addAttribute("trip", tripService.getTrip(++n));
        model.addAttribute("counter", (n) + "");
        model.addAttribute("traveller", traveller);

        return "roulette";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/roulette/pay/{n}")
    public String tripPay(@Valid @ModelAttribute("traveller") Traveller traveller, @PathVariable Integer n, Model model) {

        System.out.println("\nPay: " + tripService.getTrip(n) + "\n");

        model.addAttribute("counter", (n) + "");
        model.addAttribute("traveller", traveller);

        return "payment";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/roulette/pay/{n}")
    public String tripGo(@Valid @ModelAttribute("traveller") Traveller traveller, @PathVariable Integer n, Model model) {

        System.out.println("\nGO: " + tripService.getTrip(n) + "\n");

        return "congrats";
    }

}