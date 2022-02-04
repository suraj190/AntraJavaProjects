import java.util.*;
import java.io.*;

public class lmsHW2 {

    public static void main(String[] args) {

        String fp = "/Users/suraj/Desktop";
        Criteria c = new Criteria(fp);
        Criteria ans = count(c);
        System.out.println("There are "+ ans.totalFile + " total files and "+ans.subFile+" total folders " +
                "inside folder "+ ans.path);



    }
    public static Criteria count(Criteria criteria) {

        File directory = new File(criteria.path);
        int numberOfFiles = 0;
        int subFiles = 0;
        for (File element : directory.listFiles()){
            if (element.isDirectory()) {
                Criteria c = new Criteria(element.getAbsolutePath());
                numberOfFiles += c.totalFile;
                subFiles++;
                count(c);
            }
            else { // one more file
                numberOfFiles++;
            }
        }
        Criteria ans = new Criteria(numberOfFiles,subFiles);
        ans.path = criteria.path;
        return ans;

    }


}

class Criteria  {

        String path;
        String extension;
        Boolean includeSub;
        int totalFile;
        int subFile;


        Criteria(String path){
            this.path = path;
        }
        Criteria(int totalFile,int subFile){
            this.totalFile=totalFile;
            this.subFile=subFile;
        }
}



