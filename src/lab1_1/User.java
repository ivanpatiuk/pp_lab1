// lab1_7
//
package lab1_1;

public class User {

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    private String firstName;

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    private String lastName;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    private int age;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    private String email;

    @Override
    public String toString(){
        return (firstName+" "+lastName+", "+age+", "+email);
    }
    public User(final String firstName,final String lastName, final int age, final String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.email=email;
    }
    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final User user = (User) obj;
        if (this.firstName == user.firstName && this.lastName == user.lastName
                && this.age == user.age && this.email == user.email)
            return true;
        else return false;
    }
    @Override
    public int hashCode() {
        return age*firstName.length()*lastName.length()*email.hashCode();
    }

    public static void main(String[] args) {
        User user = new User("Ivan", "Pupkin",20,"ivan.pupkin@lpnu.ua");
        System.out.println(user.hashCode());
        System.out.println(user.toString());
    }
}
