package education.actors;

public class Adminstrateur extends Person{





    public Adminstrateur() {

    }

    public Adminstrateur(String nom,String prénom,String email,String password){
        super(nom,prénom,email,password);
    }
    @Override
    public boolean login(String email,String password) {
        if(this.email.equals(email) && this.password.equals(password)){
            this.toString();
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
