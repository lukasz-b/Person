package person;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Person {
    private String m_name;
    private int m_id;
    private String m_email;
    /*
    public Person()
    {
        this( "Default", 0, "email@dot.com" );
    }

    public Person( String name, int id, String email )
    {
        this.m_name = name;
        this.m_id = id;
        this.m_email = email;
    }        */
}
