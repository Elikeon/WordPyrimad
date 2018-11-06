/*
* Jared Craig
* 5/11/2018
* It deletes the first and last letter until it hits 1 or 2 remaining letters
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String letters =   JOptionPane.showInputDialog("Enter a word."); 
   
  
  Pryamid(letters);
   
    
    }
    public static void Pryamid(String word){
        
        
        if(word.length() ==1 ||word.length() ==2 ){
  
            System.out.println(word);
        }
        else {    
            System.out.println(word);
             for (int i = word.length(); i > 2;) {
                 if(word.length() >= 2) {
                 word =word.substring(1);
                  word =word.substring(0,word.length()-1);
                  System.out.println(word);
                 }
                 else {
                    break;
                 }
             }
        }
    }  
}
