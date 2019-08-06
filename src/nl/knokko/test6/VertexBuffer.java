package nl.knokko.test6;

import java.nio.FloatBuffer;

public class VertexBuffer {
	
	private final FloatBuffer buffer;
	
	private int vertexCount;
	
	public VertexBuffer(FloatBuffer backingBuffer) {
		this.buffer = backingBuffer;
	}
	
	/**
	 * Adds a vertex and returns its index
	 * @param x The x-coordinate of the vertex
	 * @param y The y-coordinate of the vertex
	 * @param z The z-coordinate of the vertex
	 * @param u The u texture coordinate of the vertex
	 * @param v The v texture coordinate of the vertex
	 * @return The index of the vertex that was added by this method
	 */
	public int add(float x, float y, float z, float u, float v) {
		buffer.put(x);
		buffer.put(y);
		buffer.put(z);
		buffer.put(u);
		buffer.put(v);
		return vertexCount++;
	}
	
	/**
	 * @return The index that would be assigned to the next vertex that will be added to this VertexBuffer
	 */
	public int getNextVertexIndex() {
		return vertexCount;
	}
}
