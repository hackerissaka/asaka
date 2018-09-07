package com.cg.booking.db;

import java.util.HashMap;

import com.cg.booking.bean.Request;

public class BookingDb {

	private static HashMap<Integer,Request> requestDb= new HashMap<Integer,Request>();
	
	public static HashMap<Integer, Request> getRequestDb(){
		return requestDb;
	}

}
