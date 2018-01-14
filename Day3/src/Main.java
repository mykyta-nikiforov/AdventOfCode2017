public class Main {

    public static void main(String[] args) {
        findDistance(347991);
    }

    public static void findDistance(int number){
        int beginingDegree = 0;
        int beginingNumber = 0;
        int endingDegree = 0;
        int endingNumber = 0;

        boolean foundSquares = false;
        for(int i=1; !foundSquares; i=i+2){
            if(number > i*i && number <= (i+2)*(i+2)){
                beginingDegree = i;
                beginingNumber = i*i;
                endingDegree = i+2;
                endingNumber = (i+2)*(i+2);
                foundSquares = true;
            }
        }

        int lengthOfSquareSide = endingDegree;
        int minDistance = lengthOfSquareSide/2;
        int maxDistance = lengthOfSquareSide-1;

        int result = 0;

        int absolute = (number-beginingNumber)%maxDistance;
        if(absolute<minDistance) result = maxDistance-absolute;
        else if(absolute>minDistance) result = absolute;
        else if(absolute==minDistance) result = minDistance;

        System.out.println("number: " + number);
        System.out.println("beginingDegree: " + beginingDegree);
        System.out.println("endingDegree: " + endingDegree);
        System.out.println("beginingNumber: " + beginingNumber);
        System.out.println("endingNumber: " + endingNumber);
        System.out.println("lengthOfSquareSide: " + lengthOfSquareSide);
        System.out.println("minDistance: " + minDistance);
        System.out.println("maxDistance: " + lengthOfSquareSide);
        System.out.println("absolute: " + absolute);
        System.out.println("result: " + result);
    }
}
