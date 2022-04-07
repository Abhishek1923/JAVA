class Operators{
    public static void main(String[] args) {
    	
        int number, num;
    	
        // Assigning 5 to number 
        number = 5;
        System.out.println(number);//5
    	    	
        // Assigning value of variable num to number
        num = number;
        System.out.println(num);//5

        double number1 = 12.5, number2 = 3.5, result;
        
        // Using addition operator
        result = number1 + number2;
        System.out.println("number1 + number2 = " + result);//16.0
        
        // Using subtraction operator
        result = number1 - number2;
        System.out.println("number1 - number2 = " + result);//9.0
        
        // Using multiplication operator
        result = number1 * number2;
        System.out.println("number1 * number2 = " + result);//43.75

        // Using division operator
        result = number1 / number2;
        System.out.println("number1 / number2 = " + result);//3.571.....
        
        // Using remainder operator
        result = number1 % number2;
        System.out.println("number1 % number2 = " + result);//2.0

        String start, middle, end, result1;
        
        start = "Talk ";
        middle = "About ";
        end = "- Linus ";
        
        result1 = start + middle + end;
        System.out.println(result1);//Talk About - Linux

        double number3 = 5.2;

        System.out.println(number3++);//5.2
        System.out.println(number3);//6.2

        System.out.println(++number3);//7.2
        System.out.println(number3);//7.2


        int number4 = 5, number5 = 6;

        if (number4 > number5) {
            System.out.println("number4 is greater than number5.");
        }
        else {
            System.out.println("number4 is greater than number5.");
        }//4>5


        int number6 = 12, number7 = 25, result2,result3,result4,result5;
        
        result2 = number6 | number7;
        System.out.println(result2);//29

        result3 = number6 & number7;
        System.out.println(result3);//8

        result4 = ~number;
        System.out.println(result4);//-6

        result5 = number6 ^ number7;
        System.out.println(result5);//21

        System.out.println(number << 1);//10
        System.out.println(number << 0);//5
        System.out.println(number << 4);//80

        System.out.println(number >> 1);//2
        System.out.println(number >> 0);//5
        System.out.println(number >> 8);//0

    }
}