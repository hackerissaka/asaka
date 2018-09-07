package com.cg.application.service;

import java.util.List;

import com.cg.application.DAO.SportsRepo;
import com.cg.application.bean.Day;

public class SportsServiceImpl implements SportsService{
	
	private SportsRepo repo;
	
	public SportsServiceImpl(SportsRepo repo) {
		// TODO Auto-generated constructor stub
		this.repo = repo;
	}

	@Override
	public Day addDay(Day day) {
		// TODO Auto-generated method stub
		return repo.save(day);
	}

	@Override
	public Day findByDay(String name) {
		// TODO Auto-generated method stub
		return repo.findByDayName(name);
	}

	@Override
	public List<Day> findByGame(String name) {
		// TODO Auto-generated method stub
		return repo.findByGameName(name);
	}

}
