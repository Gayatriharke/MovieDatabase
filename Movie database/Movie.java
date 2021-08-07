package com.tast.project.MovieDatabase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private String actor_name;
	private long phone;
	private int year;
	private String director_name;

	public Movie() {
		this.actor_name = actor_name;
		this.phone = phone;
		this.year = year;
		this.director_name = director_name;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	@Override
	public String toString() {
		return "Movie [actor_name=" + actor_name + ", phone=" + phone + ", year=" + year + ", director_name="
				+ director_name + "]";
	}

 
}
