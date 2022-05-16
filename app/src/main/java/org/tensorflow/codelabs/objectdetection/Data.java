
package org.tensorflow.codelabs.objectdetection;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("bbdetectionAPICallTime")
    @Expose
    private Double bbdetectionAPICallTime;
    @SerializedName("bottom_right_x")
    @Expose
    private Integer bottomRightX;
    @SerializedName("bottom_right_y")
    @Expose
    private Integer bottomRightY;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("time_base64_decode")
    @Expose
    private String timeBase64Decode;
    @SerializedName("time_total_detection")
    @Expose
    private String timeTotalDetection;
    @SerializedName("top_left_x")
    @Expose
    private Integer topLeftX;
    @SerializedName("top_left_y")
    @Expose
    private Integer topLeftY;

    public Double getBbdetectionAPICallTime() {
        return bbdetectionAPICallTime;
    }

    public void setBbdetectionAPICallTime(Double bbdetectionAPICallTime) {
        this.bbdetectionAPICallTime = bbdetectionAPICallTime;
    }

    public Integer getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(Integer bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public Integer getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(Integer bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeBase64Decode() {
        return timeBase64Decode;
    }

    public void setTimeBase64Decode(String timeBase64Decode) {
        this.timeBase64Decode = timeBase64Decode;
    }

    public String getTimeTotalDetection() {
        return timeTotalDetection;
    }

    public void setTimeTotalDetection(String timeTotalDetection) {
        this.timeTotalDetection = timeTotalDetection;
    }

    public Integer getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
    }

    public Integer getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
    }

}
