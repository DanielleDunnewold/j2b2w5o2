import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //asks for a aminoacid either the onelettercode, threeletter code or the fullname
        System.out.println("give a aminoacid, either one letter, three letter or full name");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        //checks if it is a oneletter code
        if(s.length()==1){
            try{
//creates a object from the onelettercode in the constructer of this object the threeletter and fullname are determined
        Eenlettercode aminozuur =  new Eenlettercode(s);
        //prints out the threeletter and fullname of the aminoacid
            System.out.println("the three letter code: "+aminozuur.getDrielettercode()+
            "\nthe full name: "+aminozuur.getFullname());}
            //if it not a valid onelettercode a exception is catched here
            catch(NotValidAminoAcid e){
                System.out.println(e.getMessage()); }}

        //checks if it a threelettercode
        else if (s.length()==3){
            try{
                //makes the apropiate object so the onelettercode and fullname are determined
            Drielettercode aminozuur =new Drielettercode(s);
            //prints out the oneletter code and the fullname
            System.out.println("The one letter code: "+ aminozuur.getEenlettercode()+
                    "\nThe fullname: "+ aminozuur.getFullname());}
            //catches a exception if the threeletter code is invalid
            catch(NotValidAminoAcid e){
                System.out.println(e.getMessage());
            }
        }
        //checks if it is a fullname
        else if (s.length()>3){
            try{
                //makes the appropiate object so the threelettercode and onelettercode are determined
            Fullname aminozuur =new Fullname(s);
            //prints out the threeletter code and the one lettercode
            System.out.println("The one letter code: "+ aminozuur.getEenlettercode()+
                    "\nThe three letter code: "+ aminozuur.getDrielettercode());}
            //ccatches a exception if the fullname is invalid
            catch(NotValidAminoAcid e){
                System.out.println(e.getMessage());
        }
    }
}}
