package com.example.imageeditorapp

import com.example.imageeditorapp.CropImageView.CropShape
import com.example.imageeditorapp.CropImageView.Guidelines
import com.example.imageeditorapp.CropImageView.ScaleType

internal interface OptionsContract {

    interface View {
        fun updateOptions(options: OptionsDomain)
        fun closeWithResult(options: OptionsDomain)
    }

    interface Presenter {
        fun bind(view: View)
        fun unbind()
        fun onViewCreated(options: OptionsDomain?)
        fun onDismiss()
        fun onScaleTypeSelect(scaleType: ScaleType)
        fun onCropShapeSelect(cropShape: CropShape)
        fun onGuidelinesSelect(guidelines: Guidelines)
        fun onRatioSelect(ratio: Pair<Int, Int>?)
        fun onAutoZoomSelect(enable: Boolean)
        fun onMaxZoomLvlSelect(maxZoom: Int)
        fun onMultiTouchSelect(enable: Boolean)
        fun onCenterMoveSelect(enable: Boolean)
        fun onCropOverlaySelect(show: Boolean)
        fun onProgressBarSelect(show: Boolean)
        fun onFlipHorizontalSelect(enable: Boolean)
        fun onFlipVerticallySelect(enable: Boolean)
    }
}
