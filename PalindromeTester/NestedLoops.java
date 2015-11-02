public class NestedLoops
{
    public static void nestedForLoops()
    {
        /*
         * 1 1
         * 1 2
         * 1 3
         * 1 4
         * 2 1
         * 2 2
         * 2 3
         * 2 4
         */

         for( int leftCol = 1;
         leftCol <= 2;
         leftCol++ )
         {
             for( int rightCol = 1;
             rightCol <= 4;
             rightCol++ )
             {
                 System.out.println( leftCol + " " + rightCol );
                }
            }   
        }

    public static void nestedWhileLoops()
    {
        /*
         * 1 1
         * 1 2
         * 1 3
         * 1 4
         * 2 1
         * 2 2
         * 2 3
         * 2 4
         */

        int leftCol = 1;
        while( leftCol <= 2 )
        {
            int rightCol = 1;
            while( rightCol <= 4 )
            {
                System.out.println( leftCol + " " + rightCol );
                rightCol++;
            }

            leftCol++;
        }
    }

    public static void nestedDoLoops()
    {
        /*
         * 1 1
         * 1 2
         * 1 3
         * 1 4
         * 2 1
         * 2 2
         * 2 3
         * 2 4
         */

        int leftCol = 1;
        do
        {
            int rightCol = 1;
            do
            {
                System.out.println( leftCol + " " + rightCol );
                rightCol++;
            }   
            while( rightCol <= 4 );

            leftCol++;
        }
        while( leftCol <= 2 );
    }

}