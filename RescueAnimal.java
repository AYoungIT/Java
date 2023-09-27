// Ashley Young
// 12/3/22
// This program creates the rescueanimal class

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() { // getting name
		return name;
	}


	public void setName(String name) { // setting name
		this.name = name;
	}


	public String getAnimalType() { // getting animal type
		return animalType;
	}


	public void setAnimalType(String animalType) { // setting animal type
		this.animalType = animalType;
	}


	public String getGender() { // getting gender
		return gender;
	}


	public void setGender(String gender) { // setting gender
		this.gender = gender;
	}


	public String getAge() { // getting age
		return age;
	}


	public void setAge(String age) { // setting age
		this.age = age;
	}


	public String getWeight() { // getting weight
		return weight;
	}


	public void setWeight(String weight) { // setting weight
		this.weight = weight;
	}


	public String getAcquisitionDate() { // getting start date
		return acquisitionDate;
	}


	public void setAcquisitionDate(String acquisitionDate) { // setting start date
		this.acquisitionDate = acquisitionDate;
	}


	public String getAcquisitionLocation() { // getting location
		return acquisitionCountry;
	}


	public void setAcquisitionLocation(String acquisitionCountry) { // setting location
		this.acquisitionCountry = acquisitionCountry;
	}


	public boolean getReserved() { // reserving
		return reserved;
	}


	public void setReserved(boolean reserved) { // setting reserved
		this.reserved = reserved;
	}


	public String getInServiceLocation() { // getting location
		return inServiceCountry;
	}


	public void setInServiceCountry(String inServiceCountry) { // getting country
		this.inServiceCountry = inServiceCountry;
	}




	public String getTrainingStatus() { // getting training status
		return trainingStatus;
	}


	public void setTrainingStatus(String trainingStatus) { // setting training status
		this.trainingStatus = trainingStatus;
	}
}
