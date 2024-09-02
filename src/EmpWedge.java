import  java.util.Random;
public class EmpWedge {
    public static void main(String args[]){
        int IS_FULL_TIME = 1;
        int Wedge_Per_hr=20;

        int payable_wedge=0;
        int emp_hr;
        // Computation
        Random random = new Random();
        double empCheck = Math.floor(Math.random () * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            emp_hr=8;
        else
            emp_hr=4;

        payable_wedge=emp_hr*Wedge_Per_hr;
        System.out.println("emp hr is :- "+emp_hr);

        System.out.println("Paybale amount of Employee is :- "+payable_wedge);

    }
}
