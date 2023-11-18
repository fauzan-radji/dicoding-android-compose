package com.fauzan.jetheroes.data

import com.fauzan.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes() = HeroesData.heroes

    fun searchHeroes(query: String) = HeroesData.heroes.filter {
        it.name.contains(query, ignoreCase = true)
    }
}