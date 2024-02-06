package oopOdev02;

public class migratoryBirds {

    public static void main(String[] args) {

        int[] birds = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
        int mostBirs = 0;

        int firstBird=0, secondBird=0,thirdBird=0, fourthBird=0, fifthBird=0;

        for (int i = 0; i < birds.length; i++){
            if (birds[i]==1)
                firstBird++;
            else if (birds[i]==2) 
                secondBird++;
            else if (birds[i]==3)
                thirdBird++;
            else if (birds[i]==4)
                fourthBird++;
            else if (birds[i]==5)
                fifthBird++;
            
        }if (firstBird>secondBird && firstBird>thirdBird && firstBird>fourthBird && firstBird>fifthBird )
            System.out.println("en çok olan kuş " + firstBird);
        else if (secondBird>firstBird && secondBird>thirdBird && secondBird>fourthBird && secondBird>fifthBird)
            System.out.println("en çok olan kuş " + secondBird);
        else if (thirdBird>firstBird && thirdBird>secondBird && thirdBird>fourthBird && thirdBird>fifthBird)
            System.out.println("en çok olan kuş " + thirdBird);
        else if (fourthBird>firstBird && fourthBird>secondBird && fourthBird>thirdBird && fourthBird>fifthBird)
            System.out.println("en çok olan kuş " + fourthBird);
        else if (fifthBird>firstBird && fifthBird>secondBird && fifthBird>thirdBird && fifthBird>fourthBird)
            System.out.println("en çok olan kuş " + fifthBird);
        }


    }
