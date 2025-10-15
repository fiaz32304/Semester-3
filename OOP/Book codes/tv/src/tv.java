public class tv{
    public int channel;
    public int volume;
    public boolean on;

    tv(){
        channel=1;
        volume=1;
        on=false;
    }public void turn_on(){
        on=true;
    }public void turn_off(){
        on=false;
    }public void set_channel(int new_channel){
        if(on && new_channel>=1 &&new_channel<=120){
            channel=new_channel;
        }
         System.out.println("volum is"+channel);
             
    }public void set_volume(int new_volume){
        if(on && new_volume>=1 && new_volume<=30){
              volume=new_volume;
        System.out.println("volum is"+volume);
        }
      
       
    }public void channel_up(){
        if(on && channel<120){
        channel=channel+1;}
        System.out.println("channel is: "+channel);
    }public void channel_down(){
        if(on && channel>1){
            channel=channel-1;

        }
           System.out.println("channel is: "+channel);
         
    }public void volume_up(){
        if(on && volume<30){
               volume=volume+1;
        }
         System.out.println("volum is"+volume);
      
    }
    public void volume_down(){
        if(on && volume>1){
             volume=volume-1; 
        }
         System.out.println("volum is"+volume);
       
    }

}