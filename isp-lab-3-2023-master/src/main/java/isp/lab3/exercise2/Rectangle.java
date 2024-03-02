package isp.lab3.exercise2;

    public class Rectangle{
        private int length;
        private int width;
        private String color;
        public Rectangle(){
            this(2,1,"red");
        }
        public Rectangle(int length, int width){
            this.length=length;
            this.width=width;
        }
        public Rectangle(int i, int i1, String red) {
            this.length=i;
            this.width=i1;
            this.color=red;
        }
        public int getLength(){
            return this.length;
        }
        public int getWidth(){
            return this.width;
        }
        public String getColor(){
            return this.color;
        }
        public int getPerimeter(){
            return 2*(length+width);
        }
        public int getArea(){
            return length*width;
        }
        public static void main(String[] args){
            Rectangle r=new Rectangle(3,2,"purple");
            int length=r.getLength();
           int width= r.getWidth();
            String color=r.getColor();
            int perimeter=r.getPerimeter();
            int area=r.getArea();
            System.out.println(length);
            System.out.println(width);
            System.out.println(color);
            System.out.println(perimeter);
            System.out.println(area);
        }

    }

