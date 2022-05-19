package com.org.siri.controller;

import com.org.siri.model.Railways;
import com.org.siri.service.RailwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RailwayController {
    @Autowired
    RailwayService railwayService;

    @PostMapping("/create")
    public void createRailway(@RequestBody Railways railways){
        railwayService.createRailway(railways);

    }
    @GetMapping("/getAll")
    public List<Railways>getAllRailway(){
        List<Railways> ss = railwayService.getAllRailway();
        return ss;

    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
      String rrr = railwayService.deleteById(id);
        return rrr;
    }
    @GetMapping("/findByName/{stationName}")
    public Railways findByStationName(@PathVariable String stationName){
        Railways rsw  = railwayService.findByStationName(stationName);
        return rsw;

    }
    @PutMapping("/update")
    public void updateRailways(@RequestBody Railways railways){
        railwayService.updateRailways(railways);
    }




}
