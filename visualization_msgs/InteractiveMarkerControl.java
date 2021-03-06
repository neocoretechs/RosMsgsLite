package visualization_msgs;

public class InteractiveMarkerControl implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "visualization_msgs/InteractiveMarkerControl";
	public static final java.lang.String _DEFINITION = "# Represents a control that is to be displayed together with an interactive marker\n\n# Identifying string for this control.\n# You need to assign a unique value to this to receive feedback from the GUI\n# on what actions the user performs on this control (e.g. a button click).\nstring name\n\n\n# Defines the local coordinate frame (relative to the pose of the parent\n# interactive marker) in which is being rotated and translated.\n# Default: Identity\ngeometry_msgs/Quaternion orientation\n\n\n# Orientation mode: controls how orientation changes.\n# INHERIT: Follow orientation of interactive marker\n# FIXED: Keep orientation fixed at initial state\n# VIEW_FACING: Align y-z plane with screen (x: forward, y:left, z:up).\nuint8 INHERIT = 0 \nuint8 FIXED = 1\nuint8 VIEW_FACING = 2\n\nuint8 orientation_mode\n\n# Interaction mode for this control\n# \n# NONE: This control is only meant for visualization; no context menu.\n# MENU: Like NONE, but right-click menu is active.\n# BUTTON: Element can be left-clicked.\n# MOVE_AXIS: Translate along local x-axis.\n# MOVE_PLANE: Translate in local y-z plane.\n# ROTATE_AXIS: Rotate around local x-axis.\n# MOVE_ROTATE: Combines MOVE_PLANE and ROTATE_AXIS.\nuint8 NONE = 0 \nuint8 MENU = 1\nuint8 BUTTON = 2\nuint8 MOVE_AXIS = 3 \nuint8 MOVE_PLANE = 4\nuint8 ROTATE_AXIS = 5\nuint8 MOVE_ROTATE = 6\n# \"3D\" interaction modes work with the mouse+SHIFT+CTRL or with 3D cursors.\n# MOVE_3D: Translate freely in 3D space.\n# ROTATE_3D: Rotate freely in 3D space about the origin of parent frame.\n# MOVE_ROTATE_3D: Full 6-DOF freedom of translation and rotation about the cursor origin.\nuint8 MOVE_3D = 7\nuint8 ROTATE_3D = 8\nuint8 MOVE_ROTATE_3D = 9\n\nuint8 interaction_mode\n\n\n# If true, the contained markers will also be visible\n# when the gui is not in interactive mode.\nbool always_visible\n\n\n# Markers to be displayed as custom visual representation.\n# Leave this empty to use the default control handles.\n#\n# Note: \n# - The markers can be defined in an arbitrary coordinate frame,\n#   but will be transformed into the local frame of the interactive marker.\n# - If the header of a marker is empty, its pose will be interpreted as \n#   relative to the pose of the parent interactive marker.\nMarker[] markers\n\n\n# In VIEW_FACING mode, set this to true if you don\'t want the markers\n# to be aligned with the camera view point. The markers will show up\n# as in INHERIT mode.\nbool independent_marker_orientation\n\n\n# Short description (< 40 characters) of what this control does,\n# e.g. \"Move the robot\". \n# Default: A generic description based on the interaction mode\nstring description\n";
	public InteractiveMarkerControl() {}
	public static final byte INHERIT = 0;
	public static final byte FIXED = 1;
	public static final byte VIEW_FACING = 2;
	public static final byte NONE = 0;
	public static final byte MENU = 1;
	public static final byte BUTTON = 2;
	public static final byte MOVE_AXIS = 3;
	public static final byte MOVE_PLANE = 4;
	public static final byte ROTATE_AXIS = 5;
	public static final byte MOVE_ROTATE = 6;
	public static final byte MOVE_3D = 7;
	public static final byte ROTATE_3D = 8;
	public static final byte MOVE_ROTATE_3D = 9;
	private java.lang.String name;
	public java.lang.String getName() { return name; }
	public void setName(java.lang.String value) { name = value; }
	private geometry_msgs.Quaternion orientation;
	public geometry_msgs.Quaternion getOrientation() { return orientation; }
	public void setOrientation(geometry_msgs.Quaternion value) { orientation = value; }
	private byte orientation_mode;
	public byte getOrientationMode() { return orientation_mode; }
	public void setOrientationMode(byte value) { orientation_mode = value; }
	private byte interaction_mode;
	public byte getInteractionMode() { return interaction_mode; }
	public void setInteractionMode(byte value) { interaction_mode = value; }
	private boolean always_visible;
	public boolean getAlwaysVisible() { return always_visible; }
	public void setAlwaysVisible(boolean value) { always_visible = value; }
	private java.util.List<visualization_msgs.Marker> markers;
	public java.util.List<visualization_msgs.Marker> getMarkers() { return markers; }
	public void setMarkers(java.util.List<visualization_msgs.Marker> value) { markers = value; }
	private boolean independent_marker_orientation;
	public boolean getIndependentMarkerOrientation() { return independent_marker_orientation; }
	public void setIndependentMarkerOrientation(boolean value) { independent_marker_orientation = value; }
	private java.lang.String description;
	public java.lang.String getDescription() { return description; }
	public void setDescription(java.lang.String value) { description = value; }
}
