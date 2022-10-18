package com.shirunjie.helloxrpico

import android.app.NativeActivity
import android.os.Bundle

class MainActivity : NativeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        init {
            // Note: Must handle loading of dependent shared libraries manually before
            // the shared library that depends on them is loaded, since there is not
            // currently a way to specify a shared library dependency for NativeActivity
            // via the manifest meta-data.
            System.loadLibrary("openxr_loader")
            System.loadLibrary("hello_xr")
        }
    }
}