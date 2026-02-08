public class mamal implements animal,birds{
    @Override
    public void eat() {
        System.out.println("mamal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("mamal is sleeping");
    }

    @Override
    public void feed() {
        System.out.println("mamal is feeding");
    }
    
}
