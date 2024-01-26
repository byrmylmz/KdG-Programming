package Week7.ex07_04_point_equals_hashcode.point;

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
    
    public String toString() {
        return String.format("%s z: %d", super.toString(), z);
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Point3D)) {
            return false;
        }
        Point3D point = (Point3D) o;
        return super.equals(point) && z == point.z;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ z;
    }
}
