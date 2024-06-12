package com.gl.Service.repository;

import com.gl.Service.entity.SimOffers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SimOffersRepository extends JpaRepository<SimOffers, Integer> {
    public SimOffers findBySimId(Integer simId);

}
