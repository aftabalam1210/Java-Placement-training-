package Exception;
class MyThread extends  Thread{
    public void run(){
        try{
            for(int i= 0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
class MyThread1 implements Runnable{
    public void run(){
        try{
            for(int i= 0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}



public class threading {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();
        t2.start();
        
        t1.setName("1111111111111!!!!!!!!");
        t2.setName("22222!!!!!!!!");
       
        System.out.println(t1.getName());
        System.out.println(t1.isAlive());
    }
    
}
