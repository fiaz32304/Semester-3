public class App {
    public static void main(String[] args) throws Exception {
        avgmarks [ ] student={new avgmarks("ayesha",85),
                            new avgmarks("sami",90),
                            new avgmarks("aftab",78),
                            new avgmarks("hassnain",88),
                            new avgmarks("Fiaz",95),
                            new avgmarks("ahmad",45)


        };
        double total=0;
    for(avgmarks s1: student){
        total=total+s1.marks;

    }
    double avg=total/6;
    System.out.println("the avg marks is::"+avg);
    }
}
