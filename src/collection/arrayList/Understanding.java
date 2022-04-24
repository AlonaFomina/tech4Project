package collection.arrayList;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Understanding {
    public static void main(String[] args) {

            //1. Declaring an Array vs ArrayList
        String [] namesArray  = new String[5];

        ArrayList<String> nameList = new ArrayList<>();

        //2.How to print size of Array vs ArrayList

        System.out.println("____________printing size of Array vs ArrayList______________");
        System.out.println("Size of the array = " + namesArray.length);
        System.out.println("Size of ArrayList = " + nameList.size());


        //3.How to add elements to Array vs ArrayList
        namesArray[0] = "Abe";
        namesArray[4] = "Data";
        //namesArray[7] = "John";// out of bound Exeptions

        nameList.add("Abe"); // add methot that takes object
        nameList.add(1,"Data");// add object to a specific index
        nameList.add(1,"John");// update
        nameList.add("Alona");// goes to the end
        nameList.add("Max");// goes to the end
        nameList.add(0, "James");// will be at 0
        nameList.set(2, "lionel");// replaced


       //3.How to add elements to Array vs ArrayList
        System.out.println(Arrays.toString(namesArray));
        System.out.println(nameList);//[James, Abe, lionel, Data, Alona, Max]

       // nameList.add(8, "Andrei");// out of bound
        nameList.add(6, "Andrei");//[James, Abe, lionel, Data, Alona, Max, Andrei]
        System.out.println(nameList);

        nameList.add(5, "Taylor");
        System.out.println(nameList);//[James, Abe, lionel, Data, Alona, Taylor, Max, Andrei]

        nameList.set(3, "Daria");
        System.out.println(nameList);//[James, Abe, lionel, Daria, Alona, Taylor, Max, Andrei]

        nameList.add("Regina");
        nameList.add("Regina");
        nameList.add("Regina");
        nameList.add(null);
        nameList.add(null);
        nameList.add(null);
        nameList.add("Guluzar");

        System.out.println(nameList);
        System.out.println(nameList.size());


        // remove element with ingex
        nameList.remove(7); // removed element with index of 7

        //nameList,remove("James")this will remove  James

        //nameList.removeAll(collectionOfElementsToBeRemoved)will remove all the elements from the given collection
        nameList.remove(0);//James
        System.out.println(nameList); //[Abe, lionel, Daria, Alona, Taylor, Max, Regina, Regina, Regina, null, null, null, Guluzar]


        System.out.println(nameList.remove(2));//Daria

       nameList.remove("Alona");
        System.out.println(nameList);

       // System.out.println(nameList.remove("Max"));

        /*nameList.add(0,"Regina");
        nameList.remove("Regina");
        System.out.println(nameList);// removes first occurrence of object given

        nameList.remove("Regina");
        nameList.remove("Regina");
        nameList.remove("Regina");
        System.out.println(nameList);*/


        System.out.println(nameList.get(3));
        System.out.println(nameList.get(5));
        System.out.println(nameList);

        System.out.println(nameList.indexOf("Regina")); //0
        System.out.println(nameList.lastIndexOf("Regina")); //7
        System.out.println(nameList.contains("Max"));// true
        System.out.println( nameList.contains("max"));//  false
        System.out.println(nameList.contains("Kaly"));//  false
        System.out.println(nameList);

        nameList.clear();
        //nameList.removeAll(nameList);
        System.out.println(nameList.size());//0



    }
}
