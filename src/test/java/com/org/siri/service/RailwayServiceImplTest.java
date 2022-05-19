
package com.org.siri.service;

import com.org.siri.model.Railways;
import com.org.siri.repository.RailwayRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RailwayServiceImplTest {

    @InjectMocks
 private RailwayServiceImpl railwayServiceImpl;
    @Mock
    RailwayRepo railwayRepo;

    @Test
    void createRailway() {
        Railways railways=new Railways();
        railways.setId(101);
        railways.setRailwayStation("blr");
        railways.setRailwayStation("south eastern railways");
        railways.setStationCode(234);
        railwayServiceImpl.createRailway(railways);
    }

    @Test
    void getAllRailway() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByStationName() {
    }

    @Test
    void updateRailways() {
    }
}