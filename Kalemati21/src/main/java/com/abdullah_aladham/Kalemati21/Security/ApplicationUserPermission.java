package com.abdullah_aladham.Kalemati21.Security;

public enum ApplicationUserPermission {
REMOVE_CUSTOMER("customer:delete"),
SHOW_CUSTOMER("customer:show"),
ADD_CUSTOMER("customer:add"),
EDIT_CUSTOMER("customer:edit"),
ADD_CHILD("child:add"),
SHOW_CHILD("child:read"),
DELETE_CHILD("child:delete"),
ADD_CARD("card:add"),
SHOW_CARD("card:show"),
EDIT_CARD("card:edit"),
DELETE_CARD("card:delete"),
ADD_ADMIN("admin:add");
	
private final String permission;
ApplicationUserPermission(String permission){
	this.permission=permission;
}
public String getPermission() {
	return permission;
}
}
