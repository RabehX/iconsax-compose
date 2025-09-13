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


val Iconsax.Filled.Hashtag1: ImageVector
    get() {
        if (_Hashtag1 != null) {
            return _Hashtag1!!
        }
        _Hashtag1 = ImageVector.Builder(
            name = "Filled.Hashtag1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.051f, 10.141f)
                verticalLineTo(11.301f)
                horizontalLineTo(11.311f)
                verticalLineTo(8.051f)
                horizontalLineTo(10.151f)
                curveTo(8.991f, 8.051f, 8.051f, 8.991f, 8.051f, 10.141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.051f, 13.859f)
                curveTo(8.051f, 15.009f, 8.991f, 15.949f, 10.141f, 15.949f)
                horizontalLineTo(11.301f)
                verticalLineTo(12.699f)
                horizontalLineTo(8.051f)
                verticalLineTo(13.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.699f, 15.949f)
                horizontalLineTo(13.859f)
                curveTo(15.009f, 15.949f, 15.949f, 15.009f, 15.949f, 13.859f)
                verticalLineTo(12.699f)
                horizontalLineTo(12.699f)
                verticalLineTo(15.949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(17.35f, 13.86f)
                curveTo(17.35f, 15.78f, 15.78f, 17.35f, 13.86f, 17.35f)
                horizontalLineTo(10.14f)
                curveTo(8.22f, 17.35f, 6.65f, 15.79f, 6.65f, 13.86f)
                verticalLineTo(10.14f)
                curveTo(6.65f, 8.22f, 8.22f, 6.65f, 10.14f, 6.65f)
                horizontalLineTo(13.86f)
                curveTo(15.78f, 6.65f, 17.35f, 8.21f, 17.35f, 10.14f)
                verticalLineTo(13.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.859f, 8.051f)
                horizontalLineTo(12.699f)
                verticalLineTo(11.311f)
                horizontalLineTo(15.959f)
                verticalLineTo(10.151f)
                curveTo(15.949f, 8.991f, 15.009f, 8.051f, 13.859f, 8.051f)
                close()
            }
        }.build()

        return _Hashtag1!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag1: ImageVector? = null
