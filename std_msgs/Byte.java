package std_msgs;

public class Byte implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Byte";
	public static final java.lang.String _DEFINITION = "byte data\n";
	public Byte() {}
	private byte data;
	public byte getData() { return data; }
	public void setData(byte value) { data = value; }
}
