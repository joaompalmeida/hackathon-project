package org.academiadecodigo.asynctomatics.hackathonproject.controller.web;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
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

    @Autowired
    public void setTripService(TripService tripService) {
        this.tripService = tripService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String tripForm(Model model) {

        System.out.println("\nTRIP FORM\n");

        model.addAttribute("tripchoices", new TripChoices());
        //model.addAttribute("traveller", "John");

        return "welcome-traveller";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public String tripChoices(@Valid @ModelAttribute("tripchoices") TripChoices tripChoices, Model model) {

        System.out.println("\nTRIP CHOICES\n");
        tripService.createTripList(tripChoices);

        model.addAttribute("trip", tripService.getTrip(0));
        model.addAttribute("counter", "0");

        return "roulette";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/roulette/{n}")
    public String tripRoulette(@PathVariable Integer n, Model model) {

        System.out.println("\nROULETTE: " + n + "\n");

        if (n >= 2) {
            return "nextweek";
        }

        model.addAttribute("trip", tripService.getTrip(++n));
        model.addAttribute("counter", (n) + "");

        return "roulette";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/roulette/pay/{n}")
    public String tripPay(@PathVariable Integer n, Model model) {

        System.out.println("\nPay: " + tripService.getTrip(n) + "\n");

        model.addAttribute("counter", (n) + "");

        return "payment";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/roulette/pay/{n}")
    public String tripGo(@PathVariable Integer n, Model model) {

        System.out.println("\nGO: " + tripService.getTrip(n) + "\n");

        return "congrats";
    }

}