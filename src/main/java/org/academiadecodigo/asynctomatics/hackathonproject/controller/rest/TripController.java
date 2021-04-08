package org.academiadecodigo.asynctomatics.hackathonproject.controller.rest;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.academiadecodigo.asynctomatics.hackathonproject.persistence.model.Trip;
import org.academiadecodigo.asynctomatics.hackathonproject.services.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
@RestController
@RequestMapping("/api/trip")
public class TripController {

    /*private BookingServiceImpl tripService;

    @Autowired
    public void setTripService(BookingServiceImpl tripService) {
        this.tripService = tripService;
    }
*/

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<List<String>> tripChoices(@Valid @ModelAttribute("tripchoices") TripChoices tripChoices, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        System.out.println("\nTRIP CHOICES\n");

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(null , HttpStatus.BAD_REQUEST);
        }

        //tripService.createTripList(tripChoices);

       // Trip trip = tripService.getTrip();

        //List<String> newtrip = new String[] {trip.getLocation(), trip.getValue()};
        List<String> newtrip = new LinkedList<String>();
        newtrip.add("Nigeria");
        newtrip.add("1000");

        return new ResponseEntity<>(newtrip, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/roulette")
    public ResponseEntity<List<String>> tripRoulette() {

        System.out.println("\nROULETTE\n");

        // Trip trip = tripService.getTrip();

        //List<String> newtrip  = new LinkedList<String>();
        //newtrip.add(trip.getLocation());
        //newtrip.add(trip.getValue());

        List<String> newtrip = new LinkedList<String>();
        newtrip.add("Nigeria");
        newtrip.add("1000");

        return new ResponseEntity<>(newtrip, HttpStatus.OK);
    }


}
