package com.weeravit.proxumer.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration


class GridSpacesItemDecoration(
    private val context: Context,
    @DimenRes private val dimenRes: Int
) :
    ItemDecoration() {
    private val spacingInPixels by lazy {
        context.resources.getDimension(dimenRes).toInt()
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = spacingInPixels
        outRect.right = spacingInPixels
        outRect.bottom = spacingInPixels

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildLayoutPosition(view) == 0) {
            outRect.top = spacingInPixels
        } else {
            outRect.top = 0
        }
    }
}