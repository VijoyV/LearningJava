import java.util.Random;
import java.util.Vector;
import java.util.Iterator;

public class TreePlanter
{
    public static void main (String[] args)
    {

        int treesPlanting=10;
        int randomNo = 0;

        if (args!=null && args.length>=1)
        {

            treesPlanting = Integer.parseInt(args[0]);
        }

        Random randomGenerator = new Random();
        Vector myTrees = new Vector();

        //-- Planting Trees
        for(int h=0; h<treesPlanting; h++)
        {
            randomNo = randomGenerator.nextInt((h+1));
            myTrees.add(new Tree(randomNo));

        }

        //-- Displaying Trees with Height
        Iterator it = myTrees.iterator();
        Tree aTree = null;
        int ctr = 0;
        while(it.hasNext())
        {
            aTree = (Tree) it.next();
            System.out.println("Tree No. " + (++ctr) + " Planted with height " + aTree.getHt() + " Feets");
        }
    }
}
