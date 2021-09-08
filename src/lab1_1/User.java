// lab1_7
//
package lab1_1;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;

    @Override
    public String toString(){
        return (firstName+" "+lastName+", "+age+", "+email);
    }
    public User(String firstName,String lastName, int age, String email){
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
