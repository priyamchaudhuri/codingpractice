import java.util.ArrayList;
import java.util.List;

public class StudentMaxAverage {
    public static void main(String[] args) {
        String[] students={"Ram","10","20","12","Shyam","4","32","5"};
        getStudentList(students);
    }

    public static void getStudentList(String[] students){
        int avgScore;
        int maxAvgScore=Integer.MIN_VALUE;
        List<String> names=new ArrayList<>();
        for(int i=0;i<students.length;i=i+4){
            avgScore=(Integer.parseInt(students[i+1])+Integer.parseInt(students[i+2])+Integer.parseInt(students[i+3]))/3;

            if (avgScore>maxAvgScore){
                    maxAvgScore=avgScore;
                    names.clear();
                    names.add(students[i]);
            }else if (avgScore==maxAvgScore){
                names.add(students[i]);
            }
        }
        for(int i=0;i<names.size();i++){
            System.out.print(names.get(i)+ " ");
        }
        System.out.println(maxAvgScore);
    }
}
