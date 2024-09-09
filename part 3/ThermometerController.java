package org.example.controller;
import org.example.dto.BasicResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ThermometerController {
    // include services

    /**
     * brief: Get the current temperature in Fahrenheit or Celsius
     * url: /api/v1/thermometer?unit="fahrenheit"
     *      /api/v1/thermometer?unit="celsius"
     *
     * @precondition  1. Current temperature is still working
     *                2. Input parameter is "fahrenheit" or "celsius"
     *
     * @postcondition 1. Current celsius temperature is in the range of (-273.15, 1.8*10^308]
     *                2. Current fahrenheit temperature is in the range of (-459.67, 1.8*10^308]
     * @param         unit This is the unit that this temperature API should return in, which should be either "celsius" or "fahrenheit"
     * @return        A JSON format data that includes: response status; temperature(celsius/fahrenheit); timestamp
     * @throws        IllegalArgumentException throws if the input argument isn't correct
     * @throws        InheritException throws if this temperature device is not working
     * @throws        OutofRangeException throws if the return temperature is out of range
     *
     * @example
     *      {
     *          "status": "success",
     *          "code": 200,
     *          "data": {
     *              "temperature": 30.01,
     *              "unit": "celsius",
     *              "timestamp": "2024-09-08 10:09:23.45"
     *          }
     *      }
     *
     */
    @GetMapping("/thermometer")
    public BasicResponse getCurrentTemperature(@RequestParam String unit){
        // implement getting temperature services
        return BasicResponse();
    }
}
