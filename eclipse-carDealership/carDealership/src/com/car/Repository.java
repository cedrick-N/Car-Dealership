package com.car;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	private static List<Car> carList= new ArrayList<Car>();
	private static List<Sale> saleList= new ArrayList<Sale>();
	
	
	public static List<Car> getCarList() {
		return carList;
	}

	public static List<Sale> getSaleList() {
		return saleList;
	}

	public static void setSaleList(List<Sale> saleList) {
		Repository.saleList = saleList;
	}

	public static void setCarList(List<Car> list) {
		carList = list;
	}

}
