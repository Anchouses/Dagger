package com.silaeva.dagger.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

//    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//    val mouse: Mouse = DaggerNewComponent.create().getMouse()
//    val monitor: Monitor = DaggerNewComponent.create().getMonitor()
}

