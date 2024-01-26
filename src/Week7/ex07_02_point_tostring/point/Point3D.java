package Week7.ex07_02_point_tostring.point;

public class Point3D extends Point {
    private int z;
    
    public Point3D() {
    }
    
    public Point3D(int x, int y, int z) {
        super(x, y);
        setZ(z);
    }
    
    public int getZ() {
        return z;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    
//    public String toString() {
//        return String.format("%s z: %d", super.toString(), z);
//    }

    public String toString(){
        return String.format("%s z: %d",super.toString(),getZ());
    }


}
