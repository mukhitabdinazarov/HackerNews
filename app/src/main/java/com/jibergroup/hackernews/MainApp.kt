package com.jibergroup.hackernews

import android.app.Application
import com.jibergroup.hackernews.di.useCasesModule
import com.jibergroup.hackernews.di.viewModelsModule
import com.jibergroup.koinModule
import org.koin.core.context.startKoin

class MainApp : Application(){

    override fun onCreate() {
        super.onCreate()

        //add koin
        startKoin {
            modules(listOf(koinModule, viewModelsModule, useCasesModule))
        }


    }
}