package com.gondev.todolist.security.oauth2.user

class NaverOAuth2UserInfo(attributes: MutableMap<String, Any>) : OAuth2UserInfo(attributes) {

    override val id: String
        get() = attributes["id"].toString()

    override val name: String
        get() = attributes["name"] as String

    override val email: String
        get() = attributes["email"] as String

    override val imageUrl: String
        get() = attributes["profile_image"] as String
}
