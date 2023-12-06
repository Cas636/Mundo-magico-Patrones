package src.App.Cliente.Components.Pelea.Pelea3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pelea3Component implements ActionListener{
    private Pelea3Template pelea3Template;
    
    public Pelea3Component(){
        this.pelea3Template = new Pelea3Template(this);
    }
    public Pelea3Template getPelea3Template(){
        return pelea3Template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}

