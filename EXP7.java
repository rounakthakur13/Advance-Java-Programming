import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class EXP7 extends JFrame {

    private static final long serialVersionUID = 1L;

    EXP7() 
	{
        DefaultMutableTreeNode bharat = new DefaultMutableTreeNode("Bharat");
        DefaultMutableTreeNode state = new DefaultMutableTreeNode("States");
        DefaultMutableTreeNode Unitre = new DefaultMutableTreeNode("United Territory");
        bharat.add(state);
        bharat.add(Unitre);

        DefaultMutableTreeNode maha = new DefaultMutableTreeNode("Maharastra");
        DefaultMutableTreeNode delhi = new DefaultMutableTreeNode("Delhi");
        DefaultMutableTreeNode jk = new DefaultMutableTreeNode("Jammu & Kashmir");
        DefaultMutableTreeNode panj = new DefaultMutableTreeNode("Panjab");
        DefaultMutableTreeNode goa = new DefaultMutableTreeNode("Goa");
        DefaultMutableTreeNode ap = new DefaultMutableTreeNode("Andra Pradesh");
        DefaultMutableTreeNode mp = new DefaultMutableTreeNode("Madhya Pradesh");
        DefaultMutableTreeNode kerala = new DefaultMutableTreeNode("Kerala");
        DefaultMutableTreeNode tamil = new DefaultMutableTreeNode("Tamil Nadu");
        DefaultMutableTreeNode up = new DefaultMutableTreeNode("Uttar pradesh");
        state.add(maha);
        state.add(delhi);
        state.add(jk);
        state.add(panj);
        state.add(goa);
        state.add(ap);
        state.add(mp);
        state.add(kerala);
        state.add(tamil);
        state.add(up);
        DefaultMutableTreeNode dnd = new DefaultMutableTreeNode("Daman & Diu");
        DefaultMutableTreeNode ann = new DefaultMutableTreeNode("Andaman & Nicobar");
        DefaultMutableTreeNode lkash = new DefaultMutableTreeNode("Lakshdweep");
        Unitre.add(dnd);
        Unitre.add(ann);
        Unitre.add(lkash);

        JTree jt = new JTree(bharat);
        add(jt);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) 
	{
        new EXP7();
    }
    
}
