package education.services;

import education.actors.Apprenant;
import education.actors.Formateur;
import education.actors.Person;
import education.nonActors.Promotion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class ComptesMemory extends Dao<Person,Promotion> {

    static List<Person> acteurs;

    static {
        try {
            acteurs = new ComptesDB().getAll();
        }catch (SQLException e){
            System.out.println("Something wrong in the conection with the database .");
        }
    }
     public ComptesMemory() throws SQLException {




   }


    @Override
    public List<Person> getAll() throws SQLException {
        return acteurs;
    }

    @Override
    public void insertRow(Person person) throws SQLException {
        acteurs.add(person);

    }



    public void updateRow(Person person, Promotion promotion) throws SQLException {
        if (person instanceof Formateur) ((Formateur) person).setFormateurPromo(promotion);
        else if (person instanceof Apprenant)  ((Apprenant) person).setApprenantPromo(promotion);

    }

    @Override
    public Person getAllById(int id) {
        return null;
    }
}
