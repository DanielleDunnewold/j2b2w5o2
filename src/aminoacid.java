import java.util.HashMap;

class Eenlettercode {
    private String eenlettercode;
    private String drielettercode;
    private String fullname;
    static final private HashMap<String,String> eenNaDrie = new HashMap<>(){{put("A","Ala");put("R","Arg");
    put("N","Asn");put("D","Asp");put("C","Cys");put("Q","Gln");put("E","Glu");
    put("G","Gly");put("H","His");put("I","Ile");put("L","Leu");put("K","Lys");
    put("M","Met");put("F","Phe");put("P","Pro");put("S","Ser");put("T","Thr");
    put("W","Trp");put("Y","Tyr");put("V","Val");}};
    static final private HashMap<String,String> eenNaHeel =new HashMap<>(){{put("A","Alanine");put("R","Arginine");
    put("N","Asparagine");put("D","Aspartic acid");put("C","Cysteine");put("Q","Glutamine");
    put("E","Glutamic acid");put("G","Glycine");put("H","Histidine");put("I","Isoleucine");
    put("L","Leucine");put("K","Lysine");put("M","Methionine");put("F","Phenylalanine");
    put("P","Pro");put("S","Ser");put("T","Threonine");put("W","Tryptophan");put("Y","Tyrosine");put("V","Valine");}};


    public Eenlettercode(String eenlettercode) throws NotValidAminoAcid {
        this.eenlettercode = eenlettercode;
        //gets the threelettercode and fullname out of the two hashmaps using the onelettercode as key
        this.drielettercode =eenNaDrie.get(eenlettercode);
        this.fullname = eenNaHeel.get(eenlettercode);
        //checks if the threelettercode and fullname aren't null, in that case a exception is thrown
        if(drielettercode==null||fullname==null){
            throw new NotValidAminoAcid("Not an valid onelettercode: ", eenlettercode);
        }
    }

    /**
     * return the onelettercode
     * @return eenlettercode, String the one lettercode of the aminoacid
     */
    public String getEenlettercode() {
        return eenlettercode;
    }

    /**
     * gets the threelettercode
     * @return drielettercode, String the threelettercode of the aminoacid
     */
    public String getDrielettercode() {
        return drielettercode;
    }

    /**
     * gets the full name of the aminoacid
     * @return fullname, String the fullname of the aminoacid
     */
    public String getFullname() {
        return fullname;
    }

}


class Drielettercode{
    private String eenlettercode;
    private String drielettercode;
    private String fullname;
    static final private HashMap<String,String> drieNaEen =new HashMap<>(){{put("Ala","A");put("Arg","R");put("Asn","N");
    put("Asp","D");put("Cys","C");put("Gln","Q");put("Glu","E");put("Gly","G");put("His","H");
    put("Ile","I");put("Leu","L");put("Lys","K");put("Met","M");put("Phe","F");
    put("Pro","P");put("Ser","S");put("Thr","T");put("Trp","W");put("Tyr","Y");put("Val","V");}};
    static final private HashMap<String,String> eenNaHeel =new HashMap<>(){{put("A","Alanine");put("R","Arginine");
        put("N","Asparagine");put("D","Aspartic acid");put("C","Cysteine");put("Q","Glutamine");
        put("E","Glutamic acid");put("G","Glycine");put("H","Histidine");put("I","Isoleucine");
        put("L","Leucine");put("K","Lysine");put("M","Methionine");put("F","Phenylalanine");
        put("P","Pro");put("S","Ser");put("T","Threonine");put("W","Tryptophan");put("Y","Tyrosine");put("V","Valine");}};


    public Drielettercode(String drielettercode)throws NotValidAminoAcid {
        this.drielettercode = drielettercode;
        //gets the onelettercode out of the hashmap drieNaEen with the threelettercode as key
        this.eenlettercode =drieNaEen.get(drielettercode);
        //get the fullname out of the hashmap eenNaHeel with the onelettercode as key
        this.fullname=eenNaHeel.get(eenlettercode);
        //checks if the eenlettercode of the fullname isn't null if that is the case a exception gets thrown
        if(eenlettercode==null||fullname==null){
            throw new NotValidAminoAcid("Not an valid threeletter combination: ",drielettercode);
        }


    }

    /**
     * return the onelettercode
     * @return eenlettercode, String the one lettercode of the aminoacid
     */
    public String getEenlettercode() {
        return eenlettercode;
    }

    /**
     * gets the threelettercode
     * @return drielettercode, String the threelettercode of the aminoacid
     */
    public String getDrielettercode() {
        return drielettercode;
    }

    /**
     * gets the full name of the aminoacid
     * @return fullname, String the fullname of the aminoacid
     */
    public String getFullname() {
        return fullname;
    }
}


class Fullname{
    private String eenlettercode;
    private String drielettercode;
    private String fullname;
    static final private HashMap<String,String> VolNaEen =new HashMap<>(){{put("Alanine","A");put("Arginine","R");
    put("Asparagine","N");put("Aspartic acid","D");put("Cysteine","C");put("Glutamine","Q");
    put("Glutamic acid","E");put("Glycine","G");put("Histidine","H");put("Isoleucine","I");
    put("Leucine","L");put("Lysine","K");put("Methionine","M");put("Phenylalanine","F");
    put("Proline","P");put("Serine","S");put("Threonine","T");put("Tryptophan","W");put("Tyrosine","Y");
    put("Valine","v");}};
    static final private HashMap<String,String> eenNaDrie = new HashMap<>(){{put("A","Ala");put("R","Arg");
        put("N","Asn");put("D","Asp");put("C","Cys");put("Q","Gln");put("E","Glu");
        put("G","Gly");put("H","His");put("I","Ile");put("L","Leu");put("K","Lys");
        put("M","Met");put("F","Phe");put("P","Pro");put("S","Ser");put("T","Thr");
        put("W","Trp");put("Y","Tyr");put("V","Val");}};

    public Fullname(String fullname) throws NotValidAminoAcid{
        this.fullname = fullname;
        //get the onelettercode out of the hashmap VolNaEen with the fullnme as key
        this.eenlettercode=VolNaEen.get(fullname);
        //gets the threeletter code out of the hashmap eenNaDrie with the oneletterCode as key
        this.drielettercode=eenNaDrie.get(eenlettercode);
        //checks if eenlettercode or drielletercode aren't null, if one of them is null it throws an exception
        if(eenlettercode==null||drielettercode==null){
            throw new NotValidAminoAcid("Not an valid aminoacid: ",fullname);
        }
    }

    /**
     * return the onelettercode
     * @return eenlettercode, String the one lettercode of the aminoacid
     */
    public String getEenlettercode() {
        return eenlettercode;
    }

    /**
     * gets the threelettercode
     * @return drielettercode, String the threelettercode of the aminoacid
     */
    public String getDrielettercode() {
        return drielettercode;
    }

    /**
     * gets the full name of the aminoacid
     * @return fullname, String the fullname of the aminoacid
     */
    public String getFullname() {
        return fullname;
    }
}