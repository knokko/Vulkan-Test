package nl.knokko.test6;

import java.nio.ShortBuffer;

public class IndexBuffer {
	
	private final ShortBuffer buffer;
	
	public IndexBuffer(ShortBuffer backingBuffer) {
		buffer = backingBuffer;
	}
	
	/**
	 * The indices should be in counter-clockwise order!
	 * @param index1 The index of the first vertex
	 * @param index2 The index of the second vertex
	 * @param index3 The index of the third vertex
	 */
	public void bindTriangle(short index1, short index2, short index3) {
		buffer.put(index1);
		buffer.put(index2);
		buffer.put(index3);
	}
	
	/**
	 * The indices should be in counter-clockwise order!
	 * @param index1 The index of the first vertex
	 * @param index2 The index of the second vertex
	 * @param index3 The index of the third vertex
	 * @param index4 The index of the fourth vertex
	 */
	public void bindFourangle(short index1, short index2, short index3, short index4) {
		bindTriangle(index1, index2, index3);
		bindTriangle(index3, index4, index1);
	}
}
