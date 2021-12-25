package main;

import java.util.ArrayList;

import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Fuel;
import vehicles.Taxable;
import vehicles.Vehicles;
import buildings.Buildings;
import buildings.Home;
import buildings.Hotel;

public class Main {

	public static void main(String[] args) {
		ArrayList<Taxable> t = new ArrayList<Taxable>();
		ArrayList<Vehicles> v = new ArrayList<Vehicles>();
		ArrayList<Buildings> b = new ArrayList<Buildings>();
		
		Home home1 = new Home(400, 300, 3);
		Hotel hotel1 = new Hotel(500, 1000, 45, 2, 3);
		Bicycle bc1 = new Bicycle(2, 45, 2);
		Car c1 = new Car(4, 600, 6, new Engine(Fuel.GASOLINE, 45, 200));
		
		t.add(hotel1);
		t.add(home1);
		t.add(c1);
		
		v.add(c1);
		v.add(bc1);
		
		b.add(hotel1);
		b.add(home1);
		
		for (Buildings bld : b) {
			System.out.println(bld);
		}
		
		for (Vehicles vh : v) {
			System.out.println(vh);
		}
		
		for (Taxable tx : t) {
			System.out.println(tx.getTaxesInformation());
		}
	}
}
