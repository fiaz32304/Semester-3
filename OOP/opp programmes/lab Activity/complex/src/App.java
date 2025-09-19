
public class App {

    public static void main(String[] args) throws Exception {
        complex c1 = new complex(11, 2.3);
        complex c2 = new complex(9, 2.5);
        complex c3 = new complex();
        c3 = c1.add(c2);
        c3.show();

    }
}
