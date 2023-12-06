package src.App.Cliente.Components.Pelea.Pelea4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pelea4Component implements ActionListener{
    private Pelea4Template pelea4Template;
    
    public Pelea4Component(){
        this.pelea4Template = new Pelea4Template(this);
    }
    public Pelea4Template getPelea4Template(){
        return pelea4Template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}

