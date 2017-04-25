package linhtran;

/**
 * Created by linhtran on 24/04/2017.
 */
public class Person {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void myInit()
    {
      //  System.out.println("method my init bean inited");
    }

    public void myDestroy()
    {
      //  System.out.println("method my destroy bean destroyed");
    }
}
