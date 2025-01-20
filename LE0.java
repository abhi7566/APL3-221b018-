
 class car{
    int speed;
    String name;
    void setname(String name){
       
        this.name=name;
    }
    void setspeed(int speed){
        if(speed>=120){
            System.out.println("can't assign the speed");
        }
        else{
         this.speed=speed;   
        }
       
        
    }
    int getspeed(){
        return this.speed;
    }
    String getname(){
        return this.name;
    }
}
public class Main
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
		    System.out.println(args[0]+" X "+i+" = "+  Integer.parseInt(args[0])*i);
		}
		car m1=new car();
		m1.setname("bolero");
		m1.setspeed(80);
		System.out.println(m1.getname()+" "+m1.getspeed());
		
	}
}
