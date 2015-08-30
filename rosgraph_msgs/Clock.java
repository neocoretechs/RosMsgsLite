package rosgraph_msgs;

public class Clock implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "rosgraph_msgs/Clock";
	public static final java.lang.String _DEFINITION = "# roslib/Clock is used for publishing simulated time in ROS. \n# This message simply communicates the current time.\n# For more information, see http://www.ros.org/wiki/Clock\ntime clock\n";
	public Clock() {}
	private org.ros.message.Time clock;
	public org.ros.message.Time getClock() { return clock; }
	public void setClock(org.ros.message.Time value) { clock = value; }
}
