interface myinteerface{
    public void method1();
    public void method2();
}
class Main implements myinteerface{ 
public void method1(){
    System.out.println("implementation of method 1");
    
}
public void method2(){
    System.out.println("implementation of method 2");
}
    public static void main(String[] args) {
  myinteerface obj=new Main();
  obj.method1();
obj.method2();
        
    }
}