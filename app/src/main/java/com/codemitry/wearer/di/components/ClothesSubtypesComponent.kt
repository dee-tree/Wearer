package com.codemitry.wearer.di.components

import com.codemitry.wearer.activities.ClothesSubtypesFragment
import com.codemitry.wearer.di.modules.ClothesSubtypesManagerModule
import com.codemitry.wearer.di.modules.ClothesSubtypesPresenterModule
import com.codemitry.wearer.mvp.contracts.clothessubtypes.ClothesSubtypesContract
import dagger.Component

@Component(modules = [ClothesSubtypesPresenterModule::class, ClothesSubtypesManagerModule::class])
interface ClothesSubtypesComponent {
    fun inject(activity: ClothesSubtypesFragment)

    fun presenter(): ClothesSubtypesContract.Presenter
}