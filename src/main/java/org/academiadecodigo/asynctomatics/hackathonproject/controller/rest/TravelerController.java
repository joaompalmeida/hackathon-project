package org.academiadecodigo.asynctomatics.hackathonproject.controller.rest;

import org.academiadecodigo.asynctomatics.hackathonproject.controller.TripChoices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/trip")
public class TravelerController {

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
