package resolveKata;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {

    public static boolean redacted(String doc1, String doc2) {
        char[] d1 = doc1.toCharArray();
        char[] d2 = doc2.toCharArray();
        String[] d1str = doc1.split(" ");
        char[] d2str;
        List<Integer> ind = new ArrayList<>();
        List<String> d2s = new ArrayList<>();
        if (d1.length != d2.length) return false;
        boolean result = true;
        int start = 0;
        int end = 0;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] == ' ') {
                ind.add(i);
            }
        }
        for(int j = 0; j < ind.size(); j++) {
            d2str = new char[ind.get(j)];
            for (int i = 0; i < d2.length; i += ind.get(j)) {
                d2str[i] = d2[i];
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String doc1 = "XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\n";
        String doc2 = "Area-51. Medical Report. 23/Oct/1969\n";


        char[] d1 = doc1.toCharArray();
        char[] d2 = doc2.toCharArray();
        String[] d1str = doc1.split(" ");
        String[] d2str;
        List<Integer> ind = new ArrayList<>();
        List<String> d2s = new ArrayList<>();
        //if (d1.length != d2.length) return false;
        boolean result = true;
        int start = 0;
        int end = 0;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] == ' ') {
                ind.add(i);
            }
        }
//        for(int j = 0; j < ind.size(); j++) {
//            d2str = new char[ind.get(j)];
//
//            for (int i = 0; i < ind.get(j); i++) {
//                d2str[i] = d2[i];
//            }
//        }

//        for(int j = 0; j < ind.size(); j++) {
//            d2str = new String[ind.get(j)];
//            for(int i = ; i < d1.length; )
//        }


    }

}
