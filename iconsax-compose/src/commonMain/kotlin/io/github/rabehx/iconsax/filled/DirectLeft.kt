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


val Iconsax.Filled.DirectLeft: ImageVector
    get() {
        if (_DirectLeft != null) {
            return _DirectLeft!!
        }
        _DirectLeft = ImageVector.Builder(
            name = "Filled.DirectLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.292f, 17.022f)
                lineTo(19.552f, 13.542f)
                curveTo(19.072f, 12.572f, 19.072f, 11.442f, 19.552f, 10.472f)
                lineTo(21.292f, 6.992f)
                curveTo(22.782f, 4.002f, 19.572f, 0.862f, 16.622f, 2.422f)
                lineTo(15.082f, 3.242f)
                curveTo(14.872f, 3.352f, 14.702f, 3.532f, 14.602f, 3.752f)
                lineTo(8.902f, 16.392f)
                curveTo(8.672f, 16.912f, 8.882f, 17.522f, 9.382f, 17.782f)
                lineTo(16.622f, 21.592f)
                curveTo(19.572f, 23.152f, 22.782f, 20.002f, 21.292f, 17.022f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.69f, 15.6f)
                lineTo(11.42f, 7.32f)
                curveTo(11.84f, 6.39f, 10.84f, 5.45f, 9.94f, 5.93f)
                lineTo(4.17f, 8.96f)
                curveTo(1.72f, 10.25f, 1.72f, 13.75f, 4.17f, 15.04f)
                lineTo(6.21f, 16.11f)
                curveTo(6.76f, 16.4f, 7.43f, 16.17f, 7.69f, 15.6f)
                close()
            }
        }.build()

        return _DirectLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DirectLeft: ImageVector? = null
