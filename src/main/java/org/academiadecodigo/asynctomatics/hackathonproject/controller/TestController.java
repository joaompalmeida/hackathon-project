package org.academiadecodigo.asynctomatics.hackathonproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {

		@RequestMapping(method = RequestMethod.GET, path = {"/", ""})
		public ResponseEntity<String> listCustomers() {

			String coiso = "coiso";

			return new ResponseEntity<>(coiso, HttpStatus.OK);
		}


}
