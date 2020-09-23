public class Birthday
{

    public static void main(String[] args)
    {

        int days = Integer.parseInt(args[0]);  // days of the people
        int trails = Integer.parseInt(args[1]);
        int[] counter = new int[days+2];
        double fraction = 0.0;
        counter[0] = 0;

        System.out.println(1 + " " + 0 + " " + fraction);

        int k = 1;

        while (fraction < 0.5)
        {

            counter[k] = 0;
            for (int i = 0; i < trails; i++)
            {
                //  hasBirthday[d] = true if someone born on day d; false otherwise
                boolean[] hasBirthday = new boolean[days];

                int  people = 0;
                while (true)
                {
                    people++;                               // one more person enters the room
                    int d = (int) (days * Math.random());   // integer between 0 and days-1
                    if (hasBirthday[d]) break;              // found two people with the same birthday
                    hasBirthday[d] = true;                  // update array
                }

                if (people == k+1)
                {
                    counter[k]++;
                }
            }
            fraction = fraction + (double) counter[k]/trails;
            System.out.println(k + 1 + "\t" + counter[k] + "\t" + fraction);
            k++;

        }

    }
}
