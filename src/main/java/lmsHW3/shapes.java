package lmsHW3;

public class shapes {


    interface shape {
        public double area();
    }


    class circle implements shape{

        int rad;

        circle(int radius){
            rad = radius;
        }


        @Override
        public double area() {
            return 3.14*rad*rad;
        }
    }

    class rectangle implements shape{

        int length,width;

        rectangle(int length,int width){
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length*width;
        }
    }

    class square implements shape{

        int length;

        square(int length){
            this.length = length;
        }

        @Override
        public double area() {
            return length*length;
        }
    }

}