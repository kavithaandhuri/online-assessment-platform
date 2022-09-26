package com.exam.examserver.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="booking")
public class Booking {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
      private Long booking_id;
      private String slot_time;
      private int no_of_slot;
      private String user_id;
      private String contact;
      private String email_id;
      private String total_price;
      private String boarding_time;
      private String boarding_date;
      
      @OneToMany(mappedBy = "booking",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
      @JsonIgnore
      private Set<Booking> booking = new LinkedHashSet<>();
      
      
      
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(  String exam_id ,String slot_time, int no_of_slot,String user_id, String contact,String email_id, String total_price,String boarding_time, String boarding_date) {
		super();
		
		this.slot_time = slot_time;
		this.no_of_slot = no_of_slot;
		this.user_id = user_id;
		this.contact = contact;
		this.email_id = email_id;
		this.total_price = total_price;
		this.boarding_time = boarding_time;
		this.boarding_date = boarding_date;
	}

	public Long getBookingId() {
		return booking_id;
	}
	public void setBookingId(Long booking_id) {
		this.booking_id = booking_id;
	}
	
	
	public String getSlotTime() {
		return slot_time;
	}
	public void setSlotTime(String slot_time) {
		this.slot_time = slot_time;
	}
	
	public int getNoOfSlot() {
		return no_of_slot;
	}
	public void setNoOfSlot(int no_of_slot) {
		this.no_of_slot = no_of_slot;
	}
      
	public String getUserId() {
		return user_id;
	}
	public void setUserId(String user_id) {
		this.user_id = user_id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(String boarding_time) {
		this.boarding_time = boarding_time;
	}
	public String getBoarding_date() {
		return boarding_date;
	}
	public void setBoarding_date(String boarding_date) {
		this.boarding_date = boarding_date;
	}	
	
	
	
      
}
