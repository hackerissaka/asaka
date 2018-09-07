package com.cg.booking.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.cg.booking.bean.Request;
import com.cg.booking.dao.BookingDao;
import com.cg.booking.dao.IBookingDao;
import com.cg.booking.exception.BookingException;

public class BookingService implements IBookingService{
IBookingDao bookingDao = new BookingDao();
	@Override
	public int addRequest(Request request) throws BookingException {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("PropertyFile.properties");
			Properties p = new Properties();
			p.load(fis);
			String cabNo = p.getProperty(request.getPincode());
			if(cabNo!=null){
				request.setRequestStatus("Accepted");
				request.setCabNumber(cabNo);
				
			}
		} catch (FileNotFoundException e) {
		
			throw new BookingException(e.getMessage());
		}catch(IOException e){
			throw new BookingException(e.getMessage());
		}finally{
			try{
			fis.close();
			}catch(IOException e){
				throw new BookingException(e.getMessage());
			}
		}
		return bookingDao.addRequest(request);
	}
	@Override
	public boolean validateRequest(Request request) throws BookingException {
		if(validateName(request.getCustomerName()) 
				&& validatePhone(request.getPhone())
				&& validatePincode(request.getPincode())){
			return true;
		}
		return false;
	}
private boolean validateName(String name) throws BookingException{
	if(name.isEmpty() || name==null){
		throw new BookingException("Customer name cannot be empty");
	}else{
		if(!name.matches("[A-Z][A-Za-z\\s]{2,}")){
			throw new BookingException("Name should start with a capital letter and should contain alphabets");
		}
	}
	return true;
}
private boolean validatePhone(String phone) throws BookingException{
	if(!phone.matches("\\d{10}")){
		throw new  BookingException("Phone number should contain 10 digits");
	}
	return true;
	
}
private boolean validatePincode(String pin) throws BookingException{
	if(!pin.matches("\\d{6}")){
		throw new BookingException("Pin code should contain exactly 6 digits");
	}
	return true;
}
@Override
public Request getRequestById(int id) throws BookingException {
	
	return bookingDao.getRequestById(id);
}
}
