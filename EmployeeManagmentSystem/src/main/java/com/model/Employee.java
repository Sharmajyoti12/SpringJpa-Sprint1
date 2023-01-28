package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	@Null(message = "employee name can't empty")
	private String employeeName;
	@Id
	private int employeeId;
	private int salary;
	private String address;
	@Email(message = "please enter email  in this format ,abc34@email.com")
	private String email;
	@Pattern(regexp = "^\\d{10}$", message = "Invaild Mobile Number!")
	private int contactNumber;

}
