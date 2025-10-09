public class student {
    private String name;
    private librarycard librarycard;

    student(String name,librarycard linrarycard){
        this.name=name;
        this.librarycard=librarycard;
        
    }
    public void displayinfo(){
        System.out.println("student::"+name);
        System.out.println("library card number::"+librarycard.get_cardnumber());

    }


}
