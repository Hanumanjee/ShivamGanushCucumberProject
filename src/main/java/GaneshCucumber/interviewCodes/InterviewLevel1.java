package GaneshCucumber.interviewCodes;

public class InterviewLevel1 {
    public static void main(String[] args) {
        String str="CucumberTest";
    }
    public static String reverseString(String str){
        String result="";
        for(int i=str.length()-1; i>=0; i--){
           result+=str.charAt(i);

        }
        return result;
    }
}
