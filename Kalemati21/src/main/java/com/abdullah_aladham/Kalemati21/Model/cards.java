package com.abdullah_aladham.Kalemati21.Model;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
@Entity
public class cards {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long id ;
	@Column(nullable=false)
	protected String name;
	@Column(nullable=false)
	protected String imagesrc;
	@Column(nullable=false)
	protected  String Cardcode;
//	private CardCategories categories;
	//@Column 
	//@OneToOne
	//@ManyToOne
	//@OneToOne(fetch=FetchType.LAZY)
	
//	@JoinColumn(foreignKey = @ForeignKey(name = "Category_Id"))
//	protected Long Category_Id;
/*public cards(Long id ,String name,String src, String src2 ,String CardCode){
	
	this.id=id;
	this.name=name;
	this.imagesrc=src;
	this.imagesrc2=src2;
	this.Cardcode=CardCode;
}*/
	public cards(Long id, String name, String imagesrc, String cardcode) {
		this.id = id;
		this.name = name;
		this.imagesrc = imagesrc;
		Cardcode = cardcode;
	}
public Long getId() {
return id;

}

public void setId(Long id) {
this.id=id;
}
public String getName() {
return name;

}
public void Setname(String newname) {
this.name=newname;
}
public String getsrc() {
return imagesrc ;
}
public void setsrc(String newsrc) {
	this.imagesrc=newsrc;
}



public String getCode() {
	 return Cardcode;
}
 public void SetCode(String newCode) {
	 this.Cardcode=newCode;
 }

@Override
public String toString() {
return "cards {}"+"id="+id +", name="+name+" , first image"+imagesrc +","+", CardCode"+Cardcode;
}
}
