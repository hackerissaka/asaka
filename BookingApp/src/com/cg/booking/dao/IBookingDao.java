package com.cg.booking.dao;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;

public interface IBookingDao {
int addRequest(Request request)throws BookingException;
Request getRequestById (int id) throws BookingException;
}
