package com.traini8.TrainingCenterRegistry.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;


@Entity
@Table(name="training_centers")
public class TrainingCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 40)
	@Size(max = 40, message = "Center name must be less that 40 characters")
	private String centerName;
	
	@Column(nullable = false, unique = true, length = 12)
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$" , message = "Center code must be exactly 12 alphanumeric characters")
	private String centerCode;
	
	@Embedded
	private Address address;
	
	private Integer studentCapacity;
	
	@ElementCollection
	private List<String> coursesOffered;
	
	@Column(nullable = false, updatable = false)
	private Instant createdOn;
	
	@Email(message="Invalid Email format")
	private String contactEmail;
	
	@Pattern(regexp = "^[0-9]{10}$" , message="phone number must be exactly 10 digits")
	private String contactPhone;
	
	protected void onCreate() {
			this.createdOn = Instant.now();	
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(Integer studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	

}
