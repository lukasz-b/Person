package person;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Person {
    private String m_name;
    private int m_id;
    private String m_email;
    private int age;
}
