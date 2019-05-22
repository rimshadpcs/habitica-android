package com.habitrpg.android.habitica.extensions

import android.content.DialogInterface
import com.habitrpg.android.habitica.R
import com.habitrpg.android.habitica.ui.views.HabiticaAlertDialog

fun HabiticaAlertDialog.addOkButton(isPrimary: Boolean = true, listener: ((HabiticaAlertDialog, Int) -> Unit)? = null) {
    this.addButton(R.string.ok, isPrimary, listener)
}

fun HabiticaAlertDialog.addCloseButton(isPrimary: Boolean = false, listener: ((DialogInterface, Int) -> Unit)? = null) {
    this.addButton(R.string.close, isPrimary, listener)
}

fun HabiticaAlertDialog.addCancelButton(isPrimary: Boolean = false, listener: ((DialogInterface, Int) -> Unit)? = null) {
    this.addButton(R.string.cancel, isPrimary, listener)
}