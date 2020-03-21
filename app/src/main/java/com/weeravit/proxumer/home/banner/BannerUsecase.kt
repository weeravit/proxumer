package com.weeravit.proxumer.home.banner

class BannerUsecase(private val repository: BannerRepository) {
    suspend fun getBannerList() = repository.getBannerList()
}