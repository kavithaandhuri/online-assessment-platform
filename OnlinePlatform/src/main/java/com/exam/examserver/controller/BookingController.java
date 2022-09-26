package com.exam.examserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examserver.model.Booking;
import com.exam.examserver.model.Category;
import com.exam.examserver.service.BookingService;
import com.exam.examserver.service.CategoryService;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	//Add booking
	@PostMapping("/addBooking")
	public ResponseEntity<Booking>addBooking(@RequestBody Booking booking){
		Booking category1 = this.bookingService.addBooking(booking);
		return ResponseEntity.ok(category1);
	}
//	//get booking
//	@GetMapping("/{bookingId}")
//	public Booking getBooking(@PathVariable("bookingId") Long bookingId) {
//		return this.bookingService.getBooking(bookingId);
//	}
//	
//	//get all bookings
//	@GetMapping("/")
//	public ResponseEntity<?> getBooking(){
//	return ResponseEntity.ok(this.bookingService.getBooking());
//	}
//	//update category
//	@PutMapping("/")
//	public Booking updateBooking(@RequestBody Booking booking) {
//		return this.bookingService.updateBooking(booking);
//	}
//	
//	//delete category
//	@DeleteMapping("/{bookingId}")
//	public void deleteCategory(@PathVariable("bookingId") Long bookingId) {
//		this.bookingService.deleteBooking(bookingId);
//	}
//	
}
