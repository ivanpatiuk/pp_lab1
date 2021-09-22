// lab1_7
//
package lab1_1;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User() {}
    public User(final String firstName,final String lastName, final int age, final String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.email=email;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString(){
        return (firstName+" "+lastName+", "+age+", "+email);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final User user = (User) obj;
        return this.firstName.equals(user.firstName) && this.lastName.equals(user.lastName)
                && this.age == user.age && this.email.equals(user.email);
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
