package std_msgs;

public class ColorRGBA implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/ColorRGBA";
	public static final java.lang.String _DEFINITION = "float32 r\nfloat32 g\nfloat32 b\nfloat32 a\n";
	public ColorRGBA() {}
	private float r;
	public float getR() { return r; }
	public void setR(float value) { r = value; }
	private float g;
	public float getG() { return g; }
	public void setG(float value) { g = value; }
	private float b;
	public float getB() { return b; }
	public void setB(float value) { b = value; }
	private float a;
	public float getA() { return a; }
	public void setA(float value) { a = value; }
}
