package com.weeravit.proxumer.modules.home.presentation.banner

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.weeravit.proxumer.R
import com.weeravit.proxumer.modules.home.data.BannerModel
import kotlinx.android.synthetic.main.layout_banner.view.*

class BannerLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context)
            .inflate(R.layout.layout_banner, this, true)
        list_banner.adapter = BannerAdapter(arrayListOf())
    }

    fun setBanner(banner : BannerModel) {
        val adapter = list_banner.adapter as BannerAdapter

        text_title_banner.text = banner.title
        adapter.update(banner.images)
    }
}