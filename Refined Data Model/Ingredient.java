package brew_day;

import java.util.Date;

public class Ingredient {
	private int id;
	private String name;
	private String type;
	private double mount;
	private Date lastPurchasedDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Date getLastPurchasedDate() {
		return lastPurchasedDate;
	}
	
	public void setLastPurchasedDate(Date lastPurchasedDate) {
		this.lastPurchasedDate = lastPurchasedDate;
	}
	
	public double getMount() {
		return mount;
	}
	
	public void setMount(double mount) {
		this.mount = mount;
	}
}
