package nl.knokko.test;

import java.nio.ByteBuffer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.vulkan.VK11;

public class BaseTest {

	public static void main(String[] args) {
		GLFW.glfwInit();
		GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_NO_API);
		long window = GLFW.glfwCreateWindow(800, 600, "Vulkan window", MemoryUtil.NULL, MemoryUtil.NULL);
		
		// Set -1 as default value to distinguish between 0 supported extensions and a failed call
		int[] extensionCount = {-1};
		VK11.vkEnumerateInstanceExtensionProperties((ByteBuffer) null, extensionCount, null);
		System.out.println("Number of supported extensions is " + extensionCount[0]);
		
		while (!GLFW.glfwWindowShouldClose(window)) {
			GLFW.glfwPollEvents();
		}
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
	}

}
