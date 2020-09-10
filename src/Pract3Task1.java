public class Pract3Task1 {

    public static class Circle{
        private float radius, centerX, centerY;

        public Circle(){}

        public Circle(float radius,float centerX,float centerY){
            this.radius=radius;
            this.centerX=centerX;
            this.centerY=centerY;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public void setCenterX(float centerX) {
            this.centerX = centerX;
        }

        public void setCenterY(float centerY) {
            this.centerY = centerY;
        }

        public float getRadius() {
            return radius;
        }

        public float getCenterX() {
            return centerX;
        }

        public float getCenterY() {
            return centerY;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", centerX=" + centerX +
                    ", centerY=" + centerY +
                    '}';
        }
    }

    public static void main(String[]args){
        Circle [] CircleArr=new Circle[2];

        CircleArr[0]=new Circle(10, (float) 2.5,0);
        System.out.println("Radius"+CircleArr[0].getRadius());
        System.out.println("CenterXCoordinate"+CircleArr[0].getCenterX());
        System.out.println("CenterYCoordinate"+CircleArr[0].getCenterY());


        CircleArr[1]=new Circle();
        CircleArr[1].setRadius(100);
        CircleArr[1].setCenterX(3);
        CircleArr[1].setCenterY((float)2.5);
        System.out.println(CircleArr[0].toString());
        System.out.println(CircleArr[1].toString());

    }
}
