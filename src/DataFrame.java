

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class DataFrame {

    protected ArrayList<ArrayList<Object>> mainFrame;
    protected String[] titles;
    protected String[] types;
    protected Class<? extends Value>[] vTypes;


    DataFrame(String[] newTitles, String[] newTypes){
        titles = newTitles.clone();
        types = newTypes.clone();
        mainFrame = new ArrayList<ArrayList<Object>>();

        for (String title : titles) {         //adding columns to the DF
            mainFrame.add(new ArrayList<>());
        }
    }

    //kopiowanie kolumn i nowa df
    DataFrame(String[] newTitles, String[] newTypes, boolean odroz){
        titles = newTitles.clone();
        types = newTypes.clone();
        mainFrame = new ArrayList<ArrayList<Object>>();
    }

    //zmodyfikowane konstruktory
    DataFrame(String[] newTitles, Class<? extends Value>[] newTypes){
        titles = newTitles.clone();
        vTypes = newTypes.clone();

        mainFrame = new ArrayList<>();
        for (String title : titles) {         //adding columns to the DF
            mainFrame.add(new ArrayList<>());
        }


    }


    DataFrame(String dataFile, String[] newTypes, boolean trueHeader) throws IOException {
        mainFrame = new ArrayList<>();
        types = newTypes.clone();

        FileInputStream fstream = new FileInputStream(dataFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String newLine;
        boolean noNames=true;

        while((newLine = br.readLine()) != null ){
            if(noNames && trueHeader){
                titles = newLine.split(",");
                noNames = false;
            }

            if(!trueHeader){
                String [] newTitles = new String[types.length];
                for (int i = 0; i < types.length; i++){
                    System.out.print("Enter the names of the columns: ");
                    Scanner scan= new Scanner(System.in);
                    String text= scan.nextLine();
                    newTitles[i] = text;
                   // System.out.print(text);
                }
                titles = newTitles.clone();
                trueHeader = true;
                noNames = false;
            }
            
            ArrayList<Object> newRow = new ArrayList<Object>(Arrays.asList(newLine.split(" , ")));
            addRow(newRow);
        }
    }


    int size(){
        for(int i=0; i<types.length; i++){
            for(int j=0; j<types.length; j++){
                if(mainFrame.get(i).size()!=mainFrame.get(j).size()){
                    System.out.print("Columns doesn't have equal sizes.");
                    return 0;
                }
            }
        }
        return this.mainFrame.get(0).size();
    }

    public ArrayList<Object> get(String colname){
        int indexOfColumn;
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equals(colname)) {
                indexOfColumn = i;
                System.out.print("I found the column.");
                return mainFrame.get(indexOfColumn);
            }
        }
        return null;
    }


    DataFrame get (String [] cols, boolean copy) {

        int index = 0;
        int[] indexesOfColumns = new int[cols.length];
        for (int i = 0; i < titles.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if (titles[i].equals(cols[j])) {
                    indexesOfColumns[index] = i;
                    System.out.print("I found the column.");
                    index++;
                }
            }
        }

        index = 0;
        String[] oldTitles = titles.clone();

        //tworzenie tablicy z nowymi nazwami
        String[] newTypes = new String[types.length];
        for (int k = 0; k < cols.length; k++) {
            newTypes[k] = types[indexesOfColumns[index]];
            index++;
        }

        DataFrame newDF = new DataFrame(cols, newTypes, true);

        int index1 = 0;
        for (String name: cols){
            for (ArrayList<Object> column: mainFrame){
                if (name.equals(oldTitles[index1])){
                    //copy==true -> deep, copy==false -> shallow
                    newDF.mainFrame.add(copy ? (ArrayList<Object>) column.clone() : column);
                }
            }
            index1++;
        }

        return newDF;

    }



   DataFrame iloc(int i){
       String [] newTitles=titles.clone();
       String [] newTypes=types.clone();

       DataFrame dfOneRow = new DataFrame(newTitles, newTypes, true);

        int index = 0;
        for (ArrayList column : mainFrame){
            dfOneRow.mainFrame.add(new ArrayList<Object>());
            dfOneRow.mainFrame.get(index).add(column.get(i));
            index++;
        }

        if (dfOneRow.mainFrame.get(0).isEmpty()){
            return null;
        }
        return dfOneRow;
   }

   public DataFrame iloc(int from, int to){
       String [] newTitles=titles.clone();
       String [] newTypes=types.clone();

       DataFrame moreRows = new DataFrame(newTitles, newTypes, true);

       int index = 0;
       for (ArrayList column : mainFrame){
           moreRows.mainFrame.add(new ArrayList<Object>());

           for(int j = from; j <= to; j++){
               moreRows.mainFrame.get(index).add(column.get(j));
           }
           index++;
       }

       if (moreRows.mainFrame.get(0).isEmpty()){
           return null;
       }
       return moreRows;


   }



    public void addRow(ArrayList<Object> row){
        boolean emptyDF = mainFrame.isEmpty();
        if (!emptyDF){                                    //sprawdzic jeszcze size
            for(int rowIndex=0; rowIndex<titles.length; rowIndex++) {
                mainFrame.get(rowIndex).add(row.get(rowIndex));
            }
        }
        else{
            for (int rowIndex=0; rowIndex<titles.length; rowIndex++){
                ArrayList<Object> column = new ArrayList<>();
                column.add(row.get(rowIndex));
                mainFrame.add(column);
            }
        }
    }
}

