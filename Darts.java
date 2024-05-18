package org.limon;

public class Darts {
    int score(double xOfDart, double yOfDart) {
        double innerCircleRadius = 1;
        double middleCircleRadius = 5;
        double outerCircleRadius = 10;
        double calculateXofDart = Math.pow(xOfDart, 2);
        double calculateYofDart = Math.pow(yOfDart, 2);
        double resultRadius = Math.sqrt(calculateXofDart + calculateYofDart);

        if (resultRadius <= innerCircleRadius) {
            return 10;
        }else if (resultRadius > innerCircleRadius && resultRadius <= middleCircleRadius) {
            return 5;
        } else if (resultRadius > middleCircleRadius && resultRadius <= outerCircleRadius) {
            return 1;
        } else {
            return 0;
        }
    }
}
