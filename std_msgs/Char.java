package std_msgs;

public class Char implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Char";
	public static final java.lang.String _DEFINITION = "char data";
	public Char() {}
	private byte data;
	public byte getData() { return data; }
	public void setData(byte value) { data = value; }
}
