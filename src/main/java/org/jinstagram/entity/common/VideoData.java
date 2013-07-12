package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the VideoData.
 *
 * @author Pâmela Oliveira
 * @version 1.0
 */
public class VideoData {

	@SerializedName("height")
	private int videoHeight;

	@SerializedName("url")
	private String videoUrl;

	@SerializedName("width")
	private int videoWidth;

	public int getVideoHeight() {
		return videoHeight;
	}

	public void setVideoHeight(int videoHeight) {
		this.videoHeight = videoHeight;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public int getVideoWidth() {
		return videoWidth;
	}

	public void setVideoWidth(int videoWidth) {
		this.videoWidth = videoWidth;
	}
	
	@Override
    public String toString() {
        return String.format("VideoData [videoHeight=%s, videoUrl=%s, videoWidth=%s]",
                videoHeight, videoUrl, videoWidth);
    }
}
