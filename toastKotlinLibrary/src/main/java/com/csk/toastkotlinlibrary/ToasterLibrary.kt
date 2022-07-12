package com.csk.toastkotlinlibrary

import android.content.Context
import android.widget.Toast

class ToasterLibrary {
    fun useToastAnywhere(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}