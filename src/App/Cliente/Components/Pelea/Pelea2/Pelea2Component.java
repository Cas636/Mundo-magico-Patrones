package src.App.Cliente.Components.Pelea.Pelea2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pelea2Component implements ActionListener{
    private Pelea2Template pelea2Template;
    
    public Pelea2Component(){
        this.pelea2Template = new Pelea2Template(this);
    }
    public Pelea2Template getPelea2Template(){
        return pelea2Template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}

