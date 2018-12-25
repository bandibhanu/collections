package collections;

import java.util.HashSet;

public class Laptop {
	private String company;
	private double model;
	private String operatingSystem;
	private String processor;
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(model);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(model) != Double
				.doubleToLongBits(other.model))
			return false;
		return true;
	}
	public Laptop(String company, int model, String operatingSystem,
			String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}



}
