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


val Iconsax.Filled.Next: ImageVector
    get() {
        if (_Next != null) {
            return _Next!!
        }
        _Next = ImageVector.Builder(
            name = "Filled.Next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.762f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(3.762f, 18.75f, 5.892f, 19.98f, 7.592f, 19f)
                lineTo(11.742f, 16.61f)
                lineTo(15.892f, 14.21f)
                curveTo(17.592f, 13.23f, 17.592f, 10.78f, 15.892f, 9.8f)
                lineTo(11.742f, 7.4f)
                lineTo(7.592f, 5.01f)
                curveTo(5.892f, 4.03f, 3.762f, 5.25f, 3.762f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.238f, 18.93f)
                curveTo(19.828f, 18.93f, 19.488f, 18.59f, 19.488f, 18.18f)
                verticalLineTo(5.82f)
                curveTo(19.488f, 5.41f, 19.828f, 5.07f, 20.238f, 5.07f)
                curveTo(20.648f, 5.07f, 20.988f, 5.41f, 20.988f, 5.82f)
                verticalLineTo(18.18f)
                curveTo(20.988f, 18.59f, 20.658f, 18.93f, 20.238f, 18.93f)
                close()
            }
        }.build()

        return _Next!!
    }

@Suppress("ObjectPropertyName")
private var _Next: ImageVector? = null
