package com.qa.ims.persistence.domain;

public class Item {

	private Long id;
	private String itemName;
	private Double itemValue;

	public Item(String itemName, double itemValue) {
		this.setItemName(itemName);
		this.setItemValue(itemValue);
	}

	public Item(Long id, String itemName, double itemValue) {
		this.setId(id);
		this.setItemName(itemName);
		this.setItemValue(itemValue);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemValue() {
		return itemValue;
	}

	public void setItemValue(double itemValue) {
		this.itemValue = itemValue;
	}

	@Override
	public String toString() {
		return "id:" + id + " item name:" + itemName + " value:" + itemValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemValue == 0) ? 0 : itemValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (getItemName() == null) {
			if (other.getItemName() != null)
				return false;
		} else if (!getItemName().equals(other.getItemName()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemValue == 0) {
			if (other.itemValue != 0)
				return false;
		} else if (!(itemValue == other.itemValue))
			return false;
		return true;
	}
}