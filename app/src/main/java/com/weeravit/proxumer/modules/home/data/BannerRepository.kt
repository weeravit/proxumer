package com.weeravit.proxumer.modules.home.data

import com.weeravit.proxumer.modules.home.data.BannerModel

interface BannerRepository {
    suspend fun getBannerList(): ArrayList<BannerModel>
}