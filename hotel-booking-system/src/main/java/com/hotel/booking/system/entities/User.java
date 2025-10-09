package com.hotel.booking.system.entities;

import java.time.LocalDateTime;

public class User
{
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String reEnterPassword;
	private String contactNum;
	private boolean enabled;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getReEnterPassword()
	{
		return reEnterPassword;
	}

	public void setReEnterPassword(String reEnterPassword)
	{
		this.reEnterPassword = reEnterPassword;
	}

	public String getContactNum()
	{
		return contactNum;
	}

	public void setContactNum(String contactNum)
	{
		this.contactNum = contactNum;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public LocalDateTime getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt)
	{
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt()
	{
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt)
	{
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", reEnterPassword=" + reEnterPassword + ", contactNum=" + contactNum
				+ ", enabled=" + enabled + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
