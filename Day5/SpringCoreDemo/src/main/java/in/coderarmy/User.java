package in.coderarmy;

public class User {
    String name;
    int age;

    User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void detail(User a){
        System.out.println(a.name + " " + a.age);
    }
}
