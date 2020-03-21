package com.weeravit.proxumer.home.banner

import com.weeravit.proxumer.home.banner.BannerModel

interface BannerRepository {
    suspend fun getBannerList(): ArrayList<BannerModel>
}