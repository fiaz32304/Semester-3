public class person{
    protected String name;
    protected String id;
    protected int phone;

    person(){
        name="NaginaNazar";
        id="FA24-BSE-127";
        phone=12345;
    }
    person(String n, String id,int p){
        name=n;
        this.id=id;
        phone=p;
    }public void set_name(String n){
        name=n;
    }
    public String get_name(){
        return name;
    }
    public void set_id(String id){
        this.id=id;

    }public String get_id(){
        return id;

    }public void set_phone(int p){
        phone=p;

    }public int get_phone(){
        return phone;

    }public void show_display(){
        System.out.println("name is::"+name);
        System.out.println("id is::"+id);
        System.out.println("name is:;"+phone);

    }

    }