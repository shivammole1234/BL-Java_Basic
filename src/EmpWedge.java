import  java.util.Random;
public class EmpWedge {
    public static void main(String args[]){
        int IS_FULL_TIME = 1;
        int Wedge_Per_hr=20;

        int payable_wedge=0;
        int emp_hr_per_day = 0;
        int month_day=20;
        // Computation
        Random random = new Random();
        int empCheck = random.nextInt(2);

        switch(empCheck){
            case 1:
                emp_hr_per_day=8;
                break;
            case 0:
                emp_hr_per_day=4;
                break;
        }

        int payble_amount_month=emp_hr_per_day*Wedge_Per_hr*month_day;

        payable_wedge= emp_hr_per_day *Wedge_Per_hr;
        System.out.println("emp hr is :- "+emp_hr_per_day);

        System.out.println("Paybale amount of Employee is :- "+payable_wedge);
        System.out.println("Paybale amount of Employee for a month is :- "+payble_amount_month);



    }
}
