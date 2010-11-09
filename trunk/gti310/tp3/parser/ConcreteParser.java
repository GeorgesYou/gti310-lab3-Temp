/******************************************************
 Laboratoire #3 : Résolution de graphe
 
 Cours :             GTI310
 Session :           Automne 2010
 Groupe :            01
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Marie-Ève Benoit
 Code(s) perm. :     DESG24078908
 					 BENM22568707
 Chargée de lab. :   Jean-François Franche 
 Nom du fichier :    ConcreteParser.java
 Date crée :         2010-11-09
 Date dern. modif.   2010-11-09
 *******************************************************/
package gti310.tp3.parser;

import gti310.tp3.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcreteParser implements Parser<Data> {

	@Override
	public Data parse(String filename) {
		// TODO Auto-generated method stub
		File file = new File(filename);
		
		if (!file.exists())
			error();
		
		BufferedReader reader = null;
		int[][] array = null;
		int count = 0;
		String line = null;
		
		try
        {
            reader = new BufferedReader(new FileReader(file));
            Scanner lineCounter = new Scanner(new FileReader(file));
            
            while (lineCounter.hasNextLine()) 
            {
                    line = lineCounter.nextLine();
                    count++;
            }
            count--;
            lineCounter.close();
            
            //Validate that the last line = $
            if (!line.equals("$"))
            	error();
            
            line = null;
                        
            array = new int[count][3];
            for (int i=0;i<count;i++)
            	for (int j=0;j<3;j++)
            		array[i][j]=-1;

            int lineNum=0;
            
            while ((line = reader.readLine()) != null)
            {
            	Matcher makeMatch = Pattern.compile("(\\d+)+").matcher(line);
            	
            	if (line!="$")
            	for (int i=0; makeMatch.find(); i++) 
            	{
            		if (i<3)
            			array[lineNum][i] = Integer.parseInt(makeMatch.group(0));
            		else
            			error();
            	}
            	lineNum++;
            }
            reader.close();

            //Validate that the 2 first line have only 1 number
    		if (array[0][1]!=-1 || array[0][2]!=-1 || array[1][1]!=-1 || array[1][2]!=-1)
    			error();
        } 
		catch (Exception e)
        {e.printStackTrace();}
		
		if (array[2][0]==-1)
			array[2][0]=array[3][0];
		
		int[][] links = new int[count-3][3];
		for (int i=0;i<count-3;i++)
			for (int j=0;j<3;j++)
				links[i][j] = array[i+3][j];
		
		return new Data(array[0][0],array[1][0],array[2][0],links);
	}
	
	private void error()
	{
		System.out.println("Input file is not valid");
		System.exit(0);
	}

}
