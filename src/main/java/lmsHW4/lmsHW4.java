package lmsHW4;

import java.util.*;
import java.io.*;

public class lmsHW4 {

    public static void main(String[] args) throws IOException {

        readThread read = new readThread("input.txt");
        read.run();
        String allLines = read.getLines();
        writeThread write = new writeThread(allLines);
        write.run();
    }

}

class readThread implements Runnable{

    String fileName;
    String allLines;

    readThread(String fileName){
       this.fileName = fileName;
    }

    @Override
    public void run() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (line != null) {
            System.out.println(line);
            sb.append(line);
            sb.append(System.lineSeparator());

            try {
                line = br.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        allLines = sb.toString();
        System.out.println(allLines);
    }

    public String getLines(){
        return allLines;
    }
}

class writeThread implements Runnable{

    String allLines;
    PrintWriter writer;

    writeThread(String allLines){
        this.allLines = allLines;
    }

    @Override
    public void run() {

        try {
            writer = new PrintWriter("output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        parseAndCalculute(allLines,writer);
    }

    public void parseAndCalculute(String allLines, PrintWriter writer) {

        Scanner scanner = new Scanner(allLines);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.isEmpty()) {
                writer.println(calculate(line));
            }
            else{
                writer.println(line);
                line = scanner.nextLine();
            }



        }
        scanner.close();
    }

    public String calculate(String line){

        String result = null;
        List<Integer> arr = new ArrayList<>();
        boolean sum=false,sub=false;
        for (char ch : line.toCharArray()){

            if(ch>=48 && ch<=57){
                int val = Character.getNumericValue(ch);
                arr.add(val);
            }

            else if (ch == '+'){
                sum = true;
            }
            else if (ch == '-'){
                sub = true;
            }

        }
        if(sum){
            Integer sumAns = 0;
            for (Integer integer : arr) {
                sumAns += integer;
            }
        }

        if(sub){
            Integer subAns = 0;
            for (Integer integer : arr) {
                subAns += integer;
            }
        }
        return result;
    }
}