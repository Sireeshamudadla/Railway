package com.org.siri.service;

import com.org.siri.model.Railways;
import com.org.siri.repository.RailwayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RailwayServiceImpl implements RailwayService {
    @Autowired
    RailwayRepo railwayRepo;

    @Override
    public void createRailway(Railways railways) {
        railwayRepo.save(railways);

    }

    @Override
    public List<Railways> getAllRailway() {
        List<Railways> rail = railwayRepo.findAll();
        return rail;
    }

    @Override
    public String deleteById(Integer id) {
        railwayRepo.findById(id);
        return "success";
    }

    @Override
    public Railways findByStationName(String stationName) {
        Railways ss = railwayRepo.findByStationName(stationName);
        return ss;
    }

    @Override
    public void updateRailways(Railways railways) {
        railwayRepo.save(railways);

    }
}
