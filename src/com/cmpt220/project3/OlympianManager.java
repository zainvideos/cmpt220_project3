package com.cmpt220.project3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;



/**
 * Created by Zain on 11/6/2014.
 */
//this class used to load olympians from file and store them in an array of type Olympian
public class OlympianManager {
    ArrayList<Object> olympian = new ArrayList<Object>();
    //public ArrayList olympian= new ArrayList();


   // public OlympianManager (String cat) {
//olympians= new ArrayList();


    //BufferedReader in
            //= new BInputStreamufferedReader(new FileReader("C:\\Users\\Zain\\IdeaProjects\\cmpt_project3\\src\\com\\cmpt220\\project3\\olympians.lgoo"));
    // intilize an

    /*InputStream inputStream = new FileInputStream("C:\\Users\\Zain\\IdeaProjects\\cmpt_project3\\src\\com\\cmpt220\\project3\\olympians.lgoo");
    Reader      reader      = new InputStreamReader(inputStream);

    int data = reader.read();
    while(data != -1){
        char theChar = (char) data;
        data = reader.read();
    }
    reader.close();*/

    //file path
   // private String path;

    public OlympianManager(String file_path) {
        path = file_path;
    }

    public OlympianManager() {

    }
    String path= "C:\\\\Users\\\\Zain\\\\IdeaProjects\\\\cmpt_project3\\\\src\\\\com\\\\cmpt220\\\\project3\\\\olympians.lgoo";
//detect number of lines
    int readLines() throws IOException{
    FileReader file_lgoo = new FileReader(path);
    BufferedReader bf = new BufferedReader(file_lgoo);
    String aLine;
    int numberOfLines= 0;
    while ( ( aLine = bf.readLine( ) ) != null ) {
        numberOfLines++;
    }
    bf.close();
    return numberOfLines;
}
    //verify file
    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        int numberOfLines = readLines()-1;
        String[] textData = new String[numberOfLines];
        if (!textReader.readLine().equals("LGOO")){
           System.out.println("Error, this file is corrupt!");
            return null;
        }
        int i;
        for (i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
            //"name,M,18"
          String[] splittedData = textData[i].split(",");
//determine sex of each line
            Sex sextemp;
            if (splittedData[1].equals("M")) {
            sextemp = Sex.MALE;
            }
            else {
                sextemp = Sex.FEMALE;
            }
// format string data into olympian data
        Olympian splittedOlymps= new Olympian(splittedData[0],sextemp,Integer.parseInt(splittedData[2]));
            //add data to olympian arraylist
olympian.add(splittedOlymps);
        }
        textReader.close();
        //System.out.println(olympian);
        //System.out.println(olympian.size());
        return textData;

    }

/*public static void main(String[] args) throws IOException {
    String file_name= "C:\\\\Users\\\\Zain\\\\IdeaProjects\\\\cmpt_project3\\\\src\\\\com\\\\cmpt220\\\\project3\\\\olympians.lgoo";
    //file format verification
    if (!file_name.endsWith(".lgoo"))
    {
        System.out.println("Invalid file type, please use an Lgoo file");
        return;
    }
    try {
        OlympianManager file = new OlympianManager(file_name);
        String[] aryLines = file.OpenFile();
//debugging purposes, print out string of olympians from file.
        int i;
        for ( i=0; i < aryLines.length; i++ ) {
           // System.out.println( aryLines[ i ] ) ;

        }
    }
    catch ( IOException e ) {
        System.out.println( e.getMessage() );
    }
    }
*/
    public ArrayList getOlympians() {
//function to print out olympian array in Main


      // main();
        int i;
        for ( i=0; i < olympian.size(); i++ ) {
            System.out.println(olympian.get(i));

        }

        //System.out.println(olympian.size());
       //
       // for debugging purposes
        System.out.println("testing123");
       // System.out.println(olympian);
        return olympian;

    }

}

//GARBAGE:
  /*   InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
    String filePath = "C:\\\\Users\\\\Zain\\\\IdeaProjects\\\\cmpt_project3\\\\src\\\\com\\\\cmpt220\\\\project3\\\\olympians.lgoo";

       if (!filePath.endsWith(".lgoo"))
        {
            System.out.println("Invalid file type, please use an Lgoo file");
            return;
        }

        }


         /*List<Olympian> readFile = new ArrayList<Olympian>();
            String line = null;
            List<String> list = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                while((line = reader.readLine()) != null){
                    String[] splitter = line.split(",");
                    if (splitter[1].equals("F")) {

                        list.add(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //return list;
            System.out.println(list);*/

       /* try {
            // open input stream test.txt for reading purpose.
            is = new FileInputStream(filePath);

            // create new input stream reader
            isr = new InputStreamReader(is);

            // create new buffered reader
            br = new BufferedReader(isr);

            // creates buffer
            char[] cbuf = new char[is.available()];

            // reads characters to buffer, offset 2, len 10
            br.read(cbuf, 0, 178);

            /*File file = new File(filePath);
            ArrayList<String> olympians = new ArrayList<String>();
            Scanner in = new Scanner(file);
            while (in.hasNextLine()){
                olympians.add(in.nextLine());
            }
            Collections.sort(olympians);
            for(int i=0; i<olympians.size(); ++i){
                System.out.println(olympians.get(i));
            }*/

// for each character in the buffer
            /*for (char c : cbuf) {
                // if char is empty
                if (c == (char) 0) {
                    c = '*';
                }
                // prints characters
               System.out.print(c);
            }
        }
            catch (FileNotFoundException e_nf) {
                e_nf.printStackTrace();
                System.out.println("file not found, please check the path and try again");
                return;

        }

        catch(Exception e){
            e.printStackTrace();
        }

        finally{

            // releases resources associated with the streams
            if(is!=null)
                is.close();
            if(isr!=null)
                isr.close();
            if(br!=null)
                br.close();
        }

    }
*/