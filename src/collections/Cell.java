package collections;

public class Cell {

	private String company;
	private int model;
	private String description;
	private int operatingSystem;
	private int price;
	public Cell(String company, int model, String description,int operatingSystem, int price) {
		super();
		this.company = company;
		this.model =  model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + model;
		result = prime * result + operatingSystem;
		result = prime * result + price;
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
		Cell other = (Cell) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (model != other.model)
			return false;
		if (operatingSystem != other.operatingSystem)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cell [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSystem="
				+ operatingSystem + ", price=" + price + "]";
	}
}
