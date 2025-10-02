public class App {
    public static void main(String[] args) throws Exception {
      book [] books=new book[3];
      books [0]= new book("java basic","james gosling");
      books [1]= new book("affective java","joshua baloch");
      books [2]= new book("clean code","robert martin");
        for(book b: books){
            b.display();
        }
    }
}
