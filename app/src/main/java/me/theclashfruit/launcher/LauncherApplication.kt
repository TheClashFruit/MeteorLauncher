package me.theclashfruit.launcher

import android.app.Application
import com.google.android.material.color.DynamicColors

class LauncherApplication : Application() {
    override fun onCreate() {
        DynamicColors.applyToActivitiesIfAvailable(this)

        super.onCreate()
    }
}