package com.example.osmanyrodriguez.machinelearningstep1;

import android.content.Context;


import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CameraView extends SurfaceView implements SurfaceHolder.Callback2{

    private SurfaceHolder mSurfaceHolder;
    private CameraDevice cameraDevice;
    private CameraCaptureSession cameraCaptureSessions;

    public CameraView(Context context, CameraDevice cameraDevice) {
        super(context);

        this.cameraDevice = cameraDevice;

    }

    @Override
    public void surfaceRedrawNeeded(SurfaceHolder holder) {
        this.mSurfaceHolder = holder;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
