package std_msgs;

public class UInt8 implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/UInt8";
	public static final java.lang.String _DEFINITION = "uint8 data\n";
	public UInt8() {}
	private byte data;
	public byte getData() { return data; }
	public void setData(byte value) { data = value; }
}
