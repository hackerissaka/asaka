package com.cg.equipTrack.Service;

import com.cg.equipTrack.exception.EquipTrackException;

public interface IEquipTrackService {
	
	String login(String userId,String password) throws EquipTrackException;
}
