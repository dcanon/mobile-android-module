package br.com.itau.domain.entity

import com.google.gson.annotations.SerializedName


data class Login(
    @SerializedName("usuario") val user: String,
    @SerializedName("senha") val password: String
)