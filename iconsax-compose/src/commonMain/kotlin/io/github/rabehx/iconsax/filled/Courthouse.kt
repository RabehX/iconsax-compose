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


val Iconsax.Filled.Courthouse: ImageVector
    get() {
        if (_Courthouse != null) {
            return _Courthouse!!
        }
        _Courthouse = ImageVector.Builder(
            name = "Filled.Courthouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.251f)
                horizontalLineTo(20.75f)
                verticalLineTo(11.001f)
                curveTo(20.75f, 8.581f, 19.42f, 7.251f, 17f, 7.251f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.021f)
                curveTo(13.33f, 6.161f, 13.91f, 6.241f, 14.5f, 6.241f)
                curveTo(15.44f, 6.241f, 16.38f, 6.061f, 17.28f, 5.701f)
                curveTo(17.56f, 5.591f, 17.75f, 5.311f, 17.75f, 5.001f)
                verticalLineTo(2.001f)
                curveTo(17.75f, 1.751f, 17.63f, 1.521f, 17.42f, 1.381f)
                curveTo(17.21f, 1.241f, 16.95f, 1.211f, 16.72f, 1.301f)
                curveTo(15.29f, 1.871f, 13.71f, 1.871f, 12.28f, 1.301f)
                curveTo(12.05f, 1.211f, 11.79f, 1.241f, 11.58f, 1.381f)
                curveTo(11.37f, 1.521f, 11.25f, 1.751f, 11.25f, 2.001f)
                verticalLineTo(5.001f)
                verticalLineTo(7.251f)
                horizontalLineTo(7f)
                curveTo(4.58f, 7.251f, 3.25f, 8.581f, 3.25f, 11.001f)
                verticalLineTo(21.251f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.251f, 1.25f, 21.591f, 1.25f, 22.001f)
                curveTo(1.25f, 22.411f, 1.59f, 22.751f, 2f, 22.751f)
                horizontalLineTo(4f)
                horizontalLineTo(20f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.751f, 22.75f, 22.411f, 22.75f, 22.001f)
                curveTo(22.75f, 21.591f, 22.41f, 21.251f, 22f, 21.251f)
                close()
                moveTo(7.24f, 21.251f)
                horizontalLineTo(4.75f)
                verticalLineTo(12.751f)
                horizontalLineTo(7.24f)
                verticalLineTo(21.251f)
                close()
                moveTo(11.24f, 21.251f)
                horizontalLineTo(8.74f)
                verticalLineTo(12.751f)
                horizontalLineTo(11.24f)
                verticalLineTo(21.251f)
                close()
                moveTo(15.24f, 21.251f)
                horizontalLineTo(12.74f)
                verticalLineTo(12.751f)
                horizontalLineTo(15.24f)
                verticalLineTo(21.251f)
                close()
                moveTo(19.25f, 21.251f)
                horizontalLineTo(16.74f)
                verticalLineTo(12.751f)
                horizontalLineTo(19.25f)
                verticalLineTo(21.251f)
                close()
            }
        }.build()

        return _Courthouse!!
    }

@Suppress("ObjectPropertyName")
private var _Courthouse: ImageVector? = null
