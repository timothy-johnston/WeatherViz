package com.techelevator.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.model.APICalls;
import com.techelevator.model.AlertFromAPI;
import com.techelevator.model.BarChartForecastGenerator;
import com.techelevator.model.DailyForecast;

@Controller	
public class HomeController {

	
	
@RequestMapping(path = "/", method = RequestMethod.GET)
	public String showGenericHomePage(HttpServletRequest request) {
	
		//FOR DEMO PURPOSES------------------------------------------------------
		
		//Create a dummy daily forecast object, pass to BarChartForecastGenerator
		//In the real application, this forecast object will be created after
		//making a call to the weather api to get an actual 7 day forecast
		//String chartTitle = "Test Chart: Daily Forecast";
		//DailyForecast dailyForecast = new DailyForecast();
		
		/*
		ArrayList<Integer> highTemps = new ArrayList<Integer>();
		ArrayList<String> forecastDays = new ArrayList<String>();
		highTemps.add(60);
		highTemps.add(62);
		highTemps.add(77);
		highTemps.add(84);
		highTemps.add(85);
		highTemps.add(78);
		highTemps.add(75);
		forecastDays.add("Wedensday");
		forecastDays.add("Thursday");
		forecastDays.add("Friday");
		forecastDays.add("Saturday");
		forecastDays.add("Sunday");
		forecastDays.add("Monday");
		forecastDays.add("Tuesday");
		
		dailyForecast.setForecastDay(forecastDays);
		dailyForecast.setHighs(highTemps);
		*/
		
		//BarChartForecastGenerator barChartGenerator = new BarChartForecastGenerator(chartTitle, dailyForecast);
		//barChartGenerator.generateForecastBarChart(barChartGenerator);
		
		//Call to an API. Parse JSON data into Java DailyForecast object. Make a bar chart.
		//BarChartForecastGenerator barChartGenerator = new BarChartForecastGenerator(chartTitle, dailyForecast2);
		//barChartGenerator.generateForecastBarChart(barChartGenerator);
		
		
		
		//apiCalls.retrieveStationID(latLon);
	
		//END DEMO PURPOSES-----------------------------------------------------
		
	
		return "homepage";
	}
	


	

}

