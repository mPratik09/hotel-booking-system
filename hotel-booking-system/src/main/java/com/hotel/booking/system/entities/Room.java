package com.hotel.booking.system.entities;

import java.time.LocalDateTime;

public class Room
{

	private int id;
	private String type;
	private int capacity;
	private boolean isAvailable;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
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
		return "Room [id=" + id + ", type=" + type + ", capacity=" + capacity + ", isAvailable=" + isAvailable
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", getId()=" + getId() + ", getType()="
				+ getType() + ", getCapacity()=" + getCapacity() + ", isAvailable()=" + isAvailable()
				+ ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
