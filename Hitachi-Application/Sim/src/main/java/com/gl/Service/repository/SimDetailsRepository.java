package com.gl.Service.repository;

import com.gl.Service.entity.SimDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SimDetailsRepository extends JpaRepository<SimDetails, Integer> {
    @Query("SELECT simStatus FROM SimDetails s WHERE s.serviceNumber = :serviceNumber AND s.simNumber = :simNumber")
    String getStatus(@Param("serviceNumber") long serviceNumber, @Param("simNumber") long simNumber);

    @Query("SELECT simStatus FROM SimDetails WHERE simId = :sim")
    String getSim(@Param("sim") Integer sim);

    @Modifying
    @Query("UPDATE SimDetails SET simStatus = 'active' WHERE simId = :sim")
    Integer setSimStatus(@Param("sim") Integer sim);


}
