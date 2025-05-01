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


val Iconsax.Filled.Frame1: ImageVector
    get() {
        if (_Frame1 != null) {
            return _Frame1!!
        }
        _Frame1 = ImageVector.Builder(
            name = "Filled.Frame1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.41f, 6.961f)
                verticalLineTo(8.791f)
                curveTo(20.41f, 9.431f, 20.11f, 10.031f, 19.59f, 10.401f)
                lineTo(8.59f, 18.461f)
                curveTo(7.88f, 18.981f, 6.91f, 18.981f, 6.21f, 18.451f)
                lineTo(4.77f, 17.371f)
                curveTo(4.12f, 16.881f, 3.59f, 15.821f, 3.59f, 15.011f)
                verticalLineTo(6.961f)
                curveTo(3.59f, 5.841f, 4.45f, 4.601f, 5.5f, 4.211f)
                lineTo(10.97f, 2.161f)
                curveTo(11.54f, 1.951f, 12.46f, 1.951f, 13.03f, 2.161f)
                lineTo(18.5f, 4.211f)
                curveTo(19.55f, 4.601f, 20.41f, 5.841f, 20.41f, 6.961f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.822f, 12.341f)
                curveTo(19.482f, 11.861f, 20.412f, 12.331f, 20.412f, 13.151f)
                verticalLineTo(15.031f)
                curveTo(20.412f, 15.841f, 19.882f, 16.891f, 19.232f, 17.381f)
                lineTo(13.762f, 21.471f)
                curveTo(13.282f, 21.821f, 12.642f, 22.001f, 12.002f, 22.001f)
                curveTo(11.362f, 22.001f, 10.722f, 21.821f, 10.242f, 21.461f)
                lineTo(9.412f, 20.841f)
                curveTo(8.872f, 20.441f, 8.872f, 19.631f, 9.422f, 19.231f)
                lineTo(18.822f, 12.341f)
                close()
            }
        }.build()

        return _Frame1!!
    }

@Suppress("ObjectPropertyName")
private var _Frame1: ImageVector? = null
