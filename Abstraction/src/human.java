abstract class abstractdemo {  
    void harish() {
	System.out.println("Happy");}
    abstract void a();
}  
class human extends abstractdemo{
void a() {
	System.out.println("Being");
}
public static void main(String args[]){  
human obj = new human();  
obj.harish();
obj.a();
}  
}  
