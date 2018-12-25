package collections;

public class School {
private String name;
private String city;
private String school;
private String district;
private int greatSchoolRanking;


public School(String name, String city, String school, String district,int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.school = school;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((district == null) ? 0 : district.hashCode());
	result = prime * result + greatSchoolRanking;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((school == null) ? 0 : school.hashCode());
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
	School other = (School) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (district == null) {
		if (other.district != null)
			return false;
	} else if (!district.equals(other.district))
		return false;
	if (greatSchoolRanking != other.greatSchoolRanking)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (school == null) {
		if (other.school != null)
			return false;
	} else if (!school.equals(other.school))
		return false;
	return true;
}
@Override
public String toString() {
	return "School [name=" + name + ", city=" + city + ", school=" + school
			+ ", district=" + district + ", greatSchoolRanking="
			+ greatSchoolRanking + "]";
}
}
