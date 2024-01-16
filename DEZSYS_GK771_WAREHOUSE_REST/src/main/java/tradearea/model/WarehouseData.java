package tradearea.model;

import tradearea.warehouse.Product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseData {
	
	private String warehouseID;
	private String warehouseName;
	private String timestamp;

	private WarehouseData data;

	// list
	private List<Product> productData;
	private String warehouseBundesland;

	/**
	 * Constructor
	 */
	public WarehouseData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.productData = new ArrayList<>();

	}

	public List<Product> getProductData() {
		return productData;
	}

	/*public String getProductDataAsJSON() {
		StringBuilder jsonBuilder = new StringBuilder();

		jsonBuilder.append("["); // Anfang des JSON-Arrays
		for (Product product : productData) {
			jsonBuilder.append("{"); // Anfang des JSON-Objekts

			jsonBuilder.append("\"productName\":\"").append(product.getProductName()).append("\",");
			jsonBuilder.append("\"productCategory\":\"").append(product.getProductCategory()).append("\"");

			jsonBuilder.append("},"); // Ende des JSON-Objekts
		}

		if (!productData.isEmpty()) {
			// Entfernen Sie das letzte Komma, wenn die Liste nicht leer ist
			jsonBuilder.deleteCharAt(jsonBuilder.length() - 1);
		}

		jsonBuilder.append("]"); // Ende des JSON-Arrays

		return jsonBuilder.toString();
	}*/


	public void setProductData(List<Product> productData) {
		this.productData = productData;
	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setWarehouseBundesland(String warehouseBundesland) {
		this.warehouseBundesland = warehouseBundesland;
	}

	public String getWarehouseBundesland() {return warehouseBundesland;}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID, timestamp );
		return info;
	}
}
