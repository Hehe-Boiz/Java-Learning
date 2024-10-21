class Point2D{
    private float x;
    private float y;

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }
}

class Point3D extends Point2D{
    private float z ;
    
    public Point3D(){
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), this.z};
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + "]";
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        
    }
}
