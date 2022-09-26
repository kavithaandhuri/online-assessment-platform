package com.exam.examserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Booking;



public interface BookingRepository extends JpaRepository<Booking,Long>{

	Booking save(Booking booking);

}
