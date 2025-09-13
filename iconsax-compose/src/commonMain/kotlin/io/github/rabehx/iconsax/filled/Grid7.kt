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


val Iconsax.Filled.Grid7: ImageVector
    get() {
        if (_Grid7 != null) {
            return _Grid7!!
        }
        _Grid7 = ImageVector.Builder(
            name = "Filled.Grid7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 10.5f)
                verticalLineTo(22f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22f, 2f, 19.83f, 2f, 16.19f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.5f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.83f, 19.83f, 22f, 16.19f, 22f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.81f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2f, 22f, 4.17f, 22f, 7.81f)
                close()
            }
        }.build()

        return _Grid7!!
    }

@Suppress("ObjectPropertyName")
private var _Grid7: ImageVector? = null
