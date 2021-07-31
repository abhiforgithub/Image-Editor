package com.example.imageeditorapp



internal interface CropImageViewContract {
    fun interface View {
        fun setOptions(options: OptionsDomain)
    }

    interface Presenter {
        fun bind(view: View)
        fun unbind()
        fun onViewCreated()
    }
}
