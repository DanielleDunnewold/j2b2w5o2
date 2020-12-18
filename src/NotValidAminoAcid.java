public class NotValidAminoAcid extends Exception{
    public NotValidAminoAcid(String reason, String statement) {
        super(reason + ":" + statement);
    }

    public NotValidAminoAcid(String reason, String statement, Throwable cause) {
        super(reason + ":" + statement, cause);
    }
}