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


val Iconsax.Filled.Flash: ImageVector
    get() {
        if (_Flash != null) {
            return _Flash!!
        }
        _Flash = ImageVector.Builder(
            name = "Filled.Flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.32f, 13.281f)
                horizontalLineTo(12.41f)
                verticalLineTo(20.481f)
                curveTo(12.41f, 21.541f, 13.73f, 22.041f, 14.43f, 21.241f)
                lineTo(22f, 12.641f)
                curveTo(22.66f, 11.891f, 22.13f, 10.721f, 21.13f, 10.721f)
                horizontalLineTo(18.04f)
                verticalLineTo(3.521f)
                curveTo(18.04f, 2.461f, 16.72f, 1.961f, 16.02f, 2.761f)
                lineTo(8.45f, 11.361f)
                curveTo(7.8f, 12.111f, 8.33f, 13.281f, 9.32f, 13.281f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 4.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 4.75f, 0.75f, 4.41f, 0.75f, 4f)
                curveTo(0.75f, 3.59f, 1.09f, 3.25f, 1.5f, 3.25f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 3.25f, 9.25f, 3.59f, 9.25f, 4f)
                curveTo(9.25f, 4.41f, 8.91f, 4.75f, 8.5f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 20.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 20.75f, 0.75f, 20.41f, 0.75f, 20f)
                curveTo(0.75f, 19.59f, 1.09f, 19.25f, 1.5f, 19.25f)
                horizontalLineTo(7.5f)
                curveTo(7.91f, 19.25f, 8.25f, 19.59f, 8.25f, 20f)
                curveTo(8.25f, 20.41f, 7.91f, 20.75f, 7.5f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 12.75f)
                horizontalLineTo(1.5f)
                curveTo(1.09f, 12.75f, 0.75f, 12.41f, 0.75f, 12f)
                curveTo(0.75f, 11.59f, 1.09f, 11.25f, 1.5f, 11.25f)
                horizontalLineTo(4.5f)
                curveTo(4.91f, 11.25f, 5.25f, 11.59f, 5.25f, 12f)
                curveTo(5.25f, 12.41f, 4.91f, 12.75f, 4.5f, 12.75f)
                close()
            }
        }.build()

        return _Flash!!
    }

@Suppress("ObjectPropertyName")
private var _Flash: ImageVector? = null
