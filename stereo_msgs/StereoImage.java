package stereo_msgs;
/**
 * Manually generated test case for eventual retrofit of messages for inheritance
 * @author jg 2018
 *
 */
public class StereoImage implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "stereo_msgs/StereoImage";
	public static final java.lang.String _DEFINITION = "# This message contains 2 images accessable by set/getData and set/getData2\n# (0, 0) is at top-left corner of image\n#\n\nHeader header        # Header timestamp should be acquisition time of image\n                     # Header frame_id should be optical frame of camera\n                     # origin of frame should be optical center of cameara\n                     # +x should point to the right in the image\n                     # +y should point down in the image\n                     # +z should point into to plane of the image\n                     # If the frame_id here and the frame_id of the CameraInfo\n                     # message associated with the image conflict\n                     # the behavior is undefined\n\nuint32 height         # image height, that is, number of rows\nuint32 width          # image width, that is, number of columns\n\n# The legal values for encoding are in file src/image_encodings.cpp\n# If you want to standardize a new string format, join\n# ros-users@lists.sourceforge.net and send an email proposing a new encoding.\n\nstring encoding       # Encoding of pixels -- channel meaning, ordering, size\n                      # taken from the list of strings in include/sensor_msgs/image_encodings.h\n\nuint8 is_bigendian    # is this data bigendian?\nuint32 step           # Full row length in bytes\nuint8[] data          # actual matrix data, size is (step * rows)\n";
	public StereoImage() { super(); }
	private transient java.nio.ByteBuffer data=null;
	private byte[] bytesdata;
	public java.nio.ByteBuffer getData() { if( data != null ) return data; else data = java.nio.ByteBuffer.wrap(bytesdata); return data.order(java.nio.ByteOrder.LITTLE_ENDIAN); }
	public void setData(java.nio.ByteBuffer value) { data = value;  bytesdata = data.array(); }
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private int height;
	public int getHeight() { return height; }
	public void setHeight(int value) { height = value; }
	private int width;
	public int getWidth() { return width; }
	public void setWidth(int value) { width = value; }
	private java.lang.String encoding;
	public java.lang.String getEncoding() { return encoding; }
	public void setEncoding(java.lang.String value) { encoding = value; }
	private byte is_bigendian;
	public byte getIsBigendian() { return is_bigendian; }
	public void setIsBigendian(byte value) { is_bigendian = value; }
	private int step;
	public int getStep() { return step; }
	public void setStep(int value) { step = value; }
	private transient java.nio.ByteBuffer data2=null;
	private byte[] bytesdata2;
	public java.nio.ByteBuffer getData2() { if( data2 != null ) return data2; else data2 = java.nio.ByteBuffer.wrap(bytesdata2); return data2.order(java.nio.ByteOrder.LITTLE_ENDIAN); }
	public void setData2(java.nio.ByteBuffer value) { data2 = value;  bytesdata2 = data2.array(); }
}
