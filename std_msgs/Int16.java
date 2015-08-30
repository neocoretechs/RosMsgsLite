package std_msgs;

public class Int16 implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Int16";
	public static final java.lang.String _DEFINITION = "int16 data\n";
	public Int16() {}
	private short data;
	public short getData() { return data; }
	public void setData(short value) { data = value; }
}
