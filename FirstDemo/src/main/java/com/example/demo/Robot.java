package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Chitti-ROBO")
public class Robot {
	
	  @Autowired
	  private Chip chip;
	
	   @Value("${robotManufactureName}")
	  private String robotManufactureName;
	   @Value("${robotPower}")
	  private String robotPower;
	  private boolean isActivated;
	  
	  public Robot() {
		   
	  }
	  
	  public void makeRobotActivate() {
		   String chipType= chip.getTypeOfChip();
		   
		   if(chipType.equals("green")) {
			    this.setActivated(true);
			    System.out.println("Activated!!!");
		   }
		   else{
			   System.out.println("Activate ON your own RISK!!!!!!");
		   }
	  }

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public String getRobotManufactureName() {
		return robotManufactureName;
	}

	public void setRobotManufactureName(String robotManufactureName) {
		this.robotManufactureName = robotManufactureName;
	}

	public String getRobotPower() {
		return robotPower;
	}

	public void setRobotPower(String robotPower) {
		this.robotPower = robotPower;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	@Override
	public String toString() {
		return "Robot [robotManufactureName=" + robotManufactureName + ", robotPower=" + robotPower + ", isActivated="
				+ isActivated + "]";
	}
	  
	  
	  
	  

}

