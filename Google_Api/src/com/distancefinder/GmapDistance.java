package com.distancefinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class GmapDistance {
  public static void main(String[] args) throws IOException {
	  // Reference - https://developers.google.com/maps/documentation/distancematrix/
	  //URL url = new URL("https://www.zipcodeapi.com/rest/huEnWSWIDrUJDE4R9DY0OOxEklbMMkOJGEewBE9Y37mR9wnq6xf753APXltotD24");
	  
		  ///distance.<format>/<zip_code1>/<zip_code2>/<units>
	  URL url= new URL("http://maps.googleapis.com/maps/api/distancematrix/json?origins=$postcode2&destinations=$postcode1&mode=driving&language=en-EN&sensor=false");
	  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      String line, outputString = "";
      BufferedReader reader = new BufferedReader(
      new InputStreamReader(conn.getInputStream()));
      while ((line = reader.readLine()) != null) {
          outputString += line;
      }
     // System.out.println(outputString);
     DistancePojo capRes = new Gson().fromJson(outputString, DistancePojo.class);
     System.out.println(capRes);
  }
}

//http://maps.googleapis.com/maps/api/distancematrix/json?origins=$postcode2&destinations=$postcode1&mode=driving&language=en-EN&sensor=false