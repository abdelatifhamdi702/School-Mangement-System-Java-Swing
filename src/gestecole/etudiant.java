package gestecole;
import static Tools.Tools.Message;
import javax.swing.JTable;

/**
 *
 * @author Abdelatif Hamdi
 */
public class etudiant implements MainData{
    private int NumE;
    private String NomE;
    private String Prénom;
    private String Niveau;
    private String DateN;

    
    @Override
    public void add() {
        String insert ="insert into etudiant values("
                +NumE+",'"+NomE+"','"+Prénom+"','"+DateN+"','"+Niveau+"')";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("L'Etudiant est ajouté");
    }}
    

    @Override
    public void update() {
       String update = "update etudiant set Nom='"+NomE+"',Prénom='"+Prénom+"', DateN='"+DateN+"',Niveau='"+Niveau+"' where Id="+NumE;
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("L'Etudiant est mis à jour");}
     
    }
    

    @Override
    public void delete() {
       String delete="delete from etudiant where Id="+NumE;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("L'Etudiant est supprimé");}}

    @Override
    public String getAutoNumber() {
        String auto = db.go.getAutoNumber("etudiant", "Id");
        return auto;    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("etudiant", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String select="select * from etudiant where Id="+NumE;
       db.go.fillToJTableWithStatement(select, table);
    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
        db.go.fillToJTableWithStatement(Statement, table);
    }

    @Override
    public String getValueByName(String Name) {
     return "Erreur";    }

    @Override
    public String getNameByValue(String Value) {return "Erreur";    }

    public int getNumE() {
        return NumE;
    }

    public void setNumE(int NumE) {
        this.NumE = NumE;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String NomE) {
        this.NomE = NomE;
    }

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String Prénom) {
        this.Prénom = Prénom;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String Niveau) {
        this.Niveau = Niveau;
    }

    public String getDateN() {
        return DateN;
    }

    public void setDateN(String DateN) {
        this.DateN = DateN;
    }


    
    
}

