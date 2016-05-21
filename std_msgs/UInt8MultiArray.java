package std_msgs;

public class UInt8MultiArray implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/UInt8MultiArray";
	public static final java.lang.String _DEFINITION = "# Please look at the MultiArrayLayout message definition for\n# documentation on all multiarrays.\n\nMultiArrayLayout  layout        # specification of data layout\nuint8[]           data          # array of data\n\n";
	public UInt8MultiArray() {}
	private std_msgs.MultiArrayLayout layout;
	public std_msgs.MultiArrayLayout getLayout() { return layout; }
	public void setLayout(std_msgs.MultiArrayLayout value) { layout = value; }
	private transient java.nio.ByteBuffer data=null;
	private byte[] bytesdata;
	public java.nio.ByteBuffer getData() { if( data != null ) return data; else data = java.nio.ByteBuffer.wrap(bytesdata); return data.order(java.nio.ByteOrder.LITTLE_ENDIAN); }
	public void setData(java.nio.ByteBuffer value) { data = value;  bytesdata = data.array(); }
}
