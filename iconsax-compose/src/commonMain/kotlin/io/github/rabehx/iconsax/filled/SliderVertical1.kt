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


val Iconsax.Filled.SliderVertical1: ImageVector
    get() {
        if (_SliderVertical1 != null) {
            return _SliderVertical1!!
        }
        _SliderVertical1 = ImageVector.Builder(
            name = "Filled.SliderVertical1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.941f, 3.5f)
                horizontalLineTo(5.061f)
                curveTo(4.651f, 3.5f, 4.311f, 3.16f, 4.311f, 2.75f)
                curveTo(4.311f, 2.34f, 4.651f, 2f, 5.061f, 2f)
                horizontalLineTo(18.941f)
                curveTo(19.351f, 2f, 19.691f, 2.34f, 19.691f, 2.75f)
                curveTo(19.691f, 3.16f, 19.351f, 3.5f, 18.941f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.941f, 22f)
                horizontalLineTo(5.061f)
                curveTo(4.651f, 22f, 4.311f, 21.66f, 4.311f, 21.25f)
                curveTo(4.311f, 20.84f, 4.651f, 20.5f, 5.061f, 20.5f)
                horizontalLineTo(18.941f)
                curveTo(19.351f, 20.5f, 19.691f, 20.84f, 19.691f, 21.25f)
                curveTo(19.691f, 21.66f, 19.351f, 22f, 18.941f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 8f)
                verticalLineTo(16f)
                curveTo(2.75f, 17.66f, 4.09f, 19f, 5.75f, 19f)
                horizontalLineTo(18.25f)
                curveTo(19.91f, 19f, 21.25f, 17.66f, 21.25f, 16f)
                verticalLineTo(8f)
                curveTo(21.25f, 6.34f, 19.91f, 5f, 18.25f, 5f)
                horizontalLineTo(5.75f)
                curveTo(4.09f, 5f, 2.75f, 6.34f, 2.75f, 8f)
                close()
            }
        }.build()

        return _SliderVertical1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical1: ImageVector? = null
