public class OnlineStudent {

    private String name;
    private static int studentCounter;
    private int id;
    //When you are calling static inside methods first you need to call class.StaticVariable

    public int getStudentCounter(){
        return studentCounter;
    }
    public void setStudentCounter(int counter){
        studentCounter = counter;
    }
    public int getStudentId(){
        return id;
    }
    public void setStudentId(int studentId){
        this.id = studentId;
    }
    public String getStudentName(){
        return this.name;
    }
    public void setStudentName(String studentName){
        this.name = studentName;
    }

    public OnlineStudent(String name,int id){
        this.name = name;
        this.id = id;
        OnlineStudent.studentCounter++;
    }
    public void exit(){
        OnlineStudent.studentCounter--;
    }

    public static int howManyStudent(){
        return OnlineStudent.studentCounter;
    }

}
