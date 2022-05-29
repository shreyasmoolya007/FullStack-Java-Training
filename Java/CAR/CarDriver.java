public class CarDriver {
    public static void main(String[] args) {
        Car c=new Car("Black",1000,"BMW",new Engine(250,1080));
        System.out.println(c.e.cc);
    }
}
