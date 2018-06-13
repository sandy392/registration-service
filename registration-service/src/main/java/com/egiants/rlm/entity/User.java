package com.egiants.rlm.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

@DynamoDBTable(tableName = "User")
public class User {
	
	private String firstName;
	private String lastName;
	private String emailId;
	private String role;
	private String createdBy;
	private String lastModifiedBy;
	//private ZonedDateTime createdDate;
	//private ZonedDateTime lastModifiedDate;

	@DynamoDBAttribute(attributeName="firstName")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@DynamoDBAttribute(attributeName="lastName")
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@DynamoDBHashKey(attributeName="emailId")
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@DynamoDBAttribute(attributeName="role")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@DynamoDBAttribute(attributeName="createdBy")
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@DynamoDBAttribute(attributeName="lastModifiedBy")
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	/*public ZonedDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public ZonedDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", role=" + role
				+ ", createdBy=" + createdBy + ", lastModifiedBy=" + lastModifiedBy + ", createdDate=" + createdDate
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}*/
	

}
