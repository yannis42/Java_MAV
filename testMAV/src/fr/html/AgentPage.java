package fr.html;

import fr.parsing.Agent;

import java.io.*;
import java.util.HashMap;

public class AgentPage {



    public static void createAgentPage(String path, String id, Agent agent, HashMap<String ,String> map) throws IOException {
        StringBuilder sb = new StringBuilder();

        File test = new File(path+"test.html");
        if(test.exists()){
            BufferedReader br = new BufferedReader(new FileReader(test));
            String st;
            while ((st = br.readLine()) != null)
            {
                sb.append(st);
            }
        }
        StringBuilder list = new StringBuilder();
        for(String item : agent.getStuff()){
            list.append( "<p style=\"text-align: center;\">"+map.get(item)+"</p>\n");
        }
        String html = sb.toString().replace("%name%",agent.getFname()+" "+agent.getName()).replace("%jpg%",agent.getImage()).replace("%liste%",list.toString());



        File f = new File(path + id + ".html");
        try {
            if (f.createNewFile()) {
                FileWriter myWriter = new FileWriter(path + id + ".html");
                myWriter.write(html);
                myWriter.close();
            }else{
                FileWriter myWriter = new FileWriter(path + id + ".html");
                myWriter.write(html);
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }








}
