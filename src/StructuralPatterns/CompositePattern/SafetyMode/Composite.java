package StructuralPatterns.CompositePattern.SafetyMode;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List list = new ArrayList();
    @Override
    public Component getComponsite() {
        return this;
    }

    @Override
    public void operation() {
        for(Object obj : list){
            ((Component) obj).operation();
        }
    }

    public void add(Component component){
        System.out.println("[Added]");
        list.add(component);
    }

    public void remove(Component component){
        System.out.println("[Removed]");
        list.remove(component);
    }

    public Component getChild(int i){
        return (Component)list.get(i);
    }

    public List getComponents() {
        return list;
    }
}
