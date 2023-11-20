package StructuralPatterns.CompositePattern.TransparencyMode;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List list = new ArrayList();
    @Override
    public void add(Component c) {
        System.out.println("[Added]");
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        System.out.println("[Removed]");
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component)list.get(i);
    }

    @Override
    public Component getComposite() {
        return this;
    }

    @Override
    public void operation() {
        for(Object obj : list){
            ((Component) obj).operation();
        }
    }
}
