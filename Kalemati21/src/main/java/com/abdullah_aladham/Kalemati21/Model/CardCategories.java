package com.abdullah_aladham.Kalemati21.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.abdullah_aladham.Kalemati21.Enums.CardCatEnum;

@Entity
public class CardCategories extends cards {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected
static Long Cat_id ;//category id
	@Column(nullable=false)
protected 	static CardCatEnum Categ_type;//type of category is chosen in frontend side and choices are put in the enum
	CardCategories(Long id,CardCatEnum type){
		this.id=id;
		this.Categ_type=type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long newId) {
		this.id=newId;
	}
	public CardCatEnum getType() {
		return Categ_type;
	}
	public void setType(CardCatEnum newType) {
		this.Categ_type=newType;
	}
}
