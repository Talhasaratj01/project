
package lab4;

class Task1 extends Thread {
    public void run() { 
        System.out.println("task one"); 
    }
    public static void main(String args[]) {
    	Task1 t1 = new Task1();  
    	Task1 t2 = new Task1();  
    	Task1 t3 = new Task1();  
        t1.start();  
        t2.start();  
        t3.start();  
    }
}

    

