package com.repo.gitHub;

import java.util.ArrayList;
import java.util.List;

public class GitHubRepo {
	
	
	
	public static void main(String[] args) {


        List<String> verticesposition2 = new ArrayList<String>();

        verticesposition2.add("safdsfVertex");

        verticesposition2.add("safdsfNamesfsd");
     verticesposition2.add("notCONTAINS");
        verticesposition2.add(" shoes");

        for (String str5 : verticesposition2){

            if((str5.contains("Vertex")||str5.contains("Name")||str5.contains("Transmittance")||str5.contains("shoes"))){

                System.out.println(str5);
                
                String git = "hello, I am new to gitHub";
                System.out.println("git");

       
            }
        }
	
	}
	

	
}
