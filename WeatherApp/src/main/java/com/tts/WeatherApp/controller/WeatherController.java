package com.tts.WeatherApp.controller;

import com.tts.WeatherApp.model.Response;
import com.tts.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    //we're hardcoing the zip code that gets passed into the API
    //change this later
    @GetMapping
    public String getIndex(Model model) {
        Response response = weatherService.getForecast("43220");
        model.addAttribute("data", response);
        return "index";
    }

}
