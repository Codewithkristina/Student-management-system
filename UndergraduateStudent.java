public class UndergraduateStudent extends Student {
    private int creditHours;
    private final int MAX_CREDIT = 18;

    UndergraduateStudent(){
        creditHours = 0;
        
    }
    UndergraduateStudent (int creditHours){
        this.creditHours = creditHours;

    }
    public int getCreditHours (){
        return creditHours;
    } 
    public void setcreditHours (int creditHours){
        this.creditHours = creditHours;

    }
    @Override
    public void enrollCourse (String courseName) {
        if (creditHours > MAX_CREDIT) {
            System.out.println(getName() + "cannot enroll in the class");
        } else {
            System.out.println(getName() + "can enroll");
        }
        }

        @Override
        public void calculateStatus() {
            if (getgpa() >= 2.0) {
                System.out.println("Good standing");

            } else {
                System.out.println("Probation");
            }
        }

        }
    
    
    

