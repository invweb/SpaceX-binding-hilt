package com.spacex.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.spacex.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_activity)
    }
}
