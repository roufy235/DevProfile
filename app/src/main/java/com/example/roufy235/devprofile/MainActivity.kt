package com.example.roufy235.devprofile

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        var rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        //rounded.cornerRadius = 15f

        rounded.isCircular = true

        logo.setImageDrawable(rounded)
    }
}
