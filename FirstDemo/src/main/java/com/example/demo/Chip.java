
package com.example.demo;


public class Chip {
	   
	
	
	   private String chipCompany;
	   private String typeOfChip;
	   private String manufactureDate;
	   
	   public Chip() {
		    
	   }

	public String getChipCompany() {
		return chipCompany;
	}

	public void setChipCompany(String chipCompany) {
		this.chipCompany = chipCompany;
	}

	public String getTypeOfChip() {
		return typeOfChip;
	}

	public void setTypeOfChip(String typeOfChip) {
		this.typeOfChip = typeOfChip;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Chip [chipCompany=" + chipCompany + ", typeOfChip=" + typeOfChip + ", manufactureDate="
				+ manufactureDate + "]";
	}
	   
	   
	   
	  
	   
}
