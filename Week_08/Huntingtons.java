public class Huntingtons
{
    public static int maxRepeats(String dna)
    {
        int max = 0;
        int consecutive = 0;
        int i = 0;
        String t = "CAG";
        while (i < (dna.length() - 2))
        {
            String c = dna.substring(i, i+3);
            if (c.equals(t))
            {
                consecutive++;
                if (consecutive > max) max = consecutive;
                i += 3;
            }
            else
            {
                consecutive = 0;
                i++;
            }
        }  
        return max;
    }
    public static String removeWhitespace(String s)
    {
        String newstring1 = s.replace("\n", "");
        String newstring2 = newstring1.replace("\t", "");
        String newstring3 = newstring2.replace(" ", "");
        return newstring3;
    }
    
    public static String diagnose(int maxRepeats)
    {
        String diagnose = "";
        if ((maxRepeats >= 0 && maxRepeats <= 9) || (maxRepeats >= 181)) diagnose = "not human";
        if (maxRepeats >= 10 && maxRepeats <= 35) diagnose = "normal";
        if (maxRepeats >= 36 && maxRepeats <= 39) diagnose = "high risk";
        if (maxRepeats >= 40 && maxRepeats <= 180) diagnose = "Huntington's";
        return diagnose;
    }

    public static void main(String[] args)
    {
        In in = new In(args[0]);
        String s = in.readAll();
        String dna = removeWhitespace(s);
        //System.out.println(dna);
        int r = maxRepeats(dna);
        System.out.println("max repeats = " + r);
        System.out.println(diagnose(r));
    }

}