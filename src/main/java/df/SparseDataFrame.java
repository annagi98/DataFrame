//import groovy.json.internal.ArrayUtils;
package df;
import javax.xml.crypto.Data;
import java.util.ArrayList;

public class SparseDataFrame extends DataFrame {

    /*SparseDataFrame(String[] newTitles, String[] newTypes) {
        super(newTitles, newTypes);
    } */

    String[] titles;
    String[] types;
    ArrayList<ArrayList<COOValue>> mainSparseDF;
    int numbersOfColumns;

    //podstawowy konstruktor
    SparseDataFrame(String[] newTitles, String[] newTypes) {
        super(newTitles, newTypes);
        numbersOfColumns = newTitles.length;
    }

    SparseDataFrame(DataFrame someDF){
        titles = someDF.titles.clone();
        types = someDF.types.clone();
        mainSparseDF = new ArrayList<>();
        int colsNumber = someDF.titles.length;

        ArrayList columnSDF= new ArrayList<>();
        for (Object something : someDF.mainFrame.get(0)){
            int index=0;
            if (something instanceof IntegerValue){
                if((((IntegerValue) something).simpleValue())!=0){
                    int simpleValue = ((IntegerValue) something).simpleValue();

                    COOValue newCOOV = new COOValue(index, new IntegerValue(simpleValue));
                    columnSDF.add(newCOOV);
                }
            }
            index++;
        }
        mainSparseDF.add(columnSDF);
    }


    public DataFrame toDense(){
       // int indexOfNonZero =
        DataFrame dfNew = new DataFrame(titles, types);
        int [] usedIndexes = new int[mainSparseDF.get(0).size()+1];
        for(int i=0; i<mainSparseDF.get(0).size(); i++){
            usedIndexes[i] = mainSparseDF.get(0).get(i).getIndex();
            System.out.println(usedIndexes[i]);    //tu juz cos chyba jest nie tak! - wyswietlaja sie same zera
        }


        //when there's only 1 column

        for(int i=0; i<usedIndexes[usedIndexes.length-1]; i++){
            ArrayList columnDF = new ArrayList();
            System.out.println("tu juz nie wchodze :(");
            //iteruje po
            for(int j=0; j<usedIndexes.length; i++){
                if(mainSparseDF.get(0).get(i).getIndex()!=usedIndexes[j]){
                    columnDF.add(new IntegerValue(0));
                }
                else{
                    columnDF.add(mainSparseDF.get(0).get(i).getValue());
                }
                System.out.println(columnDF.get(i));

            }
            dfNew.mainFrame.add(columnDF);
        }
        return dfNew;
    }

    public int size(){

        return this.mainSparseDF.get(0).size();
    }


}
