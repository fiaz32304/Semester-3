public class date {
  private int day;
  private int month;
  private int year;

public date(int theMonth,int theDay,int theYear){
      month=checkmonth(theMonth);
      day=checkday(theDay);
      year=theYear;
  }
  private int checkmonth(int testMonth){
        if(testMonth>0 && testMonth<=12){
            return testMonth;
        }
        else{
            System.out.println("Invalid month"+testMonth+"set to 1");
            return 1;
        }
  }
  
  private int checkday(int testday){
        int daysofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(testday>0 && testday<=daysofmonth[month]){
            return testday;

        }else if(month==2 && testday==29 && (year%4==0 && (year%100!=0 || year%400==0))){
            return testday;
        }else{  
            System.out.println("Invalid day"+testday+"set to 1");
            return 1;
        }
    }
        public int getday(){
            return day;
        } 
        public int getmonth(){
            return month;
        }public int getyear(){
            return year;
        }
        public void display(){
            System.out.println("day::"+day+"month::"+month+"year");
        }
}
