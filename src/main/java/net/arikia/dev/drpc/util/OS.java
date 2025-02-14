package net.arikia.dev.drpc.util;

/**
 * @author DeJay
 * @version 1.6.1
 * <p>
 * Class containing utils for detecting the user's OS.
 */
public final class OS {

	public boolean isMac() {
		return getOS().toLowerCase()
				.startsWith("mac");
	}

	public boolean isWindows() {
		return getOS().toLowerCase()
				.startsWith("win");
	}

	public String getOS() {
		return System.getProperty("os.name").toLowerCase();
	}

}