package com.org.siri.service;

import com.org.siri.model.Railways;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RailwayService {

    public void createRailway(Railways railways);
    public List<Railways> getAllRailway();
    public String deleteById(Integer id);
    public Railways findByStationName(String stationName);
    public void updateRailways(Railways railways);

}
