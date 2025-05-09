//package dsaProblems.ibmInterviewQuestion;
//
//import java.util.Date;
//
///*
//Q3. Create a Patient Class with a Parameterised Constructor to
//load the following data into each instance:
//1. patientName
//2. patientAge
//3. doa (dateOfArrival)
//4. disease
//Your class should have a method called patientDetails()
//which when called
//should display all the attributes.
//Note:
//The diseases should be any one from :
//a) Malaria
//b) Jaundice
//c) Influenza
//d) SARS-COVID-19
//Create an Information CLass which has the parameters :
//blockNo, floorNo, roomNo, bedNo.
//Payment Class : admFees, regFees, balAmt;
//When you call the patientDetails() method,
//these should be displayed as well. Note, you cannot use inheritance (extends keyword).
// */
//public class Patient {
//
//    private  Payment payment;
//    private  String patientName;
//    private int patientAge;
//    private int date;
//    private String disease;
//    private Information info;
//
//    public Patient(String patientName, int patientAge, int date, String disease, Information info, Payment payment) {
//        this.patientName = patientName;
//        this.patientAge = patientAge;
//        this.date = date;
//        this.disease = disease;
//        this.info = info;
//        this.payment = payment;
//
//    }
//
//    void patientDetails() {
//        System.out.println("Name : " + this.patientName);
//        System.out.println("Patient Age : " + this.patientAge);
//        System.out.println("Patient Disease " + this.disease);
//        System.out.println("Date Of Arrival " + this.date);
//        System.out.println("Block No "+ this.info.blockNo);
//        System.out.println("Bed No " + this.info.bedNo);
//        System.out.println("Floor No " + this.info.floorNo);
//        System.out.println("Room No " + this.info.roomNo);
//        System.out.println("Admission Fees" + this.payment.admFees);
//        System.out.println("Reg Fees " + this.payment.regFees);
//        System.out.println("Bed No "+ this.payment.bedNo);
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//
//        Patient pat = new Patient("Syed Musaib",21,8,"Malaria",);
//        pat.patientDetails();
//    }
//}