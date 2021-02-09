package org.jk.configclient.beans;

public class PropertyValueAccess {
	
	private String name;
	private String description;
	
	public PropertyValueAccess(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "PropertyValueAccess [name=" + name + ", description=" + description + "]";
	}
	
}
