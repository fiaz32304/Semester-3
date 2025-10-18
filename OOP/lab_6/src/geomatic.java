public class geomatic {
    private String color;
    private boolean filled;
    private java.util.Date datecreated;

    geomatic(){

    }
    geomatic(String color,boolean filled){
        this.color=color;
        this.filled=filled;

    }
    public void set_color(String color){
        this.color=color;

    }public String get_color(){
        return color;

    }public void set_filled(boolean filled){
        this.filled=filled;

    }public boolean get_filled(){
        return filled;

    }public java.util.Date getdate_created(){
        
    }
}
