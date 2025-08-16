public class Main { //Student    replaced by Main
    String name;
    int age;

    public void getInfo(){
        System.out.println("the name of this Student is"+ this.name);

        System.out.println("the age of this Student is"+ this.age);
    }
}

public class OOPS{
    public static void main(String args[]){
        Main s1=new Main();
        s1.name="arman";
        s1.age="21";
        s1.getInfo();

        Main s2=new Main();
        s2.name="king";
        s2.age="20";
        s2.getInfo();
    }
}