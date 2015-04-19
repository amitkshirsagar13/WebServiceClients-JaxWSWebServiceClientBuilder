package org.webservices.testclients;

import java.net.MalformedURLException;
import java.net.URL;

import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

public class JaxWSWebServiceClientTest {

	public static void main(String[] args) throws MalformedURLException {

		
		Weather weatherService = new Weather(
				new URL(
						"http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL"));		
		WeatherSoap weatherSoap = weatherService.getWeatherSoap();
		
		/**
		 * Remove Axis2 Library Before Testing for working...
		 */
		
		WeatherReturn weatherReturn = weatherSoap.getCityWeatherByZIP("38125");
		
		System.out.println(weatherReturn.getDescription());
	}

}
