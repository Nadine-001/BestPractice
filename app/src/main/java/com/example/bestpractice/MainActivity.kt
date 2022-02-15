package com.example.bestpractice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHIm4LxETg5gle10-UbAPuxgs9Cr4-r30RWg&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnueMRhTbtj4P3lItFUyX8BPp2sL6AhonV5Q&usqp=CAU"))
        imageList.add(SlideModel("https://asset.kompas.com/crops/bX-MXTXMxgWNWM_j6eyyzQfVMh0=/147x71:947x605/750x500/data/photo/2017/09/08/3890175217.jpg"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRJTqGBbZWLq5Sp4Z-rEaPPn2zm70XkxuzBg&usqp=CAU"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        menu1.setOnClickListener(this)
        menu2.setOnClickListener(this)
        menu3.setOnClickListener(this)
        menu4.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.menu1 -> {
                val intentMenu1 = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intentMenu1)
            }
            R.id.menu2 -> {
                val intentMenu2 = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intentMenu2)
            }
            R.id.menu3 -> {
                val intentMenu3 = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intentMenu3)
            }
            R.id.menu4 -> {
                val intentMenu4 = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intentMenu4)
            }
        }
    }
}