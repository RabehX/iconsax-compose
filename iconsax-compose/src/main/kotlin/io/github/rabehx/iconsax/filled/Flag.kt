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


val Iconsax.Filled.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Filled.Flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.02f, 12.33f)
                lineTo(16.8f, 11.11f)
                curveTo(16.51f, 10.86f, 16.34f, 10.49f, 16.33f, 10.08f)
                curveTo(16.31f, 9.63f, 16.49f, 9.18f, 16.82f, 8.85f)
                lineTo(18.02f, 7.65f)
                curveTo(19.06f, 6.61f, 19.45f, 5.61f, 19.12f, 4.82f)
                curveTo(18.8f, 4.04f, 17.81f, 3.61f, 16.35f, 3.61f)
                horizontalLineTo(5.9f)
                verticalLineTo(2.75f)
                curveTo(5.9f, 2.34f, 5.56f, 2f, 5.15f, 2f)
                curveTo(4.74f, 2f, 4.4f, 2.34f, 4.4f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(4.4f, 21.66f, 4.74f, 22f, 5.15f, 22f)
                curveTo(5.56f, 22f, 5.9f, 21.66f, 5.9f, 21.25f)
                verticalLineTo(16.37f)
                horizontalLineTo(16.35f)
                curveTo(17.79f, 16.37f, 18.76f, 15.93f, 19.09f, 15.14f)
                curveTo(19.42f, 14.35f, 19.04f, 13.36f, 18.02f, 12.33f)
                close()
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
