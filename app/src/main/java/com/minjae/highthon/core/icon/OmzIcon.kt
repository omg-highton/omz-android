package com.minjae.highthon.core.icon

import com.minjae.highthon.R

object OmzIcon {

    fun Password(visible: Boolean) =
        if (visible) R.drawable.ic_password_visible else R.drawable.ic_password_invisible

    fun Good(state: Boolean) =
        if (state) R.drawable.ic_good_on else R.drawable.ic_good_off

    val Cancel = R.drawable.ic_cancel

    val File = R.drawable.ic_file_off

    val Message = R.drawable.ic_message

    val Back = R.drawable.ic_back_small

    val Plus = R.drawable.ic_plus

    val Edit = R.drawable.ic_edit

    val Notice = R.drawable.ic_notice

    val Profile = R.drawable.ic_profile
}
