package com.weeravit.proxumer.modules.home.domain

import com.weeravit.proxumer.modules.home.data.BannerRepository

class BannerUsecase(private val repository: BannerRepository) {
    suspend fun getBannerList() = repository.getBannerList()
}