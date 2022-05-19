package com.org.siri.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Railways {
    @Id
    private int id;
    private String stationName;
    private String railwayStation;
    private double stationCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getRailwayStation() {
        return railwayStation;
    }

    public void setRailwayStation(String railwayStation) {
        this.railwayStation = railwayStation;
    }

    public double getStationCode() {
        return stationCode;
    }

    public void setStationCode(double stationCode) {
        this.stationCode = stationCode;
    }
}
