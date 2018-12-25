package collections;

public class CarCompare implements Comparable<CarCompare>{
private String name;
private int number;
private int year;
private String model;
public CarCompare(String name, int number, int year, String model) {
	super();
	this.name = name;
	this.number = number;
	this.year = year;
	this.model = model;
}
@Override
public String toString() {
	return "CarCompare [name=" + name + ", number=" + number + ", year=" + year
			+ ", model=" + model + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + number;
	result = prime * result + year;
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
	CarCompare other = (CarCompare) obj;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (number != other.number)
		return false;
	if (year != other.year)
		return false;
	return true;
}
@Override
public int compareTo(CarCompare object) {
	// TODO Auto-generated method stub
	if( object.number==this.number)
		return 0;
	else if(object.number>this.number)
		return -1;
	else
		return 1;
}

	

}
