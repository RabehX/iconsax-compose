/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Filled.Car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.75f, 7.998f)
                curveTo(21.75f, 8.408f, 21.41f, 8.748f, 21f, 8.748f)
                horizontalLineTo(3f)
                curveTo(2.59f, 8.748f, 2.25f, 8.408f, 2.25f, 7.998f)
                curveTo(2.25f, 7.588f, 2.59f, 7.248f, 3f, 7.248f)
                horizontalLineTo(4.02f)
                lineTo(4.4f, 5.438f)
                curveTo(4.76f, 3.688f, 5.51f, 2.078f, 8.49f, 2.078f)
                horizontalLineTo(15.51f)
                curveTo(18.49f, 2.078f, 19.24f, 3.688f, 19.6f, 5.438f)
                lineTo(19.98f, 7.248f)
                horizontalLineTo(21f)
                curveTo(21.41f, 7.248f, 21.75f, 7.588f, 21.75f, 7.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.182f, 13.66f)
                curveTo(22.032f, 12.01f, 21.591f, 10.25f, 18.382f, 10.25f)
                horizontalLineTo(5.622f)
                curveTo(2.412f, 10.25f, 1.982f, 12.01f, 1.822f, 13.66f)
                lineTo(1.262f, 19.75f)
                curveTo(1.192f, 20.51f, 1.442f, 21.27f, 1.962f, 21.84f)
                curveTo(2.492f, 22.42f, 3.242f, 22.75f, 4.042f, 22.75f)
                horizontalLineTo(5.922f)
                curveTo(7.542f, 22.75f, 7.852f, 21.82f, 8.052f, 21.21f)
                lineTo(8.252f, 20.61f)
                curveTo(8.482f, 19.92f, 8.542f, 19.75f, 9.442f, 19.75f)
                horizontalLineTo(14.562f)
                curveTo(15.462f, 19.75f, 15.492f, 19.85f, 15.752f, 20.61f)
                lineTo(15.952f, 21.21f)
                curveTo(16.152f, 21.82f, 16.462f, 22.75f, 18.082f, 22.75f)
                horizontalLineTo(19.962f)
                curveTo(20.752f, 22.75f, 21.512f, 22.42f, 22.042f, 21.84f)
                curveTo(22.562f, 21.27f, 22.812f, 20.51f, 22.742f, 19.75f)
                lineTo(22.182f, 13.66f)
                close()
                moveTo(9.002f, 15.75f)
                horizontalLineTo(6.002f)
                curveTo(5.592f, 15.75f, 5.252f, 15.41f, 5.252f, 15f)
                curveTo(5.252f, 14.59f, 5.592f, 14.25f, 6.002f, 14.25f)
                horizontalLineTo(9.002f)
                curveTo(9.412f, 14.25f, 9.752f, 14.59f, 9.752f, 15f)
                curveTo(9.752f, 15.41f, 9.412f, 15.75f, 9.002f, 15.75f)
                close()
                moveTo(18.002f, 15.75f)
                horizontalLineTo(15.002f)
                curveTo(14.592f, 15.75f, 14.252f, 15.41f, 14.252f, 15f)
                curveTo(14.252f, 14.59f, 14.592f, 14.25f, 15.002f, 14.25f)
                horizontalLineTo(18.002f)
                curveTo(18.412f, 14.25f, 18.752f, 14.59f, 18.752f, 15f)
                curveTo(18.752f, 15.41f, 18.412f, 15.75f, 18.002f, 15.75f)
                close()
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
