public class App {
    public static void main(String[] args) throws Exception {
        tv t1=new tv();
        t1.turn_on();
        t1.set_channel(45);
        t1.set_volume(3);

        tv t2=new tv();
        t2.turn_on();
        t2.set_channel(34);
        t2.set_volume(23);
        t2.volume_down();
        t1.channel_up();


    }
}
