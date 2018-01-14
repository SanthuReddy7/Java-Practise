package com.ineter;

import com.carnivores.Carnivores;
import com.carnivores.Herbivores;

public class Restrictions implements Animals{
	
	private Carnivores carnivores;
	private Herbivores herbivores;

	@Override
	public void allow() {
		if(equals(carnivores))
		System.out.println("allow animals in");
		else{
	System.out.println("you are not allow in");
		}
	}

	@Override
	public void dontallow() {
		if(equals(herbivores))
			System.out.println("allow animals in ");
			else{
		System.out.println("you are not allow in");
			}
		
		
	}
	public static void main(String args[]){
		
		
	}

}
