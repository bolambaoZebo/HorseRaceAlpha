package com.horseracingtips.ui.channels

import android.content.Context
import android.view.View
import com.bumptech.glide.Glide
import com.horseracingtips.ENGLISH
import com.horseracingtips.R
import com.horseracingtips.data.db.entity.HorseVideo
import com.horseracingtips.databinding.ItemHorseVideoBinding
import com.horseracingtips.utils.getLocale
import com.xwray.groupie.viewbinding.BindableItem
import java.util.*

class HorseItem(
    private val horseVideo: HorseVideo,
    private val context: Context
) : BindableItem<ItemHorseVideoBinding>(){

    fun getText(): String? {
        return horseVideo.channel
    }

    override fun bind(viewBinding: ItemHorseVideoBinding, position: Int) {
        viewBinding.itemHorseTitle.text = horseVideo.title
        Glide.with(context).load(horseVideo.imageUrl).into(viewBinding.itemHorseImage)
//        viewBinding.itemHorseDescription.text = horseVideo.description
    }

    override fun getLayout(): Int = R.layout.item_horse_video
    override fun initializeViewBinding(view: View): ItemHorseVideoBinding = ItemHorseVideoBinding.bind(view)
}