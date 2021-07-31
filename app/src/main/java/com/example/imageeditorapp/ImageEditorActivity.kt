package com.example.imageeditorapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.imageeditorapp.databinding.ActivityImageEditorBinding


class ImageEditorActivity : AppCompatActivity() {



    lateinit var binding: ActivityImageEditorBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityImageEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sampleCropImageView.setOnClickListener {
            hideButtons(binding)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, CropImageViewFragment.newInstance())
                .commit()
        }





    }



    private fun hideButtons(binding: ActivityImageEditorBinding) {
        binding.image.visibility = View.GONE
        binding.buttons.visibility = View.GONE
    }
}