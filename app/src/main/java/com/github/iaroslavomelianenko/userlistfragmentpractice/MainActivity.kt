package com.github.iaroslavomelianenko.userlistfragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.iaroslavomelianenko.userlistfragmentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}