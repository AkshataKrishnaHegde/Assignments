import java.util.Scanner;
public class HospitalManagement {
    public static void main(String[] args) {
        System.out.println("----------Welcome------------");
        System.out.println("Take care of your body it's only place you have to live in");
        System.out.println("Enter 1 to -> Book an appointment");
        System.out.println("Enter 2 to ->Contact Us");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s==2){
            Contact c = new Contact();
            c.contactUs();
        } else if (s==1) {
            System.out.println("Enter you Name:");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.next();
            System.out.println("Enter your Contact number");
            Scanner sc2 = new Scanner(System.in);
            String contactNum = sc2.next();
            System.out.println("Enter Your Address");
            Scanner sc3 = new Scanner(System.in);
            String add = sc3.next();
            System.out.println("Enter your age");
            Scanner sc4 = new Scanner(System.in);
            int age = sc4.nextInt();
            System.out.println("Enter your Gender");
            Scanner sc5 = new Scanner(System.in);
            String gen = sc5.next();
            Hospital h = new Hospital(name,contactNum,add,age,gen);
            h.appointment();
        }
        }
    }
class Hospital{
    java.util.Date dt1 = new java.util.Date();

    long time = dt1.getTime();
    java.sql.Date dt2= new java.sql.Date(time);

    private String patientName;
    private String patientContactNo;
    private String patientAddress;
    private int patientAge;
    private String patientGender;

    public Hospital(String patientName, String patientContactNo,String patientAddress,int patientAge,String patientGender) {
        this.patientName = patientName;
        this.patientContactNo=patientContactNo;
        this.patientAddress=patientAddress;
        this.patientAge=patientAge;
        this.patientGender=patientGender;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientContactNo() {
        return patientContactNo;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public void setPatientContactNo(String patientContactNo) {
        this.patientContactNo = patientContactNo;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }
    public void appointment(){
        System.out.println("Select Area speciality in which you want to book an appointment");
        System.out.println("1) Accident Care and Emergency Care");
        System.out.println("2)Dermatology");
        System.out.println("3)Cardiology");
        System.out.println("4)Obstetrics and Gynaecology");
        System.out.println("5)Paediatric and Child care");
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        if(n==1){
            System.out.println("Select doctor");
            System.out.println("Doctors Available: ");
            System.out.println("1) Dr.Krishna Hegde");
            System.out.println("2)Dr.Sanjay Kamat");
            System.out.println("3)Dr.Raksha Bhat");
            System.out.println("4)Dr.Shashikala Singh");
            Scanner sc1 = new Scanner(System.in);
            int d = sc.nextInt();
            if(d==1){
                System.out.println("You got an appointment with Dr.Krishna Hegde on " + dt2);
            }
            else if(d==2){
                System.out.println("You got an appointment with Dr.Sanjay Kamat on " + dt2);
            }
            else if(d==3){
                System.out.println("You got an appointment with Dr.Raksha Bhat on " + dt2);
            }
            else if(d==4){
                System.out.println("You got an appointment with Dr.Shashikala Singh on " + dt2);
            }
            else{
                System.out.println("Sorry, Something went wrong");
            }
        }
        else if(n==2){
            System.out.println("Select doctor");
            System.out.println("Doctors Available: ");
            System.out.println("1) Dr.Sindhu Hegde");
            System.out.println("2)Dr.Parameshwar");
            System.out.println("3)Dr.Anuradha");
            System.out.println("4)Dr.Aravind Pai");
            Scanner sc1 = new Scanner(System.in);
            int d = sc.nextInt();
            if(d==1){
                System.out.println("You got an appointment with Dr.Sindhu Hegde on " + dt2);
            }
            else if(d==2){
                System.out.println("You got an appointment with Dr.Parameshwar on " + dt2);
            }
            else if(d==3){
                System.out.println("You got an appointment with Dr.Anuradha on " + dt2);
            }
            else if(d==4){
                System.out.println("You got an appointment with Dr.Aravind Pai Singh on " + dt2);
            }
            else{
                System.out.println("Sorry, Something went wrong");
            }
        }
        else if(n==3){
            System.out.println("Select doctor");
            System.out.println("Doctors Available: ");
            System.out.println("1) Dr.Gajanan");
            System.out.println("2)Dr.Muskan");
            System.out.println("3)Dr.Shivashankar Yaji");
            System.out.println("4)Dr.Lalita Shastri");
            Scanner sc1 = new Scanner(System.in);
            int d = sc.nextInt();
            if(d==1){
                System.out.println("You got an appointment with Dr.Gajanan on " + dt2);
            }
            else if(d==2){
                System.out.println("You got an appointment with Dr.Muskan on " + dt2);
            }
            else if(d==3){
                System.out.println("You got an appointment with Dr.Shivashankar Yaji on " + dt2);
            }
            else if(d==4){
                System.out.println("You got an appointment with Dr.Laita Shastri on " + dt2);
            }
            else{
                System.out.println("Sorry, Something went wrong");
            }
        }
        else if(n==4){
            System.out.println("Select doctor");
            System.out.println("Doctors Available: ");
            System.out.println("1) Dr.Anjaneya ");
            System.out.println("2)Dr.Ragini");
            System.out.println("3)Dr.Laxmi Hebbar");
            Scanner sc1 = new Scanner(System.in);
            int d = sc.nextInt();
            if(d==1){
                System.out.println("You got an appointment with Dr.Anjaneya on " + dt2);
            }
            else if(d==2){
                System.out.println("You got an appointment with Dr.Ragini on " + dt2);
            }
            else if(d==3){
                System.out.println("You got an appointment with Dr.Laxmi Hebbar on " + dt2);
            }
            else{
                System.out.println("Sorry, Something went wrong");
            }
        }
        else if(n==5){
            System.out.println("Select doctor");
            System.out.println("Doctors Available: ");
            System.out.println("1) Dr.Neeta Mandloi");
            System.out.println("2)Dr.Sangeeta Gaonkar");
            System.out.println("3)Dr.ShashiBhushan");
            System.out.println("4)Dr.Fatima");
            Scanner sc1 = new Scanner(System.in);
            int d = sc.nextInt();
            if(d==1){
                System.out.println("You got an appointment with Dr.Neeta Mandloi on " + dt2);
            }
            else if(d==2){
                System.out.println("You got an appointment with Dr.Sangeeta Gaonkar on " + dt2);
            }
            else if(d==3){
                System.out.println("You got an appointment with Dr.Shashibhushan on " + dt2);
            }
            else if(d==4){
                System.out.println("You got an appointment with Dr.Fatima Singh on " + dt2);
            }
            else{
                System.out.println("Sorry, Something went wrong");
            }
        }

        }

    }
    class Contact {
        public void contactUs() {
            System.out.println("Our Contact Number: 08387234241");
            System.out.println("Email id: healthcare@gmail.com");

        }
    }