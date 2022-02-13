package com.abdullah_aladham.Kalemati21.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardCategories extends cards {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected
static Long Cat_id ;//category id
	@Column(nullable=false)
protected 	static String type;
	CardCategories(Long id,String type){
		this.id=id;
		this.type=type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long newId) {
		this.id=newId;
	}
	public String getType() {
		return type;
	}
	public void setType(String newType) {
		this.type=newType;
	}
}
