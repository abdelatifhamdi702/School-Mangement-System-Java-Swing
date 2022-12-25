package gestecole;

import javax.swing.JTable;

/**
 *
 * @author Abdelatif Hamdi
 */
public interface MainData {
    public void add();
    public void update();
    public void delete();
    public String getAutoNumber();
    public void getAllRows(JTable table);
    public void getOneRow(JTable table);
    public void getCustomRows(String Statement , JTable table );
    public String getValueByName(String Name);
    public String getNameByValue(String Value);
}
