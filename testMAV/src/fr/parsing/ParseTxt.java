package fr.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ParseTxt {


    public static HashMap<String, String> parseMat(String path) throws IOException {
        HashMap<String, String> list = new HashMap<>();
        File f = new File(path);
        if(f.exists()){
            BufferedReader br = new BufferedReader(new FileReader(f));
            String st;
            while ((st = br.readLine()) != null)
            {
                if(st.split("\t").length > 1)
                    list.put(st.split("\t")[0],st.split("\t")[1]);
            }
        }
        return list;
    }

    public static ArrayList<String> parseFile(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File f = new File(path);
        if(f.exists()){
            BufferedReader br = new BufferedReader(new FileReader(f));
            String st;
            while ((st = br.readLine()) != null)
            {
                    list.add(st);
            }
        }
        return list;
    }


}
