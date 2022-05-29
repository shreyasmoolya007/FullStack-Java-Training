package ARRAYLIST;

public class School_School {
    int id;
    String name;
    long no;

    public String toString()
    {
        return "Student id : "+this.id+"\nStudent name : "+this.name+"\nStudent no : "+this.no;
    }

    School_School()
    {

    }

    School_School(int id)
    {
        this.id=id;
    }

    School_School(int id,String name)
    {
        this(id);
        this.name=name;
    }

    School_School(int id, String name, long no) {
        this(id,name);
        this.no=no;
    }
}
