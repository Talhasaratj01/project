package lab4;
class RollNumberThread extends Thread {
    @Override
    public void run() {
        String[] rollNumbers = {
            "2019-SE-092", "2019-SE-093", "2019-SE-094", "2019-SE-095", "2019-SE-096"
        };      
        System.out.println("Roll Numbers:");
        for (String rollNumber : rollNumbers) {
            System.out.println(rollNumber);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class DateOfBirthThread extends Thread {
    @Override
    public void run() {
        String[] datesOfBirth = {
            "05-April", "15-June", "25-August", "10-November", "20-December"
        };        
        System.out.println("\nDates of Birth:");
        for (String dob : datesOfBirth) {
            System.out.println(dob);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Student_info {
	public static void main(String[] args) {
		RollNumberThread rollNumberThread = new RollNumberThread();
        DateOfBirthThread dobThread = new DateOfBirthThread();
        rollNumberThread.start();
        dobThread.start();
        try {
            
            rollNumberThread.join();
            dobThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }  
        System.out.println("\nBoth tables printed concurrently!");
    }
	}

    

