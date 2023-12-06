package src.App.Cliente.Components.Pelea.Pelea1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pelea1Component implements ActionListener{
    private Pelea1Template pelea1Template;
    
    public Pelea1Component(){
        this.pelea1Template = new Pelea1Template(this);
    }
    public Pelea1Template getPelea1Template(){
        return pelea1Template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}

