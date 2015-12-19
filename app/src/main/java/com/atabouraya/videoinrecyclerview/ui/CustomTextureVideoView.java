package com.atabouraya.videoinrecyclerview.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.sprylab.android.widget.TextureVideoView;

/**
 * Created by Ahmed on 11/12/2015.
 */
public class CustomTextureVideoView extends TextureVideoView {
    String videoPath;
    boolean isPrepared;

    public CustomTextureVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextureVideoView(Context context) {
        super(context);
    }

    public CustomTextureVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public void setVideoPath(String path) {
        super.setVideoPath(path);
        videoPath = path;
    }


    public void setIsPrepared(boolean prepared) {
        isPrepared = prepared;
    }

    public boolean isPrepared() {
        return isPrepared;
    }

    public String getVideoPath() {
        return videoPath;
    }
}
