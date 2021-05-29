package com.andreFelipe.hrpayroll.resources;

import com.andreFelipe.hrpayroll.entities.Payment;
import com.andreFelipe.hrpayroll.services.PaymenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/payments")
public class PaymentResources {
	
	@Autowired
	private PaymenteService ps;
	
	@GetMapping(value= "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		
		Payment payment = ps.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}

}
