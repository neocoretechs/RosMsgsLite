package std_msgs;

public class Bool implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Bool";
	public static final java.lang.String _DEFINITION = "bool data";
	public Bool() {}
	private boolean data;
	public boolean getData() { return data; }
	public void setData(boolean value) { data = value; }
}
