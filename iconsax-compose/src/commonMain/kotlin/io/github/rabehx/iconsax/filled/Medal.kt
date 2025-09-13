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


val Iconsax.Filled.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Filled.Medal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15f)
                curveTo(15.728f, 15f, 18.75f, 12.09f, 18.75f, 8.5f)
                curveTo(18.75f, 4.91f, 15.728f, 2f, 12f, 2f)
                curveTo(8.272f, 2f, 5.25f, 4.91f, 5.25f, 8.5f)
                curveTo(5.25f, 12.09f, 8.272f, 15f, 12f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.79f, 15.609f)
                curveTo(16.12f, 15.439f, 16.5f, 15.689f, 16.5f, 16.059f)
                verticalLineTo(20.909f)
                curveTo(16.5f, 21.809f, 15.87f, 22.249f, 15.09f, 21.879f)
                lineTo(12.41f, 20.609f)
                curveTo(12.18f, 20.509f, 11.82f, 20.509f, 11.59f, 20.609f)
                lineTo(8.91f, 21.879f)
                curveTo(8.13f, 22.239f, 7.5f, 21.799f, 7.5f, 20.899f)
                lineTo(7.52f, 16.059f)
                curveTo(7.52f, 15.689f, 7.91f, 15.449f, 8.23f, 15.609f)
                curveTo(9.36f, 16.179f, 10.64f, 16.499f, 12f, 16.499f)
                curveTo(13.36f, 16.499f, 14.65f, 16.179f, 15.79f, 15.609f)
                close()
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
