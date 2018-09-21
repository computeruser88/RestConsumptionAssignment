package com.revature.beans;

import java.sql.Date;


public class Bear {
	
	private Long id;
	

	private String name;
	

	private String favoriteCave;

	private Date birthday;
	
	
	private int isHungry;
	
	private int isHibernating;

	/**
	 * 
	 */
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Bear(Long id, String name, String favoriteCave, Date birthday, int isHungry, int isHibernating) {
		super();
		this.id = id;
		this.name = name;
		this.favoriteCave = favoriteCave;
		this.birthday = birthday;
		this.isHungry = isHungry;
		this.isHibernating = isHibernating;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteCave() {
		return favoriteCave;
	}

	public void setFavoriteCave(String favoriteCave) {
		this.favoriteCave = favoriteCave;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getIsHungry() {
		return isHungry;
	}

	public void setIsHungry(int isHungry) {
		this.isHungry = isHungry;
	}

	public int getIsHibernating() {
		return isHibernating;
	}

	public void setIsHibernating(int isHibernating) {
		this.isHibernating = isHibernating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((favoriteCave == null) ? 0 : favoriteCave.hashCode());
		result = prime * result + isHibernating;
		result = prime * result + isHungry;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Bear other = (Bear) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (favoriteCave == null) {
			if (other.favoriteCave != null)
				return false;
		} else if (!favoriteCave.equals(other.favoriteCave))
			return false;
		if (isHibernating != other.isHibernating)
			return false;
		if (isHungry != other.isHungry)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bear [id=" + id + ", name=" + name + ", favoriteCave=" + favoriteCave + ", birthday=" + birthday
				+ ", isHungry=" + isHungry + ", isHibernating=" + isHibernating + "]";
	}
	
	
	
	
}