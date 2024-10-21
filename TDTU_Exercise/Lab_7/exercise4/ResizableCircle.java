package exercise4;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(){
        super();
    }

    @Override
    public void resize(int percent) {
        this.radius = this.radius*percent/100;
    }
}
