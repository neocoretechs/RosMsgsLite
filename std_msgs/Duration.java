package std_msgs;

public class Duration implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Duration";
	public static final java.lang.String _DEFINITION = "duration data\n";
	public Duration() {}
	private org.ros.message.Duration data;
	public org.ros.message.Duration getData() { return data; }
	public void setData(org.ros.message.Duration value) { data = value; }
}
