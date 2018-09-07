package com.cg.equipTrack.controller;

import org.assertj.core.internal.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.equipTrack.Service.IEquipTrackService;
import com.cg.equipTrack.exception.EquipTrackException;

@RestController
public class EquipTrackController {

	private IEquipTrackService service;
	@RequestMapping(value = "/AgainLogin", method = RequestMethod.POST)
	public String login(String userId, String password) throws EquipTrackException {

		try {
			return service.login(userId, password);

		} catch (EquipTrackException e) {
			throw e;
		}
	}
}
