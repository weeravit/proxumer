package com.weeravit.proxumer.modules.home.data

import com.weeravit.proxumer.modules.home.data.BannerModel
import com.weeravit.proxumer.modules.home.data.BannerRepository
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FakeBannerDatasource :
    BannerRepository {
    override suspend fun getBannerList(): ArrayList<BannerModel> = suspendCoroutine { coroutine ->
        val bestOfferBanner =
            BannerModel(
                title = "Best Offer",
                images = arrayListOf(
                    "https://cdn.urldecoder.org/assets/images/url-fb.png",
                    "https://cdn.urldecoder.org/assets/images/url-fb.png",
                    "https://cdn.urldecoder.org/assets/images/url-fb.png",
                    "https://cdn.urldecoder.org/assets/images/url-fb.png"
                )
            )
        val suggestForYou = BannerModel(
            title = "Suggest for you",
            images = arrayListOf(
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png"
            )
        )
        val bannerList = arrayListOf(bestOfferBanner, suggestForYou)
        coroutine.resume(bannerList)
    }
}