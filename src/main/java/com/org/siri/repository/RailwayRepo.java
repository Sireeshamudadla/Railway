package com.org.siri.repository;

import com.org.siri.model.Railways;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface RailwayRepo extends JpaRepository<Railways,Integer> {
    @Transactional
    Railways findByStationName(String stationName);

}
