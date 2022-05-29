package TOSTRING;

class Test_1 {                       //toString method
    String name;
    int usn;
    String branch;
    int age;
    Test_1(String name, int usn, String branch, int age)
    {
        this.name=name;
        this.usn=usn;
        this.branch=branch;
        this.age=age;
    }
    public String toString()
    {
        return "name:"+name+"\nusn:"+usn+"\nbranch:"+branch+"\nage:"+age;
    }

    public static void main(String[] args) {
        Test_1 t=new Test_1("Shinichi",53,"ise",21);
        System.out.println(t);

    }
}