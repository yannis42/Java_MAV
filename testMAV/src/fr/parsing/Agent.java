package fr.parsing;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agent {

    private String name, fname,mission, passw;
    private List<String> stuff;
    private String image;

    public Agent(String path,String name) throws IOException {
        ArrayList<String> info = ParseTxt.parseFile(path+name+".txt");
        if(info.size()>0)
        {
            image = path + name + ".jpg";
            this.name = info.get(0);
            fname = info.get(1);
            mission = info.get(2);
            passw = info.get(3);
            stuff = info.subList(4, info.size()); // en partant du principe qu il y ai que du materiel apres (pas sur)

        }
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public String getMission() {
        return mission;
    }

    public String getPassw() {
        return passw;
    }

    public List<String> getStuff() {
        return stuff;
    }

    public String getImage() {
        return image;
    }
}
