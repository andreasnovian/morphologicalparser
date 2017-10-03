/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andreas Novian
 */
public class Tester {
    public static void main(String[] args) throws IOException {
        MorphologicalParser mp = new MorphologicalParser();
        
        String text = "Andreas sedang memakan makanan kaleng";
        String word[] = text.split(" ");
        ArrayList<String> parseResult;

        for (String i : word) {
            parseResult = mp.getMorphologic(i);
            System.out.println(i + ": "+ parseResult.toString());
            System.out.println("");
        }
    }
}
