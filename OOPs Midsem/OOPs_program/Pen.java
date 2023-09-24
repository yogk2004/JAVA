package OOPs_program;

class Pen{
    String color; // Colour of the pen ink.
    String properties; //Ballpoint or gel point pen.
    String brand; // Company name of the pen.
    Pen(String color,String Properties, String brand){
        this.color = color;
        this.properties = Properties;
        this.brand = brand;
    }
    void printfunct(){
        System.out.println("The color of the pen is: "+color);
    }
}
