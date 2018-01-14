package com.javabrains.class3;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {

		
		if (args.length != 1) {
			System.out.println("Please enter one ip address");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIp.getCountryName());	
		System.out.println(geoIp.getCountryCode());
		}
	}
}