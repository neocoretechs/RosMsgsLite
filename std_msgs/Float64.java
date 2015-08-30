package std_msgs;

public class Float64 implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Float64";
	public static final java.lang.String _DEFINITION = "float64 data";
	public Float64() {}
	private double data;
	public double getData() { return data; }
	public void setData(double value) { data = value; }
}
