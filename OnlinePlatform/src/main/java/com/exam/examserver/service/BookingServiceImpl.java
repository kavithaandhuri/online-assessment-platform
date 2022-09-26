package com.exam.examserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.model.Booking;
import com.exam.examserver.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	public BookingRepository bookingRepository;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return this.bookingRepository.save(booking);
	}

}
