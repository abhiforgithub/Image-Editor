package com.example.imageeditorapp

import com.example.imageeditorapp.CropImageView
import com.example.imageeditorapp.CropImageViewContract
import com.example.imageeditorapp.OptionsDomain

internal class CropImageViewPresenter : CropImageViewContract.Presenter {

    private var view: CropImageViewContract.View? = null

    override fun bind(view: CropImageViewContract.View) {
        this.view = view
    }

    override fun unbind() {
        view = null
    }

    override fun onViewCreated() {
        view?.setOptions(getOptions())
    }

    private fun getOptions(): OptionsDomain = OptionsDomain(
        CropImageView.ScaleType.FIT_CENTER,
        CropImageView.CropShape.RECTANGLE,
        CropImageView.Guidelines.ON,
        Pair(1, 1),
        autoZoom = true,
        maxZoomLvl = 2,
        multiTouch = true,
        centerMove = true,
        showCropOverlay = true,
        showProgressBar = true,
        flipHorizontal = false,
        flipVertically = false
    )
}
