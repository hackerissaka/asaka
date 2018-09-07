package com.cg.equipTrack.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.equipTrack.Bean.Equipment;
import com.cg.equipTrack.Bean.User;

@Repository
public interface IEquipTrackRepo extends JpaRepository<Equipment, String> {

	@Query(value = "select e.user_id from Equipment e join user u where u.user_id= (:userId) and u.password=(:password)")
	User login(@Param(value = "userId") String userId, @Param(value = "password") String password);

	@Query(value = "select e from Equipment e where e.equipmentTag=(:eTag)")
	Equipment findByETag(@Param(value = "eTag") String eTag);

	@Query(value="select e from Equipment e where e.sequenceNo=(:seqNo)")
	Equipment findBySeqNo(@Param(value = "seqNo") String seqNo);

	
	@Query(value="select e from Equipment e join e.comptrack c where c.machineId=(:macId)")
	Equipment findByMachineId(@Param(value = "macId") String macId);

	@Query(value="select e from Equipment e join e.user u where u.userId=(:userId)")
	Equipment findByUserId(@Param(value = "userId")String userId);

	@Query(value="select e from Equipment e join e.location l where l.locationName=(:location)")
	Equipment findByUserLocation(@Param(value = "location")String location);

	@Query(value="select e.equipmentCode, e.user.userId, e.location.locationName from Equipment e  where e.equipmentCode=(:eCode) ")
	List<Equipment> printLabel(@Param(value = "eCode")String eCode);
	
}
