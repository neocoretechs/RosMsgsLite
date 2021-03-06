package sensor_msgs;

public class JointState implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/JointState";
	public static final java.lang.String _DEFINITION = "# This is a message that holds data to describe the state of a set of torque controlled joints. \n#\n# The state of each joint (revolute or prismatic) is defined by:\n#  * the position of the joint (rad or m),\n#  * the velocity of the joint (rad/s or m/s) and \n#  * the effort that is applied in the joint (Nm or N).\n#\n# Each joint is uniquely identified by its name\n# The header specifies the time at which the joint states were recorded. All the joint states\n# in one message have to be recorded at the same time.\n#\n# This message consists of a multiple arrays, one for each part of the joint state. \n# The goal is to make each of the fields optional. When e.g. your joints have no\n# effort associated with them, you can leave the effort array empty. \n#\n# All arrays in this message should have the same size, or be empty.\n# This is the only way to uniquely associate the joint name with the correct\n# states.\n\n\nHeader header\n\nstring[] name\nfloat64[] position\nfloat64[] velocity\nfloat64[] effort\n";
	public JointState() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<java.lang.String> name;
	public java.util.List<java.lang.String> getName() { return name; }
	public void setName(java.util.List<java.lang.String> value) { name = value; }
	private double[] position;
	public double[] getPosition() { return position; }
	public void setPosition(double[] value) { position = value; }
	private double[] velocity;
	public double[] getVelocity() { return velocity; }
	public void setVelocity(double[] value) { velocity = value; }
	private double[] effort;
	public double[] getEffort() { return effort; }
	public void setEffort(double[] value) { effort = value; }
}
