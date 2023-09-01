package dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class StudentDto {

    private Long id;

    @NotEmpty(message = "Name should not be empty")
    private String name;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email format")
    private String userName;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    
}
