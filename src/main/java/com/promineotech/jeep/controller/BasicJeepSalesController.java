package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;

@RestController
public class BasicJeepSalesController implements JeepSalesController {

  @Override
  public List<Jeep> fetchJeeps(String model, String trimLevel) {
    return null;
  }

}
