package com.cg.equipTrack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.equipTrack.Bean.User;
import com.cg.equipTrack.exception.EquipTrackException;
import com.cg.equipTrack.repo.IEquipTrackRepo;

@Service
public class EqupTrackServiceImpl implements IEquipTrackService {

	@Autowired
	private IEquipTrackRepo repo;
	
	@Override
	public String login(String userId, String password) throws EquipTrackException {
		User u = repo.login(userId, password);
		if(u==null) {
			return "Login failed";
		}else {
			return "Login Successful";
		}
	}

}
