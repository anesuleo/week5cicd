package ie.atu.week5cicd;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message="This value can not be blank")
    private String name;
    @NotBlank(message="Title cannot be blank")
    private String title;
    @Min(value = 1, message="Employee ID cannot be blank")
    private int employeeId;
    @Min(value = 16, message="Cannot be younger than 16")
    private int age;
    @Email(message = "Enter valid email address")
    private String email;
    @NotBlank(message = "Position field cannot be blank")
    private String position;
    @NotBlank(message = "Department field cannot be blank")
    private String department;
}
