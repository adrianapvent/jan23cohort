public class DayOne {
    public static void main(String[] args) {
        System.out.println("What's Up JAVA");

        //Data Types
        int age = 31;
        double altAge = 27.5;
        System.out.println(age);
        System.out.println(altAge);

        // public void createArrayList() {
        //         ArrayList<String> flavors = new ArrayList<>();
        //         flavors.add("chocolate");
        //         flavors.add("chocolate chip");
        //         flavors.add("oreo");
        //         flavors.add("strawberry");

        //         for (String flavor : flavors){
        //             System.out.println(flavor);
        //         }
        //     }

        int n = 100;

            // loop for 100 times
            for (int i=1; i<=n; i++)                                
            {
                //number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number
                if (i%15==0)                                                
                    System.out.println("FizzBuzz");
                // number divisible by 5, print 'Buzz'
                // in place of the number
                else if (i%5==0)    
                    System.out.println("Buzz");
    
                // number divisible by 3, print 'Fizz'
                // in place of the number
                else if (i%3==0)    
                    System.out.println("Fizz");

                else // print the numbers
                    System.out.println(i);
            }

            int[] array = {1, 2, 3, 4, 5};

            for (int element: array) {
            System.out.println(element);
    }
    }
}


    // divisible by 3 print fizz
    // divisible by 5 print buzz
    // divisible by both print fizz buzz
    // else just print the number
//     static void fizzBuzz(i) {
//         {
//             int n = 100;

//             // loop for 100 times
//             for (int i=1; i<=n; i++)                                
//             {
//                 //number divisible by 15(divisible by
//                 // both 3 & 5), print 'FizzBuzz' in
//                 // place of the number
//                 if (i%15==0)                                                
//                     System.out.println("FizzBuzz");
//                 // number divisible by 5, print 'Buzz'
//                 // in place of the number
//                 else if (i%5==0)    
//                     System.out.println("Buzz");
    
//                 // number divisible by 3, print 'Fizz'
//                 // in place of the number
//                 else if (i%3==0)    
//                     System.out.println("Fizz");

//                 else // print the numbers
//                     System.out.println(i);                        
//             }
//         }
//     }
// }
//  public static void main(String[] args) 

 