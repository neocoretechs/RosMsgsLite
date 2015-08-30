package std_msgs;

public class ByteMultiArray implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/ByteMultiArray";
	public static final java.lang.String _DEFINITION = "# Please look at the MultiArrayLayout message definition for\n# documentation on all multiarrays.\n\nMultiArrayLayout  layout        # specification of data layout\nbyte[]            data          # array of data\n\n";
	public ByteMultiArray() {}
	private std_msgs.MultiArrayLayout layout;
	public std_msgs.MultiArrayLayout getLayout() { return layout; }
	public void setLayout(std_msgs.MultiArrayLayout value) { layout = value; }
	private transient org.jboss.netty.buffer.ChannelBuffer data;
	public org.jboss.netty.buffer.ChannelBuffer getData() { return data; }
	public void setData(org.jboss.netty.buffer.ChannelBuffer value) { data = value; }
}
