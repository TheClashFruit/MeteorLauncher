package me.theclashfruit.launcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.theclashfruit.launcher.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            binding  = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root

        setContentView(rootView)
    }
}