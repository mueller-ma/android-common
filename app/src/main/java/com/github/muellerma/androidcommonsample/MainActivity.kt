package com.github.muellerma.androidcommonsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.muellerma.androidcommon.extensions.showToast
import com.github.muellerma.androidcommonsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toast.setOnClickListener { _ ->
            showToast("Foo")
        }
    }
}