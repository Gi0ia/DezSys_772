package tradearea.warehouse;

import tradearea.model.WarehouseData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}

	/**
	 * set the data
	 * @param inID the given ID
	 * @return the defined data
	 */
	public WarehouseData getData( String inID ) {
		WarehouseData data = new WarehouseData();
		data.setWarehouseID(inID);
		data.setWarehouseBundesland("Niederösterreich");
		data.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
		data.setWarehouseName("Klosterneuburg Bahnhof 2");
		this.generateProductData(data);
		//data.getProductDataAsJSON();

		return data;
		
	}

	/**
	 * generates Data
	 * @param data the warehouse object
	 */
	public void generateProductData(WarehouseData data) {
		List<Product> products = new ArrayList<>();

		// product 1: Rote Linsen
		Product product1 = new Product("00-100003", "Rote Linsen", "Lebensmittel", getRandomInt(100, 5000), "Packung 500g");

		// product 2: Kaffee
		Product product2 = new Product("00-754003", "Kaffee", "Getränk", getRandomInt(50, 2000), "Packung 250g");

		// product 3: Äpfel
		Product product3 = new Product("01-314790", "Äpfel", "Obst", getRandomInt(10, 100), "KG");

		// product 4: Shampoo
		Product product4 = new Product("02-800027", "Shampoo", "Körperpflege", getRandomInt(5, 100), "Flasche 250ml");

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		data.setProductData(products);
	}

}
