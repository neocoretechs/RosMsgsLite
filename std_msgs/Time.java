package std_msgs;

public class Time implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Time";
	public static final java.lang.String _DEFINITION = "time data\n";
	public Time() {}
	private org.ros.message.Time data;
	public org.ros.message.Time getData() { return data; }
	public void setData(org.ros.message.Time value) { data = value; }
}
