package com.atabouraya.videoinrecyclerview.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmed on 12/19/2015.
 */
public class UIUtils {
    private static int screenWidth = -1;

    // size to the
    // screen width
    @SuppressLint("NewApi")
    @SuppressWarnings("deprecation")
    public static int getScreenWidth(Activity activity) {

        if (screenWidth != -1)
            return screenWidth;
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();

        int width;
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentapiVersion >= android.os.Build.VERSION_CODES.HONEYCOMB_MR2) {
            display.getSize(size);
            width = size.x;
        } else {
            width = display.getWidth();

        }
        screenWidth = width;

        return width;
    }

    public static void resizeView(View view, int width, int height) {
        ViewGroup.LayoutParams layout = view.getLayoutParams();
        layout.width = width;
        layout.height = height;
        view.setLayoutParams(layout);
    }
}
