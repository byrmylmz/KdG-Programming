package Week5.ex03box;

public class BoxDemo {
    public static void main(String[] args) {
        Box cube = new Box("Cube", 10);
        System.out.println(cube);

        Box flat = new Box("Flat box", 30, 30, 3.5);
        System.out.println(flat);

        Box parcel = new Box("Parcel Service box", 30.5, 21.5, 17.0);
        System.out.println(parcel);
    }
}

	/* TODO: write the Box class so that this output is produced by running this program
Type: Cube
Length: 10,0cm
Width: 10,0cm
Hieght: 10,0cm
Surface: 600,0cm²
Volume: 1000,0cm³
Minimum tapelength: 40,0cm

Type: Flat box
Length: 30,0cm
Width: 30,0cm
Hieght: 3,5cm
Surface: 2220,0cm²
Volume: 3150,0cm³
Minimum tapelength: 67,0cm

Type: Parcel Service box
Length: 30,5cm
Width: 21,5cm
Hieght: 17,0cm
Surface: 3079,5cm²
Volume: 11147,8cm³
Minimum tapelength: 77,0cm
 */