package visualization_msgs;

public class InteractiveMarkerUpdate implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "visualization_msgs/InteractiveMarkerUpdate";
	public static final java.lang.String _DEFINITION = "# Identifying string. Must be unique in the topic namespace\n# that this server works on.\nstring server_id\n\n# Sequence number.\n# The client will use this to detect if it has missed an update.\nuint64 seq_num\n\n# Type holds the purpose of this message.  It must be one of UPDATE or KEEP_ALIVE.\n# UPDATE: Incremental update to previous state. \n#         The sequence number must be 1 higher than for\n#         the previous update.\n# KEEP_ALIVE: Indicates the that the server is still living.\n#             The sequence number does not increase.\n#             No payload data should be filled out (markers, poses, or erases).\nuint8 KEEP_ALIVE = 0\nuint8 UPDATE = 1\n\nuint8 type\n\n#Note: No guarantees on the order of processing.\n#      Contents must be kept consistent by sender.\n\n#Markers to be added or updated\nInteractiveMarker[] markers\n\n#Poses of markers that should be moved\nInteractiveMarkerPose[] poses\n\n#Names of markers to be erased\nstring[] erases\n";
	public InteractiveMarkerUpdate() {}
	public static final byte KEEP_ALIVE = 0;
	public static final byte UPDATE = 1;
	private java.lang.String server_id;
	public java.lang.String getServerId() { return server_id; }
	public void setServerId(java.lang.String value) { server_id = value; }
	private long seq_num;
	public long getSeqNum() { return seq_num; }
	public void setSeqNum(long value) { seq_num = value; }
	private byte type;
	public byte getType() { return type; }
	public void setType(byte value) { type = value; }
	private java.util.List<visualization_msgs.InteractiveMarker> markers;
	public java.util.List<visualization_msgs.InteractiveMarker> getMarkers() { return markers; }
	public void setMarkers(java.util.List<visualization_msgs.InteractiveMarker> value) { markers = value; }
	private java.util.List<visualization_msgs.InteractiveMarkerPose> poses;
	public java.util.List<visualization_msgs.InteractiveMarkerPose> getPoses() { return poses; }
	public void setPoses(java.util.List<visualization_msgs.InteractiveMarkerPose> value) { poses = value; }
	private java.util.List<java.lang.String> erases;
	public java.util.List<java.lang.String> getErases() { return erases; }
	public void setErases(java.util.List<java.lang.String> value) { erases = value; }
}
