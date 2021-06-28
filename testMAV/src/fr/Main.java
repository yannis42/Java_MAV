package fr;

import fr.html.AgentPage;
import fr.parsing.Agent;
import fr.parsing.ParseTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    static ArrayList<Agent> agentsList;
    static HashMap<String, String> mat;

    public static void main(String[] args) throws IOException {
        agentsList = new ArrayList<>();
        String path = args[0];
        //String path = "C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\Test-TXT";//

        mat = ParseTxt.parseMat(path + "liste.txt");
        ArrayList<String> agents = ParseTxt.parseFile(path + "staff.txt");

        for (String agent : agents) {
            Agent ag = new Agent(path, agent);
            if (ag.getStuff() != null) {
                agentsList.add(ag);
                AgentPage.createAgentPage(path, agent, agentsList.get(agentsList.size() - 1), mat);
            }

        }
    }
}
