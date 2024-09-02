import  java.util.Random;
public class EmpWedge {
    public static void main(String args[]){
        int IS_FULL_TIME = 1;
        int Wedge_Per_hr=20;

        int payable_wedge=0;
        int emp_hr = 0;
        // Computation
        Random random = new Random();
        int empCheck = random.nextInt(2);

        switch(empCheck){
            case 1:
                emp_hr=8;
                break;
            case 0:
                emp_hr=4;
                break;
        }

        payable_wedge= emp_hr *Wedge_Per_hr;
        System.out.println("emp hr is :- "+emp_hr);

        System.out.println("Paybale amount of Employee is :- "+payable_wedge);

    }
}
