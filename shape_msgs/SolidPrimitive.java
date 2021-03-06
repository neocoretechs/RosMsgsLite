package shape_msgs;

public class SolidPrimitive implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "shape_msgs/SolidPrimitive";
	public static final java.lang.String _DEFINITION = "# Define box, sphere, cylinder, cone \n# All shapes are defined to have their bounding boxes centered around 0,0,0.\n\nuint8 BOX=1\nuint8 SPHERE=2\nuint8 CYLINDER=3\nuint8 CONE=4\n\n# The type of the shape\nuint8 type\n\n\n# The dimensions of the shape\nfloat64[] dimensions\n\n# The meaning of the shape dimensions: each constant defines the index in the \'dimensions\' array\n\n# For the BOX type, the X, Y, and Z dimensions are the length of the corresponding\n# sides of the box.\nuint8 BOX_X=0\nuint8 BOX_Y=1\nuint8 BOX_Z=2\n\n\n# For the SPHERE type, only one component is used, and it gives the radius of\n# the sphere.\nuint8 SPHERE_RADIUS=0\n\n\n# For the CYLINDER and CONE types, the center line is oriented along\n# the Z axis.  Therefore the CYLINDER_HEIGHT (CONE_HEIGHT) component\n# of dimensions gives the height of the cylinder (cone).  The\n# CYLINDER_RADIUS (CONE_RADIUS) component of dimensions gives the\n# radius of the base of the cylinder (cone).  Cone and cylinder\n# primitives are defined to be circular. The tip of the cone is\n# pointing up, along +Z axis.\n\nuint8 CYLINDER_HEIGHT=0\nuint8 CYLINDER_RADIUS=1\n\nuint8 CONE_HEIGHT=0\nuint8 CONE_RADIUS=1\n";
	public SolidPrimitive() {}
	public static final byte BOX = 1;
	public static final byte SPHERE = 2;
	public static final byte CYLINDER = 3;
	public static final byte CONE = 4;
	public static final byte BOX_X = 0;
	public static final byte BOX_Y = 1;
	public static final byte BOX_Z = 2;
	public static final byte SPHERE_RADIUS = 0;
	public static final byte CYLINDER_HEIGHT = 0;
	public static final byte CYLINDER_RADIUS = 1;
	public static final byte CONE_HEIGHT = 0;
	public static final byte CONE_RADIUS = 1;
	private byte type;
	public byte getType() { return type; }
	public void setType(byte value) { type = value; }
	private double[] dimensions;
	public double[] getDimensions() { return dimensions; }
	public void setDimensions(double[] value) { dimensions = value; }
}
