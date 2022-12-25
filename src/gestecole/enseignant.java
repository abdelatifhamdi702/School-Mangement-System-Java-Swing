/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestecole;

import static Tools.Tools.Message;
import javax.swing.JTable;

/**
 *
 * @author Abdelatif Hamdi
 */
public class enseignant  implements MainData{
    private int NumE;
    private String NomE;
    private String Prénom;
    private String Matière;
    private String DateN;
    private int NumTélé;

    
    @Override
    public void add() {
        String insert ="insert into enseignant values("
                +NumE+",'"+NomE+"','"+Prénom+"','"+DateN+"','"+Matière+"',"+NumTélé+")";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("L'Enseignant est ajouté");
    }}
    

    @Override
    public void update() {
       String update = "update enseignant set Nom='"+NomE+"',Prénom='"+Prénom+"', DateN='"+DateN+"',Matière='"+Matière+"',NumTélé="+NumTélé+" where Id="+NumE;
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("L'Enseignant est mis à jour");}
     
    }
    

    @Override
    public void delete() {
       String delete="delete from enseignant where Id="+NumE;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("L'Enseignant est supprimé");}}

    @Override
    public String getAutoNumber() {
        String auto = db.go.getAutoNumber("enseignant", "Id");
        return auto;    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("enseignant", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String select="select * from enseignant where Id="+NumE;
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

    public String getMatière() {
        return Matière;
    }

    public void setMatière(String Matière) {
        this.Matière = Matière;
    }

    public String getDateN() {
        return DateN;
    }

    public void setDateN(String DateN) {
        this.DateN = DateN;
    }

    public int getNumTélé() {
        return NumTélé;
    }

    public void setNumTélé(int NumTélé) {
        this.NumTélé = NumTélé;
    }




    
    
}
