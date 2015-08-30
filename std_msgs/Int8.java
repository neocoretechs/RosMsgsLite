package std_msgs;

public class Int8 implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Int8";
	public static final java.lang.String _DEFINITION = "int8 data\n";
	public Int8() {}
	private byte data;
	public byte getData() { return data; }
	public void setData(byte value) { data = value; }
}
